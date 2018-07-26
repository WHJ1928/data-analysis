package com.whj.spider.service;

import com.alibaba.fastjson.JSONPObject;
import com.whj.spider.dao.WeiboInfo;
import com.whj.spider.dao.Username;
import com.whj.spider.mapper.WeiboMapper;
import com.whj.spider.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author wanghaijun
 * @date 2018/7/24
 * @desc
 */
@Service
public class GetDataService {

    @Autowired
    private WeiboMapper weiboMapper;

    /**
     * 根据用户名获取用户信息
     *
     * @return User
     */
    public User queryUserByScreenName(){
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

    public static void main(String[] args) {
        String access_token = "2.001rdKnFU4jl7Efd58fc5dbf5SdkQC";
        for (String screen_name:strings){
            Users um = new Users(access_token);
            try {
                User user = um.showUserByScreenName(screen_name);
                Log.logInfo(user.toString());
            } catch (WeiboException e) {
                e.printStackTrace();
            }
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
