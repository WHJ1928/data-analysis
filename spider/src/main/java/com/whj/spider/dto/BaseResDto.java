package com.whj.spider.dto;

import java.io.Serializable;

/**
 * @author wanghaijun
 * @date 2018/6/28
 * @desc
 */
public class BaseResDto<T> implements Serializable{

    /**
     * 成功
     */
    public final static String SUCCESS = "U0000";
    /**
     * 注册成功
     */
    public final static String SUC_REGISTER = "U0001";
    /**
     * 登录成功
     */
    public final static String SUC_LOGIN = "U0002";
    /**
     * 失败
     */
    public final static String FAIL = "U1000";
    /**
     * 注册失败
     */
    public final static String FAIL_REGISTER = "U1001";
    /**
     * 登录失败
     */
    public final static String FAIL_LOGIN = "U1002";
    /**
     * 用户名错误
     */
    public final static String FAIL_USERNAME_ERROR = "U2000";
    /**
     * 登录密码错误
     */
    public final static String FAIL_PSW_ERROR = "U2001";
    /**
     * 用户已锁定，禁止登录
     */
    public final static String FAIL_USER_PROHIBIT_LOGIN = "U2003";

    public final static String SUC_MSG = "成功";
    public final static String SUC_REGISTER_MSG = "注册成功";
    public static final String SUC_EXISTED_MSG = "该用户已存在，请您登录";
    public final static String SUC_LOGIN_MSG = "登录成功";
    public static final String SUC_NOT_USER_MSG = "用户不存在";
    public final static String FAIL_MSG = "失败";
    public final static String FAIL_REGISTER_MSG = "注册失败";
    public final static String FAIL_LOGIN_MSG = "登录失败";
    public final static String FAIL_USER_PROHIBIT_MSG = "用户已锁定,禁止登录";
    public final static String FAIL_PASSWORD_ERROR_MSG = "登录密码错误";
    public final static String FAIL_ERROR_MSG = "用户名或密码错误";
    public final static String FAIL_PSW_SAME_MSG = "新密码与旧密码不能相同";

    /**
     * 结果编码
     */
    private String resultCode;

    /**
     * 描述信息
     */
    private String resultMsg;

    /**
     * 业务数据
     */
    private T t;

    /**
     * 生成结果的方法
     *
     * @return
     */
    public static BaseResDto createResult(String code, String message) {
        BaseResDto baseResDto = new BaseResDto();
        baseResDto.setResultCode(code);
        baseResDto.setResultMsg(message);
        return baseResDto;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
