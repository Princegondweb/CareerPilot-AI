package com.careerpilot.careerpilot_ai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.careerpilot.careerpilot_ai.model.CareerRequest;
import com.careerpilot.careerpilot_ai.model.CareerResponse;
import com.careerpilot.careerpilot_ai.model.CareerRole;
import com.careerpilot.careerpilot_ai.repository.CareerRepository;

@Service
public class CareerService {

    private final CareerRepository careerRepository;

    public CareerService(CareerRepository careerRepository) {
        this.careerRepository = careerRepository;
    }

    public CareerResponse analyze(CareerRequest request) {
        System.out.println("TARGET ROLE = " + request.getTargetRole());

CareerRole role =
        careerRepository.getRole(request.getTargetRole());

System.out.println("ROLE FOUND = " + role.getRoleName()); 

if (role == null) {
    throw new RuntimeException("Career role not found");
}

List<String> requiredSkills =
        role.getRequiredSkills();

        List<String> missingSkills = new ArrayList<>();

        for (String skill : requiredSkills) {
            if (!request.getSkills().contains(skill)) {
                missingSkills.add(skill);
            }
        }

        int readinessScore =
                ((requiredSkills.size() - missingSkills.size()) * 100)
                        / requiredSkills.size();
        String jobLevel;

if (readinessScore <= 30) {
    jobLevel = "Beginner";
}
else if (readinessScore <= 60) {
    jobLevel = "Developing";
}
else if (readinessScore <= 80) {
    jobLevel = "Near Job Ready";
}
else {
    jobLevel = "Job Ready";
}    

String careerAdvice =
        "You already have "
        + request.getSkills().size()
        + " relevant skills. "
        + "Focus on "
        + String.join(", ", missingSkills)
        + ". "
        + "With consistent study of 2 hours per day, "
        + "you can significantly improve your readiness in the coming months.";


        List<String> roadmap = new ArrayList<>();

        for (String skill : missingSkills) {
            roadmap.add("Learn " + skill);
        }

        List<String> projects = role.getProjects();

     List<String> interviewQuestions =
        role.getInterviewQuestions();

        return new CareerResponse(
        readinessScore,
        jobLevel,
        careerAdvice,
        missingSkills,
        roadmap,
        projects,
        interviewQuestions
);
    }
}