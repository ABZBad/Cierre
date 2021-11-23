package com.operaciones.model;

import javax.persistence.*;

@Entity
@Table( name = "tipo_tienda")
public class TiendaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id_tienda;
	
	private String tipo_tienda;
	private String descripcion;
	
	public TiendaModel() {
		
	}
	public TiendaModel(Long id_tienda, String tipo_tienda, String descripcion) {
		this.id_tienda = id_tienda;
		this.tipo_tienda = tipo_tienda;
		this.descripcion = descripcion;
	}
	
	public Long getId_tienda() {
		return id_tienda;
	}
	public void setId_tienda(Long id_tienda) {
		this.id_tienda = id_tienda;
	}
	public String getTipo_tienda() {
		return tipo_tienda;
	}
	public void setTipo_tienda(String tipo_tienda) {
		this.tipo_tienda = tipo_tienda;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "TiendaModel [id_tienda=" + id_tienda + ", tipo_tienda=" + tipo_tienda + ", descripcion=" + descripcion
				+ "]";
	}
}


