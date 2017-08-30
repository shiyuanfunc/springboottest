package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by song on 2017/8/26.
 */

public class DefaultController {

    @RequestMapping("/{f}/{ff}")
    public String defaultView(@PathVariable("f") String f ,@PathVariable("ff") String ff){

        return f+"/"+ff;
    }

    @RequestMapping("/{f}")
    public String defaultVieww(@PathVariable("f") String f){

        System.out.println(f);
        return f;
    }
}
