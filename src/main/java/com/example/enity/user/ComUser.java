package com.example.enity.user;

import java.util.Date;

import com.example.enity.BaseEntity;

/**
 * Created by MXL on 2017/9/1 0001.
 */
public class ComUser extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private String oidUserId; // 用户ID
    private String mobile; // 手机号
    private String email; // EMAIL(个人或机构邮箱)
    private String userPwd; // 用户登录密码
    private String userPwdStrength; // 用户登录密码强度
    private String userPayPwd; // 用户支付密码
    private int loginTimes = 1; // 登录次数
    private int loginErrorTimes = 0; // 连续错误登录次数
    private String lastLoginIp; // 最后登录IP
    private Date lastLoginDate; // 最后登录时间
    private String weiboUid; // 新浪微博uid
    private String qqUid; // 腾讯uid
    private String wechatUid; // 微信UID
    private String userType; // 用户类型：个人，企业

    public String getOidUserId () {
        return oidUserId;
    }

    public void setOidUserId ( String oidUserId ) {
        this.oidUserId = oidUserId;
    }

    public String getMobile () {
        return mobile;
    }

    public void setMobile ( String mobile ) {
        this.mobile = mobile;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public String getUserPwd () {
        return userPwd;
    }

    public void setUserPwd ( String userPwd ) {
        this.userPwd = userPwd;
    }

    public String getUserPwdStrength () {
        return userPwdStrength;
    }

    public void setUserPwdStrength ( String userPwdStrength ) {
        this.userPwdStrength = userPwdStrength;
    }

    public String getUserPayPwd () {
        return userPayPwd;
    }

    public void setUserPayPwd ( String userPayPwd ) {
        this.userPayPwd = userPayPwd;
    }

    public int getLoginTimes () {
        return loginTimes;
    }

    public void setLoginTimes ( int loginTimes ) {
        this.loginTimes = loginTimes;
    }

    public int getLoginErrorTimes () {
        return loginErrorTimes;
    }

    public void setLoginErrorTimes ( int loginErrorTimes ) {
        this.loginErrorTimes = loginErrorTimes;
    }

    public String getLastLoginIp () {
        return lastLoginIp;
    }

    public void setLastLoginIp ( String lastLoginIp ) {
        this.lastLoginIp = lastLoginIp;
    }

    public Date getLastLoginDate () {
        return lastLoginDate;
    }

    public void setLastLoginDate ( Date lastLoginDate ) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getWeiboUid () {
        return weiboUid;
    }

    public void setWeiboUid ( String weiboUid ) {
        this.weiboUid = weiboUid;
    }

    public String getQqUid () {
        return qqUid;
    }

    public void setQqUid ( String qqUid ) {
        this.qqUid = qqUid;
    }

    public String getWechatUid () {
        return wechatUid;
    }

    public void setWechatUid ( String wechatUid ) {
        this.wechatUid = wechatUid;
    }

    public String getUserType () {
        return userType;
    }

    public void setUserType ( String userType ) {
        this.userType = userType;
    }


}
