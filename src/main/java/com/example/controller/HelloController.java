package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 接口类，可以接收浏览器请求
@RestController
public class HelloController {

    // 访问路径：/hello
    // 浏览器访问这个地址，就会执行下面的方法
    @GetMapping("/hello")
    public String hello() {
        // 返回给浏览器的内容
        return "world!";
    }
}