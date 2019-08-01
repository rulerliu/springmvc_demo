package com.liuwq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/8/1 0001 上午 11:45
 * @version: V1.0
 */
@Controller
public class MyController {

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        System.out.println(">>>test");
        return "test";
    }

    @RequestMapping("/pay2")
    public String pay() {
        System.out.println(">>>test");
        return "pay";
    }

}
