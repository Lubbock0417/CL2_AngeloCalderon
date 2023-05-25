package com.cibertec.edu.cl2.services;

import java.util.List;

import com.cibertec.edu.cl2.models.Personal;

public interface PersonalService {
    List<Personal> obtenerPersonal();

    List<Personal> obtenerPersonalPorArea(Integer codigoArea);
}