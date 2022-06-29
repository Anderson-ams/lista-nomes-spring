package com.study.app.listaNomes.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class User {
	
	@Id
	private String id;
	@Field
	private String primeiroNome;
	@Field 
	String segundoNome;
	
	public User() {}

	public User(String primeiroNome, String segundoNome) {

		this.id = id;
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	@Override
	public String toString() {
		return String.format("User [id='%s', primeiroNome='%s', segundoNome='%s']", id, primeiroNome, segundoNome);
	}
	
	
}
