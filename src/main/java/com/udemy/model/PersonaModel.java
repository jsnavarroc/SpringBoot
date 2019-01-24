package com.udemy.model;

public class PersonaModel {

	private String nombre;
	private String apellido;
	private Integer id;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public PersonaModel() {
	}

	/**
	 * 
	 * @param id
	 * @param apellido
	 * @param nombre
	 */
	public PersonaModel(String nombre, String apellido, Integer id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}