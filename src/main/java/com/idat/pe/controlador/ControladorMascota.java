package com.idat.pe.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.pe.modelo.Dueno;
import com.idat.pe.modelo.Mascota;
import com.idat.pe.servicio.ServicioMascota;

@Controller
@RestController
@RequestMapping("/Mascota")
public class ControladorMascota {
	
	@Autowired
	ServicioMascota sc;
	
	@PostMapping("Ingresar")
	public Mascota IngresarMascota(@RequestBody Mascota m ) {
		return sc.ingresarMascota(m);
	}
	
	@GetMapping("Listar")
	public List<Mascota>ListarMascota(){
		return sc.listarMascota();
	}

}
