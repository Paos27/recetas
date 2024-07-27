package com.recetas.recetas.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.recetas.recetas.modelo.Receta;
import com.recetas.recetas.servicio.IRecetasServicio;



@Controller
public class RecetaControlador {
	@Autowired
	public IRecetasServicio servicioReceta; 
	
	
	//Nuevo
	@GetMapping ("/nuevoreceta")
	public String crearReceta(Model model) {
		model.addAttribute("nuevaReceta", new Receta());
		return "/plantilla/plantilla";
	}
	
	
//Listar
	@GetMapping ("/listarreceta")
	public String listarReceta(Model model) {
		List<Receta> listarReceta= servicioReceta.getReceta();
		model.addAttribute("list", listarReceta );
		return "/acmemoda/listarproductos";
	}
	
		
//guardar
	@PostMapping("/insertarreceta")
	public String guardarReceta(@ModelAttribute("obj")Receta obj) {
		servicioReceta.save(obj);
		return "redirect:/listarreceta";
	}
		
//editar
	//@GetMapping("/editarReceta/{idreceta}")
	//public String editarReceta(@PathVariable(value="idreceta") int id, Model model) {
		//Receta recetarecuperado= servicioReceta.getRecetaById(id);
		//model.addAttribute("nuevaReceta", recetarecuperado);
		//return "/plantilla/plantilla";
		
	//}
		
//eliminar
	@GetMapping("/eliminarreceta/{idreceta}")
	public String eliminarProducto(@PathVariable(value="idreceta")int id, Model model) {
		servicioReceta.delete(id);
		return "redirect:/listarreceta";
	}
	
	
}
