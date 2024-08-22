package com.idat.pe.interfaz;

import org.springframework.data.repository.CrudRepository;

import com.idat.pe.modelo.Dueno;

public interface IDueno extends CrudRepository<Dueno, Integer>  {
	
	Dueno findByCorreo(String correo);
}
