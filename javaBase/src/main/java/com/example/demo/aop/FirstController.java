package com.example.demo.aop;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping("/first")
    public Object first(){
        System.out.println("first");

        return "first controller";
    }

    @RequestMapping("/doError")
    public Object error(){
        return 1/0;
    }
}
