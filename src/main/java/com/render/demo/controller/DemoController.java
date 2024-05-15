package com.render.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DemoController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello Render Demo";
    }    

}