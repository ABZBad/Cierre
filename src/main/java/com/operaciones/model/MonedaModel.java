package com.operaciones.model;

import javax.persistence.*;

@Entity
@Table( name = "moneda")
public class MonedaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)


	private Long id_moneda;
	
	private double valor_moneda = 0.0;
	private String descripcion = " ";
	
	public MonedaModel() {
		
	}
	public MonedaModel(Long id_moneda, double valor_moneda, String descripcion) {
		this.id_moneda = id_moneda;
		this.valor_moneda = valor_moneda;
		this.descripcion = descripcion;
	}
	public Long getId_moneda() {
		return id_moneda;
	}
	public void setId_moneda(Long id_moneda) {
		this.id_moneda = id_moneda;
	}
	public double getValor_moneda() {
		return valor_moneda;
	}
	public void setValor_moneda(double valor_moneda) {
		this.valor_moneda = valor_moneda;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "MonedaModel [id_moneda=" + id_moneda + ", valor_moneda=" + valor_moneda + ", descripcion=" + descripcion
				+ "]";
	}
}
