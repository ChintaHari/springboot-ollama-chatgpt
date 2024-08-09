package com.example.springboot_ollama_chatgpt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_ollama_chatgpt.service.LlamaAiService;

@RestController
@RequestMapping("/api/ai")
public class AIController {
    
    @Autowired
    private LlamaAiService llamaAiService;

    @GetMapping("/generate")
    public String generateResult(@RequestParam(value = "prompt") String prompt){
        return llamaAiService.generateResult(prompt);
    }
}
