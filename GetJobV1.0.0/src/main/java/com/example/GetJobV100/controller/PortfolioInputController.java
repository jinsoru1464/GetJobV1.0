package com.example.GetJobV100.controller;

import com.example.GetJobV100.portfolio.PortfolioInput;
import com.example.GetJobV100.service.PortfolioInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/portfolios")
public class PortfolioInputController {

    @Autowired
    private PortfolioInputService portfolioInputService;

    // 모든 프로젝트 가져오기
    @GetMapping
    public List<PortfolioInput> getAllProjects() {
        return portfolioInputService.getAllProjects();
    }

    // 프로젝트 저장
    @PostMapping
    public PortfolioInput saveProject(@RequestBody PortfolioInput portfolioInput) {
        return portfolioInputService.saveProject(portfolioInput);
    }

    // 특정 프로젝트 조회
    @GetMapping("/{id}")
    public PortfolioInput getProjectById(@PathVariable Long id) {
        return portfolioInputService.getProjectById(id);
    }
}
