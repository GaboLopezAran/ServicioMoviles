package com.idat.pe.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.interfaz.IMascota;
import com.idat.pe.modelo.Mascota;

@Service
public class ServicioMascota {
	
	@Autowired
	IMascota iMascota;
	
	public Mascota ingresarMascota(Mascota mascota) {
		return iMascota.save(mascota);
	}
	
	public List<Mascota>listarMascota(){
		return (List<Mascota>) iMascota.findAll();
	}

}
