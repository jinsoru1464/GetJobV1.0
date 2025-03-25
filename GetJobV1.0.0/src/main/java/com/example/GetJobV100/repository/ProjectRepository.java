package com.example.GetJobV100.repository;

import com.example.GetJobV100.portfolio.PortfolioInput;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<PortfolioInput, Long> {
}
