package com.example.kursspring.controllers;

import com.example.kursspring.components.TimeComponent;
import com.example.kursspring.domain.ErrMap;
import com.example.kursspring.domain.Knight;

import com.example.kursspring.domain.PlayerInformation;
import com.example.kursspring.services.KnightService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class KnightController {

    @Autowired
    TimeComponent timeComponent;

    @Autowired
    KnightService knightService;

    @Autowired
    PlayerInformation playerInformation;

    @Autowired
    private MessageSource messageSource;

//    @Autowired
//    ErrMap errorMap;


    @RequestMapping("/knights")
    public String getKnights(Model model) {

        List<Knight> allKnights = knightService.getAllKnights();
        System.out.println("# allKnights" + allKnights);
        model.addAttribute("allKnights", allKnights);
        model.addAttribute("timeComponent", timeComponent);
        model.addAttribute("playerInformation",playerInformation);
        model.addAttribute("hello", "Witaj świecie");

        return "form_knights_list";
    }

    //1. tu nastepuje przekazanie danych z formularza form_knight_new do modelu i utworzenie pustego obiektu ryceeza , który zostanie zapisamy w pkt 2 po wykonaniu metody post na url /knightFromForm"
    @RequestMapping("/newknight")
    public String createKnight(Model model) {
        model.addAttribute("newKnightFromForm", new Knight());
//        model.addAttribute("timeComponent", timeComponent);
//        model.addAttribute("playerInformation",playerInformation);


      return "form_knight_new";
//        return "redirect:/newknight";

    }

    //2. tu nastepuje zapisanie rycerza z formularza
    //metoda post przyjmuje nie model a obiekt ,clase
    //tu mozna wstawic walidacje
    @RequestMapping(value = "/saveKnightFromForm", method = RequestMethod.POST)
    //public String saveKnights(Knight knight)
    public String saveKnights(
            @Valid   Knight knight, BindingResult bindingResult,Model model) { /*dotyczy annotacji w klasie nigth */ //nie dziala @ModelAttribute("knighterr")
        if (bindingResult.hasErrors()) {
            System.out.println("# EROR");
            bindingResult.getAllErrors().forEach(error -> {System.out.println(error.getObjectName() + " " + error.getDefaultMessage());}  );
           // bindingResult.getAllErrors().forEach(error -> {System.out.println(error.getObjectName() + " " + error.getDefaultMessage());


//            Map<String, String> /*errorMap*/ errMap = bindingResult.getFieldErrors().stream()
//                    .collect(Collectors
//                            .toMap(FieldError::getField,
//                                    e -> messageSource.getMessage(e, LocaleContextHolder.getLocale()),
//                                    (a,b)->a + "<br/>" + b));
//            model.addAttribute("errMap", errMap);


            return "form_knight_new";
        } else {
            knightService.saveKnight(knight);
            //przy redirect wskazujemy rwniez na url z RequestMapping a nie nazwe formularza !
            return "redirect:/knights";
            // tak nie dziala
            // return "form_knights";
        }


    }

    @RequestMapping("/knight")
    public String getKnight(@RequestParam("id") Integer id, Model model) {
        Knight knight = knightService.getKnight(id);
        model.addAttribute("knight", knight);
        model.addAttribute("timeComponent", timeComponent);
        model.addAttribute("playerInformation",playerInformation);
        return "form_knight_info";
    }

    @RequestMapping(value = "/knight/delete/{id}")
    public String deleteKnight(@PathVariable("id") Integer id) {
        knightService.deleteKnight(id);
        return "redirect:/knights";


    }
}
