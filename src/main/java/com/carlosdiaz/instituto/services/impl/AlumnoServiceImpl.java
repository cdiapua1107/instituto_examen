package com.carlosdiaz.instituto.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.carlosdiaz.instituto.dao.AlumnosDAO;
import com.carlosdiaz.instituto.model.Alumno;
import com.carlosdiaz.instituto.services.AlumnosService;
@Service
public class AlumnoServiceImpl implements AlumnosService{

    @Autowired
    AlumnosDAO alumnosDAO;

    @Override
    public Page<Alumno> findAll(Pageable page) {
        return alumnosDAO.findAll(page);
    }

    @Override
    public Alumno findById(int codigo) {
        return alumnosDAO.findById(codigo);
    }

    @Override
    public void insert(Alumno alumno) {
        alumnosDAO.insert(alumno);
    }

    @Override
    public void update(Alumno alumno) {
        alumnosDAO.update(alumno);

        if (alumno.getImagen() != null && alumno.getImagen().length > 0) {
            alumnosDAO.updateImage(alumno);
        }
    }

    @Override
    public void delete(int codigo) {
        alumnosDAO.delete(codigo);
    }
    
}
