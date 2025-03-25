package com.example.GetJobV100.service;

import com.example.GetJobV100.portfolio.PortfolioInput;
import com.example.GetJobV100.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioInputService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<PortfolioInput> getAllProjects() {
        return projectRepository.findAll();
    }

    public PortfolioInput saveProject(PortfolioInput portfolioInput) {
        return projectRepository.save(portfolioInput);
    }
}
