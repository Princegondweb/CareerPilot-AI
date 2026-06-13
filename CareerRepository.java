package com.careerpilot.careerpilot_ai.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.careerpilot.careerpilot_ai.model.CareerRole;

@Repository
public class CareerRepository {

    private final Map<String, CareerRole> roles = Map.of(

            "Backend Developer",
            new CareerRole(
                    "Backend Developer",

                    List.of(
                            "Java",
                            "Spring Boot",
                            "SQL",
                            "REST API",
                            "Git",
                            "Docker"
                    ),

                    List.of(
                            "Student Management System",
                            "Library Management System",
                            "Employee Management System"
                    ),

                    List.of(
                            "What is Dependency Injection?",
                            "What is REST API?",
                            "Difference between ArrayList and LinkedList?"
                    )
            ),

            "Data Analyst",
            new CareerRole(
                    "Data Analyst",

                    List.of(
                            "Excel",
                            "SQL",
                            "Python",
                            "Power BI",
                            "Statistics"
                    ),

                    List.of(
                            "Sales Dashboard",
                            "Customer Analytics Dashboard",
                            "Business Insights Report"
                    ),

                    List.of(
                            "What is a JOIN in SQL?",
                            "Difference between Mean and Median?",
                            "What is Power BI?"
                    )
            ),

            "AI Engineer",
            new CareerRole(
                    "AI Engineer",

                    List.of(
                            "Python",
                            "Machine Learning",
                            "Deep Learning",
                            "LLM",
                            "Vector Database"
                    ),

                    List.of(
                            "AI Chatbot",
                            "Resume Analyzer",
                            "Document Q&A System"
                    ),

                    List.of(
                            "What is Overfitting?",
                            "What is a Vector Database?",
                            "What is RAG?"
                    )
            ),

            "Cloud Engineer",
            new CareerRole(
                    "Cloud Engineer",

                    List.of(
                            "Linux",
                            "Docker",
                            "Kubernetes",
                            "AWS",
                            "Networking"
                    ),

                    List.of(
                            "Cloud Deployment Pipeline",
                            "Containerized Web App",
                            "Kubernetes Cluster Project"
                    ),

                    List.of(
                            "What is Docker?",
                            "What is Kubernetes?",
                            "What is Load Balancing?"
                    )
            )
    );

    public CareerRole getRole(String roleName) {
        return roles.get(roleName);
    }
}