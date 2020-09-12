package io.neca.dto;

import java.util.List;

public class SkolaDto {

	private String ime;
	private String tip;
	private String mesto;
	private List<ProfesorDto> profesori;
	private List<UcenikDto> ucenici;

	public SkolaDto() {
		super();
	}

	public SkolaDto(String ime, String tip, String mesto, List<ProfesorDto> profesori, List<UcenikDto> ucenici) {
		super();
		this.ime = ime;
		this.tip = tip;
		this.mesto = mesto;
		this.profesori = profesori;
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

	public List<ProfesorDto> getProfesori() {
		return profesori;
	}

	public void setProfesori(List<ProfesorDto> profesori) {
		this.profesori = profesori;
	}

	public List<UcenikDto> getUcenici() {
		return ucenici;
	}

	public void setUcenici(List<UcenikDto> ucenici) {
		this.ucenici = ucenici;
	}

}
