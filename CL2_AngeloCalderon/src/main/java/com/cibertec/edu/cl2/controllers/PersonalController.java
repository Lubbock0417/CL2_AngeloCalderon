package com.cibertec.edu.cl2.controllers;

import com.cibertec.edu.cl2.models.Personal;
import com.cibertec.edu.cl2.services.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PersonalController {
    private final PersonalService personalService;

    @Autowired
    public PersonalController(PersonalService personalService) {
        this.personalService = personalService;
    }

    @GetMapping("/lista")
    public String getPersonalList(@RequestParam(name = "codigoArea", required = false) Integer codigoArea, Model model) {
        List<Personal> personalList;

        if (codigoArea != null) {
            personalList = personalService.findByAreaCodigo(codigoArea);
        } else {
            personalList = personalService.getAllPersonal();
        }

        model.addAttribute("personalList", personalList);
        return "lista";
    }
}