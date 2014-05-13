/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zbik.zbikproject.dao;

import com.zbik.zbikproject.beans.Person;
import java.util.List;

/**
 *
 * @author Muman
 */
public interface PersonDAOInterface {
    	public void add(Person person);
	public void update(Person person);
	public void delete(Person person);
	public Person get(int id);
	public List<Person> getAll();
}
