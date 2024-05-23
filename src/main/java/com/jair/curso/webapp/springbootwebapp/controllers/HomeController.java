package com.jair.curso.webapp.springbootwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({ "", "/", "/home" })
    public String home() {
        return "redirect:/details";
        // return "forward:/details";
    }
}
