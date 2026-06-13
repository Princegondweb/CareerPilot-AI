package com.careerpilot.careerpilot_ai.model;

import java.util.List;

public class CareerRole {

    private String roleName;
    private List<String> requiredSkills;
    private List<String> projects;
    private List<String> interviewQuestions;

    public CareerRole(
            String roleName,
            List<String> requiredSkills,
            List<String> projects,
            List<String> interviewQuestions) {

        this.roleName = roleName;
        this.requiredSkills = requiredSkills;
        this.projects = projects;
        this.interviewQuestions = interviewQuestions;
    }

    public String getRoleName() {
        return roleName;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    public List<String> getProjects() {
        return projects;
    }

    public List<String> getInterviewQuestions() {
        return interviewQuestions;
    }
}