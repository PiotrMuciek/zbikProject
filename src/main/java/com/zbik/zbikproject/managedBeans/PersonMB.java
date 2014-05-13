/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zbik.zbikproject.managedBeans;


import com.zbik.zbikproject.beans.Person;
import com.zbik.zbikproject.service.PersonServiceInterface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author Muman
 */
@SessionScoped
@ManagedBean(name = "personMB")
public class PersonMB implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String SUCCESS = "success";
	private static final String ERROR   = "error";
	
	private Person person = new Person();
	
	List<Person> list;
	
	@ManagedProperty(value="#{PersonService}")
	PersonServiceInterface personService;
	
        
	private Person selectedPerson;
	
	public String addPerson(){
		try{
			Person newPerson = person;
			
			getPersonService().add(newPerson);
			
			return SUCCESS;
			
		} catch(DataAccessException e){
			e.printStackTrace();
		}
		
		return ERROR;
		
	}
	
	public String deletePerson(){
		try{
			getPersonService().delete(getSelectedPerson());
			
			return SUCCESS;
			
		} catch(DataAccessException e){
			e.printStackTrace();
		}
		
		return ERROR;
	}
	
	
	/** TOOD**/
	public String updatePerson(){
		try{
			getPersonService().update(getSelectedPerson());
		
		return SUCCESS;
		
		} catch(DataAccessException e){
			e.printStackTrace();
		}
		
		return ERROR;
	}

	public Person getSelectedPerson() {
		return selectedPerson;
	}


	public void setSelectedPerson(Person selectedPerson) {
		this.selectedPerson = selectedPerson;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	public List<Person> getList() {
		list = new ArrayList<Person>();
		list.addAll(getPersonService().getAll());
		
		return list;
	}

	public void setList(List<Person> personList) {
		this.list = personList;
	}

	public PersonServiceInterface getPersonService() {
		return personService;
	}

	public void setPersonService(PersonServiceInterface personService) {
		this.personService = personService;
	}
}
