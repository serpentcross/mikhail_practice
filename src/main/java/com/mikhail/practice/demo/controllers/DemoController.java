package com.mikhail.practice.demo.controllers;

import com.mikhail.practice.demo.converters.ItemConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
@RequiredArgsConstructor
public class DemoController {

    private final ItemConverter itemConverter;

    @GetMapping("/index")
    public String getMainPage(Model model, @RequestParam(required = false) String name) {
        model.addAttribute("items", itemConverter.getAll());
        model.addAttribute("name", name);
        return "index";
    }

}
