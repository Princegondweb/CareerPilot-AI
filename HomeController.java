package com.careerpilot.careerpilot_ai.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerpilot.careerpilot_ai.model.CareerRequest;
import com.careerpilot.careerpilot_ai.model.CareerResponse;
import com.careerpilot.careerpilot_ai.service.CareerService;

@RestController
@RequestMapping("/career")
public class HomeController {

    private final CareerService careerService;

    public HomeController(CareerService careerService) {
        this.careerService = careerService;
    }

    @PostMapping("/analyze")
    public CareerResponse analyzeCareer(
            @RequestBody CareerRequest request) {

        return careerService.analyze(request);
    }
}