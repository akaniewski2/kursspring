package com.example.kursspring.controllers;

import com.example.kursspring.domain.Knight;

import com.example.kursspring.services.KnightService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class KnightController {

    @Autowired
    KnightService knightService;


    @RequestMapping("/knights")
    public String getKnights(Model model){

        List<Knight> allKnights = knightService.getAllKnights();
        System.out.println("# allKnights"+allKnights);
        model.addAttribute("allKnights",allKnights);
        model.addAttribute("hello","Witaj świecie");

        return "knights";
    }
}
