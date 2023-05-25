package com.cibertec.edu.cl2.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.edu.cl2.models.Personal;

@Repository
public interface PersonalDao extends CrudRepository<Personal, Long> {
    List<Personal> findAll();

    List<Personal> findByAreaCodigo(Integer codigoArea);
}