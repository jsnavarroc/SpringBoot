package com.udemy.dao.interfaces;

import com.udemy.model.PersonaModel;

public interface PersonDao {
		PersonaModel findById(Integer id);
}
