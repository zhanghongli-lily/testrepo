package com.tmoney.utils;

import com.sun.xml.xsom.impl.scd.Iterators;

import java.util.List;

/*
url: /caizhi_web_manage/#/login
   method: get
   requestParam:
       -
       username: lily
       password: 123456
       test: 测试正常登录
       -
       username: lily
       password: 12345
       test: 测试密码错误
 */
public class APIpropoty {
    private String url;
    private String method;
    private List<APIparam> requestParam;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<APIparam> getRequestParam() {
        return requestParam;
    }

    public void setRequestParam(List<APIparam> requestParam) {
        this.requestParam = requestParam;
    }
}
