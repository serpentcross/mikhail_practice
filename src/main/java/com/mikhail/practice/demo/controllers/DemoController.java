package com.mikhail.practice.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class DemoController {

    @GetMapping("/index")
    public String getMainPage(Model model, @RequestParam(required = false) String name) {
        model.addAttribute("name", name);
        return "index";
    }

}
