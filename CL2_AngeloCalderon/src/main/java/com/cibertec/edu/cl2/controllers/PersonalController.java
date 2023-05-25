package com.cibertec.edu.cl2.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cibertec.edu.cl2.models.Personal;
import com.cibertec.edu.cl2.services.PersonalService;

@RestController
public class PersonalController {
    private final PersonalService personalService;

    public PersonalController(PersonalService personalService) {
        this.personalService = personalService;
    }

    @GetMapping("/lista")
    public ModelAndView obtenerPersonal(@RequestParam(name = "codigoArea", required = false) Integer codigoArea) {
        ModelAndView modelAndView = new ModelAndView("lista");
        
        List<Personal> listaPersonal;
        if (codigoArea != null) {
            listaPersonal = personalService.obtenerPersonalPorArea(codigoArea);
        } else {
            listaPersonal = personalService.obtenerPersonal();
        }
        
        modelAndView.addObject("empleados", listaPersonal);
        
        return modelAndView;
    }
}