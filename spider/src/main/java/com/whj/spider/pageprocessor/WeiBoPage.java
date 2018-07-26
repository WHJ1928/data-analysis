package com.whj.spider.pageprocessor;

import com.whj.spider.dao.WeiboInfo;
import com.whj.spider.mapper.WeiboMapper;
import com.whj.spider.util.ProxyGeneratedUtil;
import com.whj.spider.util.UserAgentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author wanghaijun
 * @date 2018/7/25
 * @desc
 */
public class WeiBoPage implements PageProcessor{

    @Autowired
    private WeiboMapper weiboMapper;

    public static final String URL_USER = "https://weibo\\.com/\\d+";
    //讯代理订单号
    private static final String ORDER_NUM = "ZF201710169692T66jkr";
    //讯代理密码
    private static final String SECRET = "3b23ace31a2447baa44d624e9c5fd0f5";

    //抓取网站的相关配置，包括编码、抓取间隔、重试次数、代理、UserAgent等
    private Site site = Site.me()
            //设置代理
            .addHeader("Proxy-Authorization", ProxyGeneratedUtil.authHeader(ORDER_NUM, SECRET, (int) (System.currentTimeMillis()/1000)))
            .setDisableCookieManagement(true)
            .setCharset("UTF-8")
            .setTimeOut(30000)
            .setRetryTimes(3)
            .setSleepTime(new Random().nextInt(20)*100)
            .setUserAgent(UserAgentUtil.getRandomUserAgent());

    @Override
    public void process(Page page) {
        //用户页
        if (page.getUrl().regex(URL_USER).match()) {
            crawlUser(page);
        }
    }

    public List<String> getUserId(){
        List<String> strings = weiboMapper.selectUserId();
        return strings;
    }

    @Override
    public Site getSite() {
        return site;
    }

    /**
     * 抓取各用户主页
     * @param page 当前页面对象
     */
    private void crawlUser(Page page) {
        //用户名
        String name = page.getHtml().xpath("//div[@itemprop='name']/text()").toString();
        //用户所在地
        String address = page.getHtml().xpath("//div[@class='personalinfo']//span[@itemprop='address']/text()").toString();
        //用户主队
        String homeTeam = page.getHtml().xpath("//div[@class='personalinfo']//span[@itemprop='affiliation'][1]/a/text()").toString();
        //用户性别
        String gender = page.getHtml().xpath("//div[@class='personalinfo']//span[@itemprop='gender']/text()").toString();
        //用户被访问量
        int views = Integer.parseInt(page.getHtml().xpath("//div[@class='personal']//span[@class='f666'][1]/text()").toString().replaceAll("[^0-9]", ""));

        setUser(name, address, homeTeam, gender, views, page);
    }

    /**
     * 将抓取到的用户信息user传给pipeline进行后续处理
     * @param name 用户名
     * @param address 所在地
     * @param homeTeam NBA主队
     * @param gender 性别
     * @param views 用户主页访问量
     * @param page 当前页面对象
     */
    private void setUser(String name, String address, String homeTeam, String gender, int views, Page page) {
        WeiboInfo user = new WeiboInfo();
        user.setUserid(name);
        user.setAddress(address);
        user.setHomeTeam(homeTeam);
        user.setGender(gender);
        user.setViews(views);
        page.putField("userInfo", user);
    }
}
