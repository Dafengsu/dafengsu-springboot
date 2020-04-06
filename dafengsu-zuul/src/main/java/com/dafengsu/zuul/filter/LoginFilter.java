package com.dafengsu.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author su
 * @description
 * @date 2020/4/6
 */
@Component
public class LoginFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 10;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //初始化context
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        //获取参数
        String token = request.getParameter("token");
        if (StringUtils.isBlank(token)) {
            //拦截,不转发请求
            context.setSendZuulResponse(false);
            //响应状态码
            context.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
            context.setResponseBody("request error");
        }
        return null;
    }
}
