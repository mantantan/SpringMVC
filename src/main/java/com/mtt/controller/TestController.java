package com.mtt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mantantan on 2017/6/6.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/hello")
    public String helloWorld(){
        int a=3;

        System.out.println("11");
        System.out.println("22");
        tetsDebug();
        System.out.println("33");
        return "hello";
    }

    private void tetsDebug(){
        System.out.println("you can do it ");
    }
}
