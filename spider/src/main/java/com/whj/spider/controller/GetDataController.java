package com.whj.spider.controller;

import com.whj.spider.dto.BaseResDto;
import com.whj.spider.service.GetDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import weibo4j.Weibo;
import weibo4j.model.WeiboException;
import weibo4j.org.json.JSONObject;

/**
 * @author wanghaijun
 * @date 2018/7/24
 * @desc
 */
@RestController
public class GetDataController{

    @Autowired
    private GetDataService getDataService;

    @RequestMapping(value = "/query/userinfo", method = RequestMethod.GET)
    public BaseResDto<JSONObject> showUserByScreenName() throws WeiboException{
        return getDataService.queryUserByScreenName();
    }
}
