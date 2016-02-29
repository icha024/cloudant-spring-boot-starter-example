package com.clianz.web;

import java.time.LocalDateTime;

public class Pet {

	public Pet(String name) {
		this.name = name;
	}

	private String name;
	private String date = LocalDateTime.now().toString();

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
