package com.whj.spider.dao;

public class WeiboInfo {
    private String userid;

    private String username;

    //粉丝数
    private Integer fansnum;

    //博客数
    private Integer blognum;

    //原创博客数
    private Integer originalblognum;

    //关注数
    private Integer follownum;

    //主页
    private String homelink;

    //注册时间
    private String registrationtime;

    //微博认证
    private String blogauthenticate;

    //行业类别
    private String industry;

    private String bci;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getFansnum() {
        return fansnum;
    }

    public void setFansnum(Integer fansnum) {
        this.fansnum = fansnum;
    }

    public Integer getBlognum() {
        return blognum;
    }

    public void setBlognum(Integer blognum) {
        this.blognum = blognum;
    }

    public Integer getOriginalblognum() {
        return originalblognum;
    }

    public void setOriginalblognum(Integer originalblognum) {
        this.originalblognum = originalblognum;
    }

    public Integer getFollownum() {
        return follownum;
    }

    public void setFollownum(Integer follownum) {
        this.follownum = follownum;
    }

    public String getHomelink() {
        return homelink;
    }

    public void setHomelink(String homelink) {
        this.homelink = homelink == null ? null : homelink.trim();
    }

    public String getRegistrationtime() {
        return registrationtime;
    }

    public void setRegistrationtime(String registrationtime) {
        this.registrationtime = registrationtime;
    }

    public String getBlogauthenticate() {
        return blogauthenticate;
    }

    public void setBlogauthenticate(String blogauthenticate) {
        this.blogauthenticate = blogauthenticate == null ? null : blogauthenticate.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getBci() {
        return bci;
    }

    public void setBci(String bci) {
        this.bci = bci == null ? null : bci.trim();
    }
}