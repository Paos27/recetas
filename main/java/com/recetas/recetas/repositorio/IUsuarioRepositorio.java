package com.recetas.recetas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recetas.recetas.modelo.Usuario;

public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer>{

}
