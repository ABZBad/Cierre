package com.operaciones.model;

import javax.persistence.*;

@Entity
@Table( name = "operacion")
public class OperacionModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)


	private Long id_operacion;
	
	private String tipo_operacion;
	
	public OperacionModel() {
		
	}
	public OperacionModel(Long id_operacion, String tipo_operacion) {
		this.id_operacion = id_operacion;
		this.tipo_operacion = tipo_operacion;
	}
	public Long getId_operacion() {
		return id_operacion;
	}
	public void setId_operacion(Long id_operacion) {
		this.id_operacion = id_operacion;
	}
	public String getTipo_operacion() {
		return tipo_operacion;
	}
	public void setTipo_operacion(String tipo_operacion) {
		this.tipo_operacion = tipo_operacion;
	}
	@Override
	public String toString() {
		return "OperacionModel [id_operacion=" + id_operacion + ", tipo_operacion=" + tipo_operacion + "]";
	}
}