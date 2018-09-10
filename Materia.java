package org.trabajopractico2.materia;

import java.util.*;

import javax.persistence.*;

import org.openxava.actions.*;
import org.trabajopractico2.alumno.*;
import org.trabajopractico2.asignatura.*;
import org.trabajopractico2.aula.*;
import org.trabajopractico2.profesor.*;
import org.trabajopractico2.programa.*;

@Entity
public class Materia extends Asignatura {

@ManyToMany
private Alumno alumno;

public Alumno getAlumno(){
	return alumno;
}

public void setAlumno (Alumno alumno){
	this.alumno=alumno;
}

@ManyToOne
private Profesor profesor;

public Profesor getProfesor(){
	return profesor;
}

public void setProfesor (Profesor profesor){
	this.profesor=profesor;
}
@ManyToMany(mappedBy="Materia")
private collection <Programa> programa;

public collection <Programa> getPrograma(){
	return programa;
}

public void setPrograma(Collection <Programa> programa){
	this.programa=programa;
}

}
