package com.operaciones.model;

import javax.persistence.*;

@Entity
@Table( name = "pago")
public class PagoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)


	private Long id_pago;
	
	private String tipo_pago;
	
	public PagoModel() {
		
	}
	public PagoModel(Long id_pago, String tipo_pago) {
		this.id_pago = id_pago;
		this.tipo_pago = tipo_pago;
	}
	public Long getId_pago() {
		return id_pago;
	}
	public void setId_pago(Long id_pago) {
		this.id_pago = id_pago;
	}
	public String getTipo_pago() {
		return tipo_pago;
	}
	public void setTipo_pago(String tipo_pago) {
		this.tipo_pago = tipo_pago;
	}
	@Override
	public String toString() {
		return "PagoModel [id_pago=" + id_pago + ", tipo_pago=" + tipo_pago + "]";
	}
}
	


