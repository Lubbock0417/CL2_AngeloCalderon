package com.cibertec.edu.cl2.services;

import com.cibertec.edu.cl2.models.Personal;

import java.util.List;

public interface PersonalService {
    List<Personal> getAllPersonal();

    List<Personal> findByAreaCodigo(int codigoArea);
}