package io.neca.dto;

import java.util.List;

public class UcenikDto {

	private int broj;
	private String ime;
	private String prezime;
	private int smer;
	private SkolaDto skola;
	private List<ProfesorDto> profesori;

	public UcenikDto() {
		super();
	}

	public UcenikDto(int broj, String ime, String prezime, int smer, SkolaDto skola, List<ProfesorDto> profesori) {
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

	public SkolaDto getSkola() {
		return skola;
	}

	public void setSkola(SkolaDto skola) {
		this.skola = skola;
	}

	public List<ProfesorDto> getProfesori() {
		return profesori;
	}

	public void setProfesori(List<ProfesorDto> profesori) {
		this.profesori = profesori;
	}

}
