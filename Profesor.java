package org.trabajopractico2.profesor;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;
import org.trabajopractico2.alumno.*;
import org.trabajopractico2.materia.*;
import org.trabajopractico2.persona.*;
import org.trabajopractico2.taller.*;

@Entity
public class Profesor extends Persona {
       
	@Column(length=20)
	@Required
	@NotNull
	private String materia;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	@OneToMany(mappedBy="Profesor")
	private collection <Materia> materia;
	
	public collection <Materia> getMateria(){
		return materia;
	}
	
	public void setMateria(Collection <Materia> materia){
		this.materia=materia;
	}
	
	@OneToMany(mappedBy="Profesor")
	private collection <taller> taller;
	
	public collection <taller> gettaller(){
		return taller;
	}
	
	public void settaller(Collection <taller> taller){
		this.taller=taller;
	}
	
	
}
