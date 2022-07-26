package com.calarcars.springboot.app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document( collection = "clientes" )
public class Cliente {
	
	@Id
	private String id;
	
	private String name;
	
	private String birthday;

	public Cliente() {
	}

	public Cliente(String id, String name, String birthday) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}
