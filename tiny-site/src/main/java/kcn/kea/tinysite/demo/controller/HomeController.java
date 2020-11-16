package kcn.kea.tinysite.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
    @GetMapping("/")
    public String showHome(){
        System.out.println("Accessing '/' mapping in HomeController");
        return "index";
    }

    @GetMapping("/help")
    public String showHelper(){return "helper";}
}
