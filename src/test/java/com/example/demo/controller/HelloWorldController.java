package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: 1
 * @date: Created in 2020/4/18 15:52
 * @version: ${VERSION}
 * @modified By:
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping("/say")
    public String say(){
        return "hello world";
    }
}
