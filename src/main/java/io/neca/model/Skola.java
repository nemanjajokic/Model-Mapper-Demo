package io.neca.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Skola {

	@Id
	private String ime;
	private String tip;
	private String mesto;
	@OneToMany(mappedBy = "skola")
	private List<Profesor> profesori;
	@OneToMany(mappedBy = "skola")
	private List<Ucenik> ucenici;

	public Skola() {
		super();
	}

	public Skola(String ime, String tip, String mesto, List<Profesor> profesori, List<Ucenik> ucenici) {
		super();
		this.ime = ime;
		this.tip = tip;
		this.mesto = mesto;
		this.profesori = profesori;
		this.ucenici = ucenici;
	}

	public List<Profesor> getProfesori() {
		return profesori;
	}

	public void setProfesori(List<Profesor> profesori) {
		this.profesori = profesori;
	}

	public List<Ucenik> getUcenici() {
		return ucenici;
	}

	public void setUcenici(List<Ucenik> ucenici) {
		this.ucenici = ucenici;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getMesto() {
		return mesto;
	}

	public void setMesto(String mesto) {
		this.mesto = mesto;
	}

}
