package com.udemy.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {
	
	@Autowired 
	JdbcTemplate jdbcTemplate;
	
	public List<String> getAllUserNames(){
		List <String> usernameList = new ArrayList<>();
		usernameList.addAll(jdbcTemplate.queryForList("SELECT nombre FROM persona;", String.class));
		return usernameList;	
	}

}
