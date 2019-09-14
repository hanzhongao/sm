package com.imooc.sm.controller;

import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create by hza
 * 2019-09-09 17:01
 */
@Controller("testController")
public class TestController {
    public void test(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("NAME" , "hza");
        try {
            request.getRequestDispatcher("/test.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
