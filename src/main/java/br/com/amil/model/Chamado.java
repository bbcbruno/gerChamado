package br.com.amil.model;

import javax.persistence.OneToOne;

@javax.persistence.Entity
public class Chamado extends Entity {
	
	private String numero;
	
	@OneToOne
	private Pessoa atendente;
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setAtendente(Pessoa atendente) {
		this.atendente = atendente;
	}
	
	public Pessoa getAtendente() {
		return atendente;
	}
	
}
