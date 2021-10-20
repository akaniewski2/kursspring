package com.example.kursspring.controllers;

import com.example.kursspring.domain.Knight;

import com.example.kursspring.services.KnightService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class KnightController {

    @Autowired
    KnightService knightService;


    @RequestMapping("/knights")
    public String getKnights(Model model) {

        List<Knight> allKnights = knightService.getAllKnights();
        System.out.println("# allKnights" + allKnights);
        model.addAttribute("allKnights", allKnights);
        model.addAttribute("hello", "Witaj świecie");

        return "form_knights";
    }

    //1. tu nastepuje przekazanie danych z formularza form_newknight do modelu i utworzenie pustego obiektu ryceeza , który zostanie zapisamy w pkt 2 po wykonaniu metody post na url /knightFromForm"
    @RequestMapping("/newknight")
    public String createKnight(Model model) {
        model.addAttribute("newKnightFromForm", new Knight());
        return "form_newknight";

    }

    //2. tu nastepuje zapisanie rycerza z formularza
    @RequestMapping(value = "/saveKnightFromForm", method = RequestMethod.POST)
    //metoda post przyjmuje nie model a obiekt ,clase
    //tu mozna wstawic walidacje
    public String saveKnights(Knight knight) {
        knightService.saveKnight(knight);
        //przy redirect wskazujemy rwniez na url z RequestMapping a nie nazwe formularza !
        return "redirect:/knights";

        // tak nie dziala
        // return "form_knights";

    }

    @RequestMapping("/knight")
    public String getKnight(@RequestParam("id") Integer id, Model model) {
        Knight knight = knightService.getKnight(id);
        model.addAttribute("knight", knight);
        return "form_knight_info";
    }

    @RequestMapping(value = "/knight/delete/{id}")
    public String deleteKnight(@PathVariable("id") Integer id) {
        knightService.deleteKnight(id);
        return "redirect:/knights";


    }
}
