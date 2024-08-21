package com.idat.pe.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.interfaz.IDueno;
import com.idat.pe.modelo.Dueno;

@Service
public class ServicioDueno {

	@Autowired
	IDueno idueno;
	
	public List<Dueno>listarDueno(){
		
		return (List<Dueno>) idueno.findAll();
	}
	
	public Dueno ingresarDueno(Dueno dueno) {

		return idueno.save(dueno);
	}
}
