package com.nowcoder.coddit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Test")
public class TestController {
    @RequestMapping("/Hello")
    @ResponseBody
    public String sayHello() {
        return "Test SpringBoot.";
    }
}
