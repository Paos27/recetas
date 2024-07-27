package com.recetas.recetas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recetas.recetas.modelo.Ingredientes;

public interface IIngredientesRepositorio extends JpaRepository<Ingredientes, Integer> {

}
