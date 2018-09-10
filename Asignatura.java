package org.trabajopractico2.asignatura;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.actions.*;
import org.openxava.annotations.*;
import org.trabajopractico2.alumno.*;
import org.trabajopractico2.aula.*;

@MappedSuperclass
public class Asignatura {
	
	@Column(length=20)
	@Required
	@NotNull
	private String nombre;
	
	@Column(length=10)
	@Required
	@NotNull
	private String turno;
	
	@Column(length=10)
	@Required
	@NotNull
	private String curso;
	
	@Column(length=10)
	@Required
	@NotNull
	private String horario;
	
	@Column(length=20)
	@Required
	@NotNull
	private String profesor;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	@ManyToMany(mappedBy="Asignatura")
	private collection <Aula> aula;
	
	public collection <Aula> getAula(){
		return aula;
	}
	
	public void setAula(Collection <Aula> aula){
		this.aula=aula;
	}

}
