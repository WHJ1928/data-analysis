package com.whj.spider.mapper;

import com.whj.spider.dao.WeiboInfo;
import com.whj.spider.dao.WeiboExample;

import java.util.List;

import com.whj.spider.dao.Username;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface WeiboMapper {
    int countByExample(WeiboExample example);

    int deleteByExample(WeiboExample example);

    int insert(WeiboInfo record);

    int insertSelective(WeiboInfo record);

    List<WeiboInfo> selectByExample(WeiboExample example);

    int updateByExampleSelective(@Param("record") WeiboInfo record, @Param("example") WeiboExample example);

    int updateByExample(@Param("record") WeiboInfo record, @Param("example") WeiboExample example);

    @Select("SELECT t.USERNAME FROM weibo t")
    List<Username> selectUserName();
}