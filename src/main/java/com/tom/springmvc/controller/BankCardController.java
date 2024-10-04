package com.tom.springmvc.controller;

import com.tom.springmvc.model.UserAppService;
import com.tom.springmvc.model.bankcard.BankCardAppService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName UserController.java
 * @Description TODO
 * @createTime 2024年09月21日 16:57:00
 */
public class BankCardController extends AbstractController {

    private BankCardAppService bankCardAppService;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView("bankCardListPage");
        modelAndView.addObject("bankCardList", bankCardAppService.listCard());
        return modelAndView;
    }

    public void setBankCardAppService(BankCardAppService bankCardAppService) {
        this.bankCardAppService = bankCardAppService;
    }
}
