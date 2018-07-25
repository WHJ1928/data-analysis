package com.whj.spider.service;

import com.whj.spider.dao.WeiboInfo;
import com.whj.spider.dto.BaseResDto;
import com.whj.spider.dao.Username;
import com.whj.spider.mapper.WeiboMapper;
import com.whj.spider.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import weibo4j.Users;
import weibo4j.Weibo;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.User;
import weibo4j.model.WeiboException;
import weibo4j.org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author wanghaijun
 * @date 2018/7/24
 * @desc
 */
@Service
public class GetDataService extends Weibo{

    @Autowired
    private WeiboMapper weiboMapper;

    @Value("${access_token}")
    String access_token;
    /**
     * 根据用户名获取用户信息
     *
     * @return User
     * @throws WeiboException
     */
    public BaseResDto<JSONObject> queryUserByScreenName() throws WeiboException{
        List<Username> userList = weiboMapper.selectUserName();
        List<List<Username>> list = ListUtil.split(userList,20);
        for (List<Username> usernameList:list){
            for (Username username :usernameList){
                String screen_name =username.getUsername();
                User user = showUserByScreenName(screen_name);
                WeiboInfo weiboInfo = userToWeiboInfo(user);
                weiboMapper.insertSelective(weiboInfo);
            }
        }
        BaseResDto baseResDto = BaseResDto.createResult(BaseResDto.SUCCESS,BaseResDto.SUC_MSG);
        return baseResDto;
    }

    /**
     * 调用微博API
     * @param screen_name
     * @return
     * @throws WeiboException
     */
    private User showUserByScreenName(String screen_name) throws WeiboException{
        Users users = new Users(access_token);
        try {
            User user = users.showUserByScreenName(screen_name);
            return user;
        } catch (WeiboException var5) {
            var5.printStackTrace();
            return null;
        }
    }

    /**
     * user转WeiboInfo
     * @param user
     * @return
     */
    private WeiboInfo userToWeiboInfo(User user){
        WeiboInfo weiboInfo = new WeiboInfo();
        weiboInfo.setUserid(user.getId());
        weiboInfo.setRegistrationtime(getDate(user.getCreatedAt()));
        return weiboInfo;
    }

    public static String getDate(Date parse){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String dateStr = dateFormat.format(parse);
        return dateStr;
    }
}
