package com.tom.springmvc.controller.upload;

import com.tom.springmvc.utils.BusiIOUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import java.io.File;
import java.util.Objects;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BusiFileUploadController.java
 * @Description TODO
 * @createTime 2024年09月28日 22:02:00
 */
public class BusiFileUploadController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        if (!(request instanceof MultipartHttpServletRequest multipartRequest)) {
            return new ModelAndView("error");
        }
        // 类型转换
        MultipartFile multipartFile = multipartRequest.getFile("inputFile");
        if (Objects.isNull(multipartFile)) {
            return new ModelAndView("error");
        }
        // 保存文件流到本地
        String fileName = multipartFile.getOriginalFilename();
        String path = request.getServletContext().getRealPath("/") + fileName;
        BusiIOUtils.saveToDiskFile(multipartFile, path);
        // 返回视图
        ModelAndView uploadSuccMv = new ModelAndView("fileUploadSucc");
        uploadSuccMv.addObject("fileName", multipartFile.getOriginalFilename());
        uploadSuccMv.addObject("path", path);
        return uploadSuccMv;
    }
}
