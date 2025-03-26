package com.example.GetJobV100.controller;

import com.example.GetJobV100.portfolio.PortfolioInput;
import com.example.GetJobV100.service.PortfolioInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class PortfolioInputController {

    @Autowired
    private PortfolioInputService portfolioInputService;

    @PostMapping
    public PortfolioInput saveProject(@RequestBody PortfolioInput portfolioInput) {
        System.out.println("Received PortfolioInput: " + portfolioInput.toString());
        return portfolioInputService.saveProject(portfolioInput);
    }

    @GetMapping
    public List<PortfolioInput> getAllProjects() {
        return portfolioInputService.getAllProjects();
    }
}
