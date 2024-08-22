package com.idat.pe.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.idat.pe.interfaz.IDueno;
import com.idat.pe.modelo.Dueno;

@Service
public class AuthService {
	
	@Autowired
	private IDueno idueno;
	
	public Dueno authenticate(String correo, String contrasena) {
		Dueno dueno = idueno.findByCorreo(correo);
		if (dueno != null && dueno.getContrasena().equals(contrasena)) {
            return dueno;
        }
        return null;
	}

}
