package com.recetas.recetas.modelo;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Entity
@Data

public class Receta implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idReceta;
	private String  nombre;
	private String  descripcion;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaCreacion;
	private boolean estado;
	
	@ManyToOne
	@JoinColumn(columnDefinition = "usuarioId")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(columnDefinition = "calificacionId")
	private Calificacion calificacion;
	
	@OneToMany(mappedBy = "receta")
	private List<Ingredientes> ingredientes = new ArrayList<>();
}
