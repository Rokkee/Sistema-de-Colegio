package org.trabajopractico2.taller;

import javax.persistence.*;

import org.trabajopractico2.alumno.*;
import org.trabajopractico2.asignatura.*;
import org.trabajopractico2.profesor.*;

@Entity
public class taller extends Asignatura {

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


}
