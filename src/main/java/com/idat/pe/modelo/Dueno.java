package com.idat.pe.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="dueno")
public class Dueno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_dueno;
	
	private String nombre;
	private String apellidos;
	private int dni;
	private String direccion;
	private String correo;
	private int telefono;
	private String contrasena;
	
	public Dueno(int id_dueno, String nombre, String apellidos, int dni, String direccion, String correo, int telefono,
			String contrasena) {
		super();
		this.id_dueno = id_dueno;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.contrasena = contrasena;
	}

	public Dueno() {
		super();
	}

	public int getId_dueno() {
		return id_dueno;
	}

	public void setId_dueño(int id_dueno) {
		this.id_dueno = id_dueno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	
	
}
