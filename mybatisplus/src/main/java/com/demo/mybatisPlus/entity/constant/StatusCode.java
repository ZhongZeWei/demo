package com.demo.mybatisPlus.entity.constant;

/**
 * 状态码常量
 */
public class StatusCode {

    public static final Integer OK = 20000; //成功
    public static final Integer ERROR = 20001; //失败
    public static final Integer USER_PASS_ERROR = 20002; //用户名或者密码错误
    public static final Integer ACCESS_ERROR = 20003; //权限不足
    public static final Integer REMOTE_ERROR = 20004; //远程调用失败
    public static final Integer REPEAT_ERROR = 20005; //重复操作

}
