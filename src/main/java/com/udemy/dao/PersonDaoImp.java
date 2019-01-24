package com.udemy.dao;

import org.springframework.stereotype.Component;

import com.udemy.dao.interfaces.PersonDao;
import com.udemy.model.PersonaModel;

@Component
public class PersonDaoImp implements PersonDao {

	@Override
	public PersonaModel findById(Integer id) {
		// TODO Auto-generated method stub
		return new PersonaModel("Johan", "Navarro", id);
	}

}
