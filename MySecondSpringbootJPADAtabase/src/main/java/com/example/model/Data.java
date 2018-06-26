package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.ui.Model;

@Entity
@Table(name="data")
public class Data
{

@Id
int id;
@NotEmpty(message = "*Please provide an id")

String pass;
String name;
String address;
String city;



public Data()
{
	
}
public Data(Model model)
{
	
}
public Data(int id,String pass,String name, String address, String city) {
	super();

	this.id = id;
	this.pass = pass;
	this.name = name;
	this.address = address;
	this.city = city;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}



	
}