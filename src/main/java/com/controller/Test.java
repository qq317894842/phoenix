package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Level;

/**
 * @Auther: HuangRui
 * @Date: 2021/4/9 10:02
 * @Description:
 */
@RequestMapping("/test")
@RestController
public class Test {

    @RequestMapping("/t1")
    public String t1(){
        String s = "test/t1";
        return s;
    }
}
