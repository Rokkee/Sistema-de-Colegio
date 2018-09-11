package org.trabajopractico2.edfisica;

import javax.persistence.*;

import org.hibernate.validator.constraints.*;
import org.openxava.annotations.*;
import org.trabajopractico2.alumno.*;

@Entity
public class Educacion_Fisica {
	
	@Column (length=10)
	@Required
	@NotEmpty
	private String turno;
	
	@Column (length=20)
	@Required
	@NotEmpty
	private String profesor;
	
	@Column (length=5)
	@Required
	@NotEmpty
	private String curso;

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
@OneToMany
private Alumno alumno;

public Alumno getAlumno(){
	return alumno;
}

public void setAlumno (Alumno alumno){
	this.alumno=alumno;
}
	
	

}
