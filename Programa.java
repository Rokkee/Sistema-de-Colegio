package org.trabajopractico2.programa;

import javax.jws.*;
import javax.persistence.*;

import org.hibernate.validator.constraints.*;
import org.openxava.annotations.*;
import org.trabajopractico2.materia.*;
import org.trabajopractico2.profesor.*;

@Entity
public class Programa {
	
	@Column (length=20)
	@Required
	@NotEmpty
	private String asignatura;
	
	@Column (length=20)
	@Required
	@NotEmpty
	private String nombre;
	
	@Column (length=20)
	@Required
	@NotEmpty
	private String jefe_de_departamento;

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getJefe_de_departamento() {
		return jefe_de_departamento;
	}

	public void setJefe_de_departamento(String jefe_de_departamento) {
		this.jefe_de_departamento = jefe_de_departamento;
	}

@OneToOne
private Materia materia;

public Materia getMateria(){
	return materia;
}

public void setMateria (Materia materia){
	this.materia=materia;
}
	
	

}
