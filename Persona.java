package org.trabajopractico2.persona;

import java.util.*;

import javax.persistence.*;

import org.hibernate.validator.constraints.*;
import org.openxava.annotations.*;
import org.trabajopractico2.materia.*;
import org.trabajopractico2.preseptor.*;
import org.trabajopractico2.programa.*;

@MappedSuperclass
public class Persona {
	
	@Column (length=20)
	@Required
	@NotEmpty
	private String nombre;

	@Column (length=20)
	@Required
	@NotEmpty
	private String apellido;
	
	@Column (length=20)
	@Required
	@NotEmpty
	private String direccion;
	
	@Column (length=20)
	@Required
	@NotEmpty
	private String telefono;
	
	@Column (length=20)
	@Required
	@Email
	private String email;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
