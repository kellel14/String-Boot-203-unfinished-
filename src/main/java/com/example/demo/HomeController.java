package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {
    @GetMapping("/songform")
    public String loadFormPage(Model model){
        model.addAttribute("song", new Song());
    }
    public String loadFromPage(@ModelAttribute Song song, Model model){
        model.addAttribute("song", song);
        return "confirmsong";
    }
}