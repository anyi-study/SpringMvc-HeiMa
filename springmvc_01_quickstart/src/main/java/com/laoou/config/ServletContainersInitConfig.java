package com.laoou.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    //    加载springMVC对应得容器对象
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    protected String[] getServletMappings() {
//        哪些请求归springMVC处理
//        下列意思就是所有请求都归springmvc管理
        return new String[]{"/"};
    }

    //    加载spring配置得容器对象 ，不用直接返回null即可
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
