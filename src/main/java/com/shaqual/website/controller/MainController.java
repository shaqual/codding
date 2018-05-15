package com.shaqual.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shaqual/")
public class MainController {

    @RequestMapping("index.html")
    public String index(){
        return "index";
    }
}
