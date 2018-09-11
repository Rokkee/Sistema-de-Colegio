package org.trabajopractico2.alumno;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import org.openxava.annotations.*;
import org.trabajopractico2.edfisica.*;
import org.trabajopractico2.materia.*;
import org.trabajopractico2.persona.*;
import org.trabajopractico2.taller.*;

@Entity
public class Alumno extends Persona {
	
	@Column(length=10)
	@Required
	@NotNull
	private String curso;
	
	@Column(length=10)
	@Required
	@NotNull
	private String division;
	
	@Column(length=10)
	@Required
	@NotNull
	private String turno;
	
	@Column(length=3)
	@Required
	@NotNull
	@Past
	private String edad;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	@ManyToMany(mappedBy="Alumno")
	private collection <Materia> materia;
	
	public collection <Materia> getMateria(){
		return materia;
	}
	
	public void setMateria(Collection <Materia> materia){
		this.materia=materia;
	}
	
	@ManyToMany(mappedBy="Alumno")
	private collection <Taller> taller;
	
	public collection <Taller> getTaller(){
		return taller;
	}
	
	public void settaller(Collection <taller> taller){
		this.taller=taller;
	}
	
	@ManyToOne(mappedBy="Alumno")
	private collection <Educacion_Fisica> educacion_fisica;
	
	public collection <Educacion_Fisica> geteducacion_fisica(){
		return Educacion_Fisica;
	}
	
	public void seteducacion_fisica(Collection <Educacion_Fisica> educacion_fisica){
		this.educacion_fisica=educacion_fisica;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}
	
}
