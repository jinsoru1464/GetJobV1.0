package com.example.GetJobV100.portfolio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class PortfolioInput {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String subject;
    private String members;

    private String startDate;
    private String endDate;

    private String skills;
    private String role;

    private String projectDescription;
    private String roleDescription;
    private String issueDescription;
    private String techDescription;
    private String feedbackDescription;
    private String linkDescription;
}
