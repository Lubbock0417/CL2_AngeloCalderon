package com.cibertec.edu.cl2.repositories;

import com.cibertec.edu.cl2.models.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonalRepository extends JpaRepository<Personal, Long> {
    List<Personal> findByAreaCodigo(int codigoArea);
}