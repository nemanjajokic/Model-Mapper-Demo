package io.neca.dto;

import java.util.List;

public class ProfesorDto {

	private String ime;
	private String prezime;
	private String predmet;
	private SkolaDto skola;
	private List<UcenikDto> ucenici;

	public ProfesorDto() {
		super();
	}

	public ProfesorDto(String ime, String prezime, String predmet, SkolaDto skola, List<UcenikDto> ucenici) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.predmet = predmet;
		this.skola = skola;
		this.ucenici = ucenici;
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

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public SkolaDto getSkola() {
		return skola;
	}

	public void setSkola(SkolaDto skola) {
		this.skola = skola;
	}

	public List<UcenikDto> getUcenici() {
		return ucenici;
	}

	public void setUcenici(List<UcenikDto> ucenici) {
		this.ucenici = ucenici;
	}

}
