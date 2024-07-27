package com.recetas.recetas.serivicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recetas.recetas.modelo.Receta;
import com.recetas.recetas.repositorio.IRecetaRepositorio;
import com.recetas.recetas.servicio.IRecetasServicio;

import groovy.util.logging.Slf4j;


@Service
@Slf4j

public class RecetaServicio implements IRecetasServicio {
	@Autowired
	private IRecetaRepositorio repositorio;
	
	
	@Override
	public void save(Receta obj) {
		try {
			repositorio.save(obj);
			
		}catch (Exception e) {
			System.out.println("No se guardo producto");
		}
	}

	@Override
	public void update(Receta obj) {
		try {
			repositorio.save(obj);
		} catch (Exception e) {
			System.out.println("Error al actualizar");
		}
		
	}

	@Override
	public List<Receta> getReceta() {
		try {
			return repositorio.findAll();
		} catch (Exception e) {
			System.out.println("Error en mostrar producto");
		}
		
		return null;
	}

	

	@Override
	public void delete(int id) {
		try {
			repositorio.deleteById(id);
		} catch (Exception e) {
			System.out.println("Error al eliminar");
		}
		
	}

	@Override
	public Receta getRecetaById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
