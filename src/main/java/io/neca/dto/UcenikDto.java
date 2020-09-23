package io.neca.dto;

import java.util.List;

import io.neca.model.Profesor;
import io.neca.model.Skola;

public class UcenikDto {

	private int broj;
	private String ime;
	private String prezime;
	private int smer;
	private Skola skola;
	private List<Profesor> profesori;

	public UcenikDto() {
		super();
	}

	public UcenikDto(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public UcenikDto(int broj, String ime, String prezime, int smer) {
		super();
		this.broj = broj;
		this.ime = ime;
		this.prezime = prezime;
		this.smer = smer;
	}

	public UcenikDto(int broj, String ime, String prezime, int smer, Skola skola, List<Profesor> profesori) {
		super();
		this.broj = broj;
		this.ime = ime;
		this.prezime = prezime;
		this.smer = smer;
		this.skola = skola;
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

}
