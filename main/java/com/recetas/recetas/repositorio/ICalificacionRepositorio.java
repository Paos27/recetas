package com.recetas.recetas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recetas.recetas.modelo.Calificacion;

public interface ICalificacionRepositorio extends JpaRepository<Calificacion, Integer>{

}
