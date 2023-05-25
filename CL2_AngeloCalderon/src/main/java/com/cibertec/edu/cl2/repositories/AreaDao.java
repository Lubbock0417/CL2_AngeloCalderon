package com.cibertec.edu.cl2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.edu.cl2.models.Area;

@Repository
public interface AreaDao extends JpaRepository<Area, Integer> {
    List<Area> findAll();
}