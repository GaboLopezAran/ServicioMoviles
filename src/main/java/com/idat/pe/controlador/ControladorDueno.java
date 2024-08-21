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
import com.idat.pe.servicio.ServicioDueno;

@Controller
@RestController
@RequestMapping("/Dueno")
public class ControladorDueno {
	
	@Autowired
	ServicioDueno sc;
	
	@GetMapping("Listar")
	public List<Dueno>ListarDueno(){
		return sc.listarDueno();
	}
	
	@PostMapping("Ingresar")
	public Dueno IngresarDueno(@RequestBody Dueno d ) {
		return sc.ingresarDueno(d);
	}
	

}
