/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zbik.zbikproject.service;

import com.zbik.zbikproject.beans.Person;
import com.zbik.zbikproject.dao.PersonDAOInterface;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Muman
 */
public class PersonService implements PersonServiceInterface{
	
	private PersonDAOInterface personDAO;
	
	/* (non-Javadoc)
	 * @see service.PersonServiceInterface#add(beans.Person)
	 */
	@Override
	@Transactional(readOnly = false)
	public void add(Person person) {
		getPersonDAO().add(person);
	}
	
	/* (non-Javadoc)
	 * @see service.PersonServiceInterface#update(beans.Person)
	 */
	@Override
	@Transactional(readOnly = false)
	public void update(Person person) {
		getPersonDAO().update(person);
	}

	/* (non-Javadoc)
	 * @see service.PersonServiceInterface#delete(beans.Person)
	 */
	@Override
	@Transactional(readOnly = false)
	public void delete(Person person) {
		getPersonDAO().delete(person);
	}
	
	/* (non-Javadoc)
	 * @see service.PersonServiceInterface#get(int)
	 */
	@Override
	@Transactional(readOnly = false)
	public Person get(int id) {
		// TODO Auto-generated method stub
		return getPersonDAO().get(id);
	}
	
	/* (non-Javadoc)
	 * @see service.PersonServiceInterface#getAll()
	 */
	@Override
	@Transactional(readOnly = false)
	public List<Person> getAll() {
		return getPersonDAO().getAll();
	}
		
	/* (non-Javadoc)
	 * @see service.PersonServiceInterface#getPersonDAO()
	 */
	@Override
	public PersonDAOInterface getPersonDAO() {
		return personDAO;
	}

	/* (non-Javadoc)
	 * @see service.PersonServiceInterface#setPersonDAO(dao.IPersonDAOInterface)
	 */
	@Override
	public void setPersonDAO(PersonDAOInterface personDAO) {
		this.personDAO = personDAO;
	}
}