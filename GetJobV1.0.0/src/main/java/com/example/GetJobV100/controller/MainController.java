package com.example.GetJobV100.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage() {
        return "mainpage";
    }

    @GetMapping("/portfolioinput")
    public String portfolioInputPage() {
        return "PortfolioInput";
    }
}
