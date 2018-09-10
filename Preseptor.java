package org.trabajopractico2.preseptor;

import java.util.*;

import javax.persistence.*;

import org.hibernate.validator.constraints.*;
import org.openxava.annotations.*;
import org.trabajopractico2.alumno.*;
import org.trabajopractico2.gestion.*;
import org.trabajopractico2.materia.*;
import org.trabajopractico2.persona.*;

@Entity
public class Preseptor extends Persona {
	
	@Column (length=10)
	@Required
	@NotEmpty
	private String curso;
	
	@Column (length=10)
	@Required
	@NotEmpty
	private String division;
	
	@Column (length=10)
	@Required
	@NotEmpty
	private String turno;

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

@OneToMany(mappedBy="Preseptor")
private collection <Gestion> gestion;
	
public collection <Gestion> getGestion(){
	return gestion;
}
	
public void setGestion(Collection <Gestion> gestion){
	this.gestion=gestion;
}
	

}
