package com.recetas.recetas.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;



@Entity
@Data
public class Calificacion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCalificacion;
	private String  nota;
	private String  comentario;
	
	@OneToMany(mappedBy = "calificacion")
	private List<Receta> receta = new ArrayList<>();

}
