package com.example.GetJobV100.service;

import com.example.GetJobV100.portfolio.PortfolioInput;
import com.example.GetJobV100.repository.ProjectRepository;
import com.example.GetJobV100.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioInputService {

    @Autowired
    private ProjectRepository projectRepository;

    // 모든 프로젝트 조회
    public List<PortfolioInput> getAllProjects() {
        List<PortfolioInput> projects = projectRepository.findAll();
        if (projects.isEmpty()) {
            throw new ResourceNotFoundException("등록된 프로젝트가 없습니다.");
        }
        return projects;
    }

    // 프로젝트 저장
    public PortfolioInput saveProject(PortfolioInput portfolioInput) {
        if (portfolioInput.getTitle() == null || portfolioInput.getTitle().isEmpty()) {
            throw new IllegalArgumentException("프로젝트 제목은 필수입니다.");
        }
        if (portfolioInput.getProjectDescription() == null || portfolioInput.getProjectDescription().isEmpty()) {
            throw new IllegalArgumentException("프로젝트 설명은 필수입니다.");
        }
        return projectRepository.save(portfolioInput);
    }

    // 특정 프로젝트 조회 (예시 추가)
    public PortfolioInput getProjectById(Long id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("해당 ID의 프로젝트를 찾을 수 없습니다: " + id));
    }
}
