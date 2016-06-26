package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "SIPARIS")
@Component
public class Siparis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String corba;
	private String yemek;
	private String tatli;


	@OneToOne
    @JoinColumn(name = "masa_id", unique = true)
    private Masa masa;

	public Siparis() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCorba() {
		return corba;
	}

	public void setCorba(String corba) {
		this.corba = corba;
	}

	public String getYemek() {
		return yemek;
	}

	public void setYemek(String yemek) {
		this.yemek = yemek;
	}

	public String getTatli() {
		return tatli;
	}

	public void setTatli(String tatli) {
		this.tatli = tatli;
	}

	public Masa getMasa() {
		return masa;
	}

	public void setMasa(Masa masa) {
		this.masa = masa;
	}
	
	

	

}