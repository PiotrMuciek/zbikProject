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
public interface PersonServiceInterface {

	@Transactional(readOnly = false)
	public abstract void add(Person person);

	@Transactional(readOnly = false)
	public abstract void update(Person person);

	@Transactional(readOnly = false)
	public abstract void delete(Person person);

	@Transactional(readOnly = false)
	public abstract Person get(int id);

	@Transactional(readOnly = false)
	public abstract List<Person> getAll();

	public abstract PersonDAOInterface getPersonDAO();

	public abstract void setPersonDAO(PersonDAOInterface personDAO);
}