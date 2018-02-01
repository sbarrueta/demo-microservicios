package com.tresct.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tresct.dao.entities.Persona;
import com.tresct.springboot.service.ServiceApp;

@RestController
public class ControladorSaluda {
	
	@Autowired
	private ServiceApp serviceApp;
	
	@RequestMapping("/saludar")
	public String saludar() {
		return "Hola desde tresct controller";
	}
	
	@RequestMapping("/personas")
	public List<Persona> getAll(){
		return serviceApp.getAll();
	}
	
	

}
