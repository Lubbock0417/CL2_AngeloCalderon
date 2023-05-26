package com.cibertec.edu.cl2.services;

import com.cibertec.edu.cl2.models.Personal;
import com.cibertec.edu.cl2.repositories.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalServiceImpl implements PersonalService {
    private final PersonalRepository personalRepository;

    @Autowired
    public PersonalServiceImpl(PersonalRepository personalRepository) {
        this.personalRepository = personalRepository;
    }

    @Override
    public List<Personal> getAllPersonal() {
        return personalRepository.findAll();
    }

    @Override
    public List<Personal> findByAreaCodigo(int codigoArea) {
        return personalRepository.findByAreaCodigo(codigoArea);
    }
}