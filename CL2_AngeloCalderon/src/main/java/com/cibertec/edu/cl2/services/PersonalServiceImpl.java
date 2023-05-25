package com.cibertec.edu.cl2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.cl2.models.Personal;
import com.cibertec.edu.cl2.repositories.PersonalDao;

@Service
public class PersonalServiceImpl implements PersonalService {
    private final PersonalDao personalDao;

    @Autowired
    public PersonalServiceImpl(PersonalDao personalDao) {
        this.personalDao = personalDao;
    }

    @Override
    public List<Personal> obtenerPersonal() {
        return personalDao.findAll();
    }

    @Override
    public List<Personal> obtenerPersonalPorArea(Integer codigoArea) {
        return personalDao.findByAreaCodigo(codigoArea);
    }
}