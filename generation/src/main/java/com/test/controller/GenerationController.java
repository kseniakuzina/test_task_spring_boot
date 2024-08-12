package com.test.controller;


import com.test.service.GenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numbers")
public class GenerationController {
    @Autowired
    private GenerationService generationService = new GenerationService();

    @GetMapping
    public String getGeneratedNumber() {
        return  generationService.generateNumber();
    }




}