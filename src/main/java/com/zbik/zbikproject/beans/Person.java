/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zbik.zbikproject.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Muman
 */
@Entity
@Table(name = "persons")
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8405305032244504596L;
	
	private int id;
	private String firstname;
	private String surname;
	private String city;
	
	private String field1;
	private String field2;
	private String field3;
	
	private String value1;
	private String value2;
	private String value3;
	
	public Person(){
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID",unique = true, nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "FIRSTNAME",unique = false, nullable = false)
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	@Column(name = "SURNAME",unique = false, nullable = false)
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Column(name = "CITY",unique = false, nullable = false)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name = "FIELD1",unique = false, nullable = true)
	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	@Column(name = "FIELD2",unique = false, nullable = true)
	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	@Column(name = "FIELD3",unique = false, nullable = true)
	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}
	
	@Column(name = "VALUE1",unique = false, nullable = true)
	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}
	
	@Column(name = "VALUE2",unique = false, nullable = true)
	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}
	
	@Column(name = "VALUE3",unique = false, nullable = true)
	public String getValue3() {
		return value3;
	}

	public void setValue3(String value3) {
		this.value3 = value3;
	}
}