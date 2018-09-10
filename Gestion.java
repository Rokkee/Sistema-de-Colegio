package org.trabajopractico2.gestion;

import javax.persistence.*;

import org.hibernate.validator.constraints.*;
import org.openxava.annotations.*;
import org.trabajopractico2.materia.*;
import org.trabajopractico2.preseptor.*;

@Entity
public class Gestion {
	@Required
	@NotEmpty
	private Boolean apta;
	
	@Column (length=20)
	@Required
	@NotEmpty
	private int Num_de_aula;

	public Boolean getApta() {
		return apta;
	}

	public void setApta(Boolean apta) {
		this.apta = apta;
	}

	public int getNum_de_aula() {
		return Num_de_aula;
	}

	public void setNum_de_aula(int num_de_aula) {
		Num_de_aula = num_de_aula;
	}

@ManyToOne
private Preseptor preseptor;

public Preseptor getPreseptor(){
	return preseptor;
}

public void setPreseptor (Preseptor preseptor){
	this.preseptor=preseptor;
}
	

}
