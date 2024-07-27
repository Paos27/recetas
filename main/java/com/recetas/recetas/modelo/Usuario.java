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
import jakarta.persistence.OneToMany;
import lombok.Data;



@Entity
@Data
public class Usuario implements Serializable{

	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	private String  nombre;
	private String  mail;
	private String  contraseña;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaCreacion;
	private boolean estado;
	
	
	@OneToMany(mappedBy = "usuario")
	private List<Receta> receta = new ArrayList<>();
	
}
