package com.recetas.recetas.servicio;

import java.util.List;

import com.recetas.recetas.modelo.Calificacion;

public interface ICalificacionServicio {
	void save(Calificacion obj);
	void update(Calificacion obj);
	List<Calificacion> getTutores();
	Calificacion getTutorById(int id) throws Exception;
	void delete(int id);
}
