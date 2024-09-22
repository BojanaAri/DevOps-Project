package com.bezkoder.spring.data.mongodb.controller;

import com.bezkoder.spring.data.mongodb.repository.TutorialRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TutorialController {
    final TutorialRepository tutorialRepository;

    public TutorialController(TutorialRepository tutorialRepository) {
        this.tutorialRepository = tutorialRepository;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("tutorials", tutorialRepository.findAll());
        return "index";
    }
}
