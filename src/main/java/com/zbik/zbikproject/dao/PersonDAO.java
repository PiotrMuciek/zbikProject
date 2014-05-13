/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zbik.zbikproject.dao;

import com.zbik.zbikproject.beans.Person;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Muman
 */
@Repository
public class PersonDAO implements PersonDAOInterface{

	private SessionFactory sessionFactory;

	public void add(Person person) {
		getSessionFactory().getCurrentSession().save(person);
	}

	public void update(Person person) {
		getSessionFactory().getCurrentSession().update(person);
	}

	public void delete(Person person) {
		getSessionFactory().getCurrentSession().delete(person);
	}

	public Person get(int id) {
	       List<Person> list = getSessionFactory().getCurrentSession()
                   .createQuery("from Person where id=?")
                   .setParameter(0, id).list();
	       return (Person)list.get(0);
	}

	public List<Person> getAll() {
		   List list = getSessionFactory().getCurrentSession().createQuery("from Person").list();
	       return list;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
