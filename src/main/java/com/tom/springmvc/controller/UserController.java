package com.tom.springmvc.controller;

import com.tom.springmvc.model.UserAppService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.view.RedirectView;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName UserController.java
 * @Description TODO
 * @createTime 2024年09月21日 16:57:00
 */
public class UserController extends AbstractController {

    private UserAppService userAppService;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList", userAppService.listUser());
         // 方式1： 通过RedirectView实现重定向
        modelAndView.setView(new RedirectView("bankCardList.do"));
        // 方式2： 逻辑视图名称前新增redirect 前缀实现重定向
        modelAndView = new ModelAndView("redirect:bankCardList.do");

        System.out.println(request.getServletContext().getRealPath("/")); // D:\bench-cluster\codestudynote\springmvcDiscoverFirstDemo\src\main\webapp\
        System.out.println(request.getServletContext().getContextPath()); // /springmvcDiscoverFirstDemo
        System.out.println(request.getServletContext().getServletContextName()); // springmvcDiscover

        return modelAndView;
    }

    public void setUserAppService(UserAppService userAppService) {
        this.userAppService = userAppService;
    }
}
