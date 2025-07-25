package com.feifei.demo;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @RequestMapping("/request")
    public String request(HttpServletRequest request) { //HttpServletRequest 是个封装对象，可以获取请求的所有信息
        //1. 获取请求方式
        String method = request.getMethod(); //GET
        System.out.println("请求方式" + method);

        //2. 获取请求url地址
        String url = request.getRequestURL().toString(); // http://localhost:8080/request
        String uri = request.getRequestURI();
        System.out.println("请求url" + url);
        System.out.println("请求url" + uri);

        //3. 获取请求协议
        String protocol = request.getProtocol(); // HTTP/1.1
        System.out.println("请求协议" + protocol);

        //4. 获取请求参数 - name, age
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println("name :" + name);
        System.out.println("age :" + age);

        //5. 获取请求头 - accept
        String accept = request.getHeader("accept");
        System.out.println("accept :" + accept);

        // 返回
        return "OK";
    }
}
