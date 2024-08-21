package com.idat.pe.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.pe.modelo.Cita;
import com.idat.pe.servicio.ServicioCita;

@Controller
@RestController
@RequestMapping("/Cita")
public class ControladorCita {
	
	@Autowired
	ServicioCita sc;
	
	@GetMapping("Listar")
	public List<Cita>ListarCita(){
		return sc.listarCita();
	}

	@PostMapping("Ingresar")
	public Cita IngresarCita(@RequestBody Cita c) {
		return sc.ingresarCita(c);
	}
}
