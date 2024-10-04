package com.tom.springmvc;

import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.*;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
import org.springframework.web.servlet.view.xslt.XsltViewResolver;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName SpringmvcComponent.java
 * @Description TODO
 * @createTime 2024年09月22日 08:05:00
 */
public class SpringmvcViewResolverDemo {
    public static void main(String[] args) {

        UrlBasedViewResolver urlBasedViewResolver;

        InternalResourceViewResolver internalResourceViewResolver;

        FreeMarkerViewResolver freeMarkerViewResolver;

        XsltViewResolver xsltViewResolver;

        // 多视图类型
        ResourceBundleViewResolver resourceBundleViewResolver;
        XmlViewResolver xmlViewResolver;
        BeanNameViewResolver beanNameViewResolver;

        JstlView jstlView;

        AbstractView abstractView;

        AbstractUrlBasedView abstractUrlBasedView;

        AbstractTemplateView abstractTemplateView;
    }
}
