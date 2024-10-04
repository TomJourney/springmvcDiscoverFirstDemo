package com.tom.springmvc.controller.file;

import com.tom.springmvc.view.TomPdfView;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName PdfUrlVIewController.java
 * @Description TODO
 * @createTime 2024年09月22日 21:02:00
 */
public class PdfUrlViewController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setView(TomPdfView.build(getClass().getResource("/").getPath() + "/socialNetworkPropagation.pdf"));
        return modelAndView;
    }
}
