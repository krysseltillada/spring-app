package com.teamjava.springapp.controllers;

import com.teamjava.springapp.domain.Cat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class TestController
{
    @RequestMapping("/login")
    public String welcomeMethod(Model model) {

        model.addAttribute("cat", new Cat());

        return "welcome";
    }

    @PostMapping("/login")
    public String login(@Valid
                        @ModelAttribute Cat cat,
                        BindingResult pBindingResult,
                        Model model) {
        if (pBindingResult.hasErrors()) {
            return "welcome";
        }

        model.addAttribute("success", "tng ina");

        return "welcome";
    }
}
