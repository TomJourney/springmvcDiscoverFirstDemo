package com.tom.springmvc;

import org.springframework.web.servlet.view.*;
import org.springframework.web.servlet.view.document.*;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
import org.springframework.web.servlet.view.xslt.XsltView;
import org.springframework.web.servlet.view.xslt.XsltViewResolver;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName SpringmvcComponent.java
 * @Description TODO
 * @createTime 2024年09月22日 08:05:00
 */
public class SpringmvcViewDemo {
    public static void main(String[] args) {
        AbstractTemplateView abstractTemplateView;
        FreeMarkerView freeMarkerView;

        AbstractPdfView abstractPdfView;
        AbstractXlsView abstractXlsView;
        AbstractXlsxView abstractXlsxView;
        AbstractXlsxStreamingView abstractXlsxStreamingView;
        AbstractPdfStamperView abstractPdfStamperView;

        XsltView xsltView;
    }
}
