package com.recetas.recetas.modelo;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;




@Entity
@Data

public class Ingredientes  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idIngrediente;
	private String  nombre;
	private String  descripcion;
	
	
	@ManyToOne
	@JoinColumn(columnDefinition = "recetaId")
	private Receta receta;
	
}
