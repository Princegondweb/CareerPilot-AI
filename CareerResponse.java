package com.careerpilot.careerpilot_ai.model;

import java.util.List;

public class CareerResponse {

    private int readinessScore;
    private List<String> missingSkills;
    private List<String> roadmap;
    private List<String> projects;
    private List<String> interviewQuestions;
    private String jobLevel;
    private String careerAdvice;

    public CareerResponse(
        int readinessScore,
        String jobLevel,
        String careerAdvice,
        List<String> missingSkills,
        List<String> roadmap,
        List<String> projects,
        List<String> interviewQuestions) {

    this.readinessScore = readinessScore;
    this.jobLevel = jobLevel;
    this.careerAdvice = careerAdvice;
    this.missingSkills = missingSkills;
    this.roadmap = roadmap;
    this.projects = projects;
    this.interviewQuestions = interviewQuestions;
}

    public int getReadinessScore() {
        return readinessScore;
    }

    public List<String> getMissingSkills() {
        return missingSkills;
    }

    public List<String> getRoadmap() {
        return roadmap;
    }

    public List<String> getProjects() {
        return projects;
    }

    public List<String> getInterviewQuestions() {
        return interviewQuestions;
    }
    public String getJobLevel() {
    return jobLevel;
}

public String getCareerAdvice() {
    return careerAdvice;
}
}