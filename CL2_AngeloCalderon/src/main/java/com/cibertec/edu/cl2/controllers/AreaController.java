package com.cibertec.edu.cl2.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.edu.cl2.models.Area;
import com.cibertec.edu.cl2.services.AreaService;

@RestController
public class AreaController {
    private final AreaService areaService;

    public AreaController(AreaService areaService) {
        this.areaService = areaService;
    }

    @GetMapping("/areas")
    public List<Area> obtenerAreas() {
        return areaService.obtenerAreas();
    }
}