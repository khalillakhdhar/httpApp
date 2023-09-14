package com.demonstration.model;

import javax.persistence.Entity;

@Entity
public class Tache extends Audit {
	private String tache;

	public String getTache() {
		return tache;
	}

	public void setTache(String tache) {
		this.tache = tache;
	}

	public Tache(String tache) {
		super();
		this.tache = tache;
	}

	public Tache() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
