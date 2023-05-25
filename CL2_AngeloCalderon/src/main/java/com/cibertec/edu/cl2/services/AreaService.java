package com.cibertec.edu.cl2.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.edu.cl2.models.Area;
import com.cibertec.edu.cl2.repositories.AreaDao;

@Service
public class AreaService {
    private final AreaDao areaRepository;

    public AreaService(AreaDao areaRepository) {
        this.areaRepository = areaRepository;
    }

    public List<Area> obtenerAreas() {
        return areaRepository.findAll();
    }
}
