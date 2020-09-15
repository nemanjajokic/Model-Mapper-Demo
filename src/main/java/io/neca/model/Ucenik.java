package io.neca.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Ucenik {

	@Id
	private int broj;
	private String ime;
	private String prezime;
	private int smer;
	@ManyToOne()
	@JoinColumn(name = "skola")
	private Skola skola;
	@ManyToMany
	@JoinColumn(name = "profesor")
	private List<Profesor> profesori;

	public Ucenik() {
		super();
	}

	public Ucenik(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public Ucenik(int broj, String ime, String prezime, int smer, Skola skola, List<Profesor> profesori) {
		super();
		this.broj = broj;
		this.ime = ime;
		this.prezime = prezime;
		this.smer = smer;
		this.skola = skola;
		this.profesori = profesori;
	}

	public Skola getSkola() {
		return skola;
	}

	public void setSkola(Skola skola) {
		this.skola = skola;
	}

	public List<Profesor> getProfesori() {
		return profesori;
	}

	public void setProfesori(List<Profesor> profesori) {
		this.profesori = profesori;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getSmer() {
		return smer;
	}

	public void setSmer(int smer) {
		this.smer = smer;
	}

}
