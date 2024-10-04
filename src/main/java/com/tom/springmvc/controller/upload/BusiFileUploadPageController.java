package com.tom.springmvc.controller.upload;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BusiFileUploadPageController.java
 * @Description TODO
 * @createTime 2024年09月29日 22:03:00
 */
public class BusiFileUploadPageController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("fileUpload");
    }
}
