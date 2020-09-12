package io.neca.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Profesor {

	@Id
	private String ime;
	private String prezime;
	private String predmet;
	@ManyToOne
	@JoinColumn(name = "skola")
	private Skola skola;
	@ManyToMany(mappedBy = "profesori")
	private List<Ucenik> ucenici;

	public Profesor() {
		super();
	}

	public Profesor(String ime, String prezime, String predmet, Skola skola, List<Ucenik> ucenici) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.predmet = predmet;
		this.skola = skola;
		this.ucenici = ucenici;
	}

	public Skola getSkola() {
		return skola;
	}

	public void setSkola(Skola skola) {
		this.skola = skola;
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

}
