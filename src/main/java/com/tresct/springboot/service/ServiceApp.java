package com.tresct.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tresct.dao.PersonaDAO;
import com.tresct.dao.entities.Persona;

@Service
public class ServiceApp {
	
	@Autowired
	private PersonaDAO personaDAO;
	
	public List<Persona> getAll(){
		return personaDAO.getAll();
	}

}
