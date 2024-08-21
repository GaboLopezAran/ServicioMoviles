package com.idat.pe.modelo;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mascota")
public class Mascota {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_mascota;
	
	private int id_dueno;
	private String nombre;
	private String raza;
	private String sexo;
	private String fecha_nacimiento;
	private String peso;
	private String especie;
	
	public Mascota(int id_mascota, int id_dueno, String nombre, String raza, String sexo, String fecha_nacimiento,
			String peso, String especie) {
		super();
		this.id_mascota = id_mascota;
		this.id_dueno = id_dueno;
		this.nombre = nombre;
		this.raza = raza;
		this.sexo = sexo;
		this.fecha_nacimiento = fecha_nacimiento;
		this.peso = peso;
		this.especie = especie;
	}

	public Mascota() {
		super();
	}

	public int getId_mascota() {
		return id_mascota;
	}

	public void setId_mascota(int id_mascota) {
		this.id_mascota = id_mascota;
	}

	public int getId_dueno() {
		return id_dueno;
	}

	public void setId_dueno(int id_dueno) {
		this.id_dueno = id_dueno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
	
	
	
}
