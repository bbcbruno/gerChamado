package br.com.amil.model;

@javax.persistence.Entity
public class Pessoa extends Entity {
	
	private String name;
	private String time;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getTime() {
		return time;
	}
	
}
