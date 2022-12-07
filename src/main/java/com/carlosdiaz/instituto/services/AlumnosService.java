package com.carlosdiaz.instituto.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.carlosdiaz.instituto.model.Alumno;

public interface AlumnosService {
    public Page<Alumno> findAll(Pageable page);

    public Alumno findById(int codigo);

    public void insert(Alumno alumno);

    public void update(Alumno alumno);

    public void delete(int codigo);
}
