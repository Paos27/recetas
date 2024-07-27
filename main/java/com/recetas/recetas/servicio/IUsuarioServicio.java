package com.recetas.recetas.servicio;

import java.util.List;

import com.recetas.recetas.modelo.Usuario;

public interface IUsuarioServicio {
	void save(Usuario obj);
	void update(Usuario obj);
	List<Usuario> getTutores();
	Usuario getTutorById(int id) throws Exception;
	void delete(int id);
}
