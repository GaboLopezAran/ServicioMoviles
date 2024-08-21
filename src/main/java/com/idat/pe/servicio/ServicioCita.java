package com.idat.pe.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.interfaz.ICita;
import com.idat.pe.modelo.Cita;

@Service
public class ServicioCita {

	@Autowired
	ICita iCita;
	
	public List<Cita>listarCita(){
		return (List<Cita>)iCita.findAll();
	}
	
	public Cita ingresarCita(Cita cita) {
		return iCita.save(cita);
	}
	
	
}
