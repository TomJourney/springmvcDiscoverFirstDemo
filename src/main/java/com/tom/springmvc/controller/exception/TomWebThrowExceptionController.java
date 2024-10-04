package com.tom.springmvc.controller.exception;

import com.tom.springmvc.exception.TomWebException;
import com.tom.springmvc.utils.BusiDateUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import java.util.Objects;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomWebThrowExceptionController.java
 * @Description TODO
 * @createTime 2024年10月03日 10:35:00
 */
public class TomWebThrowExceptionController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        if (Objects.isNull(request.getParameter("testParamKey"))) {
            throw new TomWebException(BusiDateUtils.getNowTextYearToSecond() + " testParamKey查无记录");
        }
        return new ModelAndView("index");
    }
}
