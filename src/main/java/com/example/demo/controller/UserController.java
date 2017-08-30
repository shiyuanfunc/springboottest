package com.example.demo.controller;

import com.example.demo.service.UserServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by song on 2017/8/26.
 */
@RequestMapping("/user")
@Controller
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private UserServce userServce;
    @RequestMapping("/helloHtml")
    public String test(Map<String,Object> map) throws Exception {
        map.put("hello","hello test!");
        userServce.test();
        return "helloHtml";
    }

    @RequestMapping("/{f}")
    public String defaultVieww(@PathVariable("f") String f){

        System.out.println(f);
        return f;
    }
}
