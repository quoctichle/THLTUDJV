package com.example.WebBanSach.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Admin")
public class HomeController {
    @GetMapping
    public String home(){return "Admin/home/index";}
}
