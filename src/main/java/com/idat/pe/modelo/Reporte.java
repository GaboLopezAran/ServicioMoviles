package com.idat.pe.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="reporte")
public class Reporte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_reporte;
	
	private int id_cita;
	private String diagnostico;
	private String tratamiento;
	private String proxima_visita;
	
	public Reporte(int id_reporte, int id_cita, String diagnostico, String tratamiento, String proxima_visita) {
		super();
		this.id_reporte = id_reporte;
		this.id_cita = id_cita;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
		this.proxima_visita = proxima_visita;
	}

	public Reporte() {
		super();
	}

	public int getId_reporte() {
		return id_reporte;
	}

	public void setId_reporte(int id_reporte) {
		this.id_reporte = id_reporte;
	}

	public int getId_cita() {
		return id_cita;
	}

	public void setId_cita(int id_cita) {
		this.id_cita = id_cita;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getProxima_visita() {
		return proxima_visita;
	}

	public void setProxima_visita(String proxima_visita) {
		this.proxima_visita = proxima_visita;
	}
	
	

}
