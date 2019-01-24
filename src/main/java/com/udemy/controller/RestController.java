package com.udemy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udemy.dao.interfaces.PersonDao;
import com.udemy.model.PersonaModel;
import com.udemy.repository.PersonRepository;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/user")
public class RestController {
	
	@Autowired
	PersonRepository personRepository;
	@Autowired
	PersonDao person;
	/**
	 * Este metodo indica si esta corriendo 
	 * @return
	 */
	@GetMapping
	public String check() {
		return "Welcome to Java Inspires";
	}
	
	/**
	 * Este metodo recupera un objeto y retorna un JSON
	 * @return PersonaModel 
	 */
	@GetMapping("/userObject")
	public ResponseEntity<PersonaModel> checkRest(){
		PersonaModel per = new PersonaModel("Johan", "Navarro", 123);
		return  new ResponseEntity<>(per,HttpStatus.OK);
	}
	
	/**
	 * Este metodo recupera un objeto y retorna un JSON
	 * la variable Value se tiene que llamar igual a la que toma el metodo
	 * @return PersonaModel 
	 */
	@GetMapping(value = "/{id}")
	public PersonaModel getFindPerson(@PathVariable Integer id){
		return person.findById(id);
	}
	
	/**
	 * Conectado con la BD de MYSQL
	 * Falta indicar que es un JSON
	 * @return
	 */
	@GetMapping(path="/userName")
	public List<String> getAllUserNames(){
		return personRepository.getAllUserNames();
	}
}
