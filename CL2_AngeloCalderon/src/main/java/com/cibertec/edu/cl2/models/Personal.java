package com.cibertec.edu.cl2.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Personal")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Personal implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "nombre")
    String nombre;

    @Column(name = "codigo_trabajador")
    String codigoTrabajador;

    @Column(name = "sueldo")
    double sueldo;

    @ManyToOne
    @JoinColumn(name = "codigo")
    Area area;
}
