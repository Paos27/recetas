package com.recetas.recetas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recetas.recetas.modelo.Receta;

public interface IRecetaRepositorio extends JpaRepository<Receta, Integer>{

}
