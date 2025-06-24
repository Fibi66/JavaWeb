package com.feifei.demo;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ResponseController {
    // 方法1
    @RequestMapping("/response")
    public void response(HttpServletResponse response) throws IOException {
        // 1. 设置响应状态码 //通常来说状态码不用设置
        response.setStatus(200);
        // 2. 设置响应头
        response.setHeader("name", "feifei");

        // 3. 响应体
        response.getWriter().write("hello world");
    }

    // 方法2
    @RequestMapping("/response2")
    public ResponseEntity<String> response2() {
        return ResponseEntity
                .status(200)
                .header("name", "feifei")
                .body("hello world");
    }
}
