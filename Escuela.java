package org.trabajopractico2.escuela;

import javax.persistence.*;

import org.hibernate.validator.constraints.*;
import org.openxava.annotations.*;

@Entity
public class Escuela {
	
	@Column (length=20)
	@Required
	@NotEmpty
	private String nombre;
	
	@Column (length=3)
	@Required
	@NotEmpty
	private int numero;
	
	@Column (length=10)
	@Required
	@NotEmpty
	private String tipo;
	
	@Column (length=20)
	@Required
	@NotEmpty
	private String direccion;
	
	@Column (length=15)
	@Required
	@NotEmpty
	private String telefono;
	
	@Column (length=10)
	@Required
	@NotEmpty
	private int capacidad;
	
	@Column (length=20)
	@Required
	@NotEmpty
	private String director;
	
	@Column (length=20)
	@Required
	@NotEmpty
	private String barrio;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	

}
