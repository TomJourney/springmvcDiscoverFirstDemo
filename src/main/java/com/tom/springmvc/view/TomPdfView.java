package com.tom.springmvc.view;

import com.tom.springmvc.utils.BusiIOUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.view.AbstractUrlBasedView;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomPdfView.java
 * @Description TODO
 * @createTime 2024年09月22日 20:52:00
 */
public class TomPdfView extends AbstractUrlBasedView {

    public TomPdfView(String url) {
        super(url);
        setContentType("application/pdf");
    }

    public static TomPdfView build(String url) {
        return new TomPdfView(url);
    }

    @Override
    protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType(getContentType());
        InputStream inputStream =new FileInputStream(getUrl());
        OutputStream outputStream = response.getOutputStream();
        BusiIOUtils.copy(inputStream, outputStream);
        outputStream.flush();
        inputStream.close();
        outputStream.close();
    }
}
