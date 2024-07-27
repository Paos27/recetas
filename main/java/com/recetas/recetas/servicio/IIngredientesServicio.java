package com.recetas.recetas.servicio;

import java.util.List;

import com.recetas.recetas.modelo.Ingredientes;

public interface IIngredientesServicio {

	void save(Ingredientes obj);
	void update(Ingredientes obj);
	List<Ingredientes> getTutores();
	Ingredientes getTutorById(int id) throws Exception;
	void delete(int id);
	
}
