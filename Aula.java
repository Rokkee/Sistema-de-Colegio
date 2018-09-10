package org.trabajopractico2.aula;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;

@Entity
public class Aula {
	
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
	private String horario;
	
	@Column(length=50)
	@Required
	@NotNull
	private String numero_id;
	
	@Column(length=10)
	@Required
	@NotNull
	private String tipo;

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

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getNumero_id() {
		return numero_id;
	}

	public void setNumero_id(String numero_id) {
		this.numero_id = numero_id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
