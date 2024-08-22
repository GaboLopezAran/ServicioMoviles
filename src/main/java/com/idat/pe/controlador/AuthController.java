package com.idat.pe.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.pe.modelo.Dueno;
import com.idat.pe.modelo.LoginRequest;
import com.idat.pe.servicio.AuthService;

@RestController
@RequestMapping("/api")
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	@PostMapping("/login")
	public ResponseEntity<String> login (@RequestBody LoginRequest request){
		Dueno dueno = authService.authenticate(request.getCorreo(), request.getContrasena());
		if(dueno != null) {
			return ResponseEntity.ok("Inicio de sesión exitoso");
		} else {
			return ResponseEntity.status(401).body("Credenciales Invalidas");
		}
	}
}
