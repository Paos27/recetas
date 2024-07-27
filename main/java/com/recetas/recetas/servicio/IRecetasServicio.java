package com.recetas.recetas.servicio;

import java.util.List;

import com.recetas.recetas.modelo.Receta;

public interface IRecetasServicio {

	
	void save(Receta obj);
	void update(Receta obj);
	List<Receta> getReceta();
	Receta getRecetaById(int id) throws Exception;
	void delete(int id);
	
}
