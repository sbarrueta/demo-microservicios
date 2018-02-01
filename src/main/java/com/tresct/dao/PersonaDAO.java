package com.tresct.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tresct.dao.entities.Persona;
 

@Component
public class PersonaDAO {

	private List<Persona> lista = Arrays.asList(
			new Persona("Soledad",25,"F"),
			new Persona("Felix",30,"M"),
			new Persona("Pedro",5,"F")
			);
	
	public List<Persona> getAll(){
		return lista;
	}
}
