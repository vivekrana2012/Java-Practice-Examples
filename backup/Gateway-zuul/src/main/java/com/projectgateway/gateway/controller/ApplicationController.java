package com.projectgateway.gateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class ApplicationController {
    @RequestMapping("/")
    public String loginForm(){
        return "index";
    }
}
