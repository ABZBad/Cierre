package com.operaciones.model;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table( name = "transaccion_detalle")
public class TransaccionDetalleModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id_Tdetalle;
	
	private LocalDate apertura;
	private LocalDate cierre;
	private String estatus;
	
	@ManyToOne
	@JoinColumn(name = "referencia")
	private TransaccionEncabezadoModel referencia;
	
	public TransaccionDetalleModel() {
		
	}
	public TransaccionDetalleModel(Long id_Tdetalle, LocalDate apertura, LocalDate cierre, String estatus, TransaccionEncabezadoModel referenica) {
		this.id_Tdetalle = id_Tdetalle;
		this.apertura = apertura;
		this.cierre = cierre;
		this.estatus = estatus;
	}
	public Long getId_Tdetalle() {
		return id_Tdetalle;
	}
	public void setId_Tdetalle(Long id_Tdetalle) {
		this.id_Tdetalle = id_Tdetalle;
	}
	public LocalDate getApertura() {
		return apertura;
	}
	public void setApertura(LocalDate apertura) {
		this.apertura = apertura;
	}
	public LocalDate getCierre() {
		return cierre;
	}
	public void setCierre(LocalDate cierre) {
		this.cierre = cierre;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public TransaccionEncabezadoModel getReferencia() {
		return referencia;
	}
	public void setReferencia(TransaccionEncabezadoModel referencia) {
		this.referencia = referencia;
	}
	@Override
	public String toString() {
		return "TransaccionDetalle [id_Tdetalle=" + id_Tdetalle + ", apertura=" + apertura + ", cierre=" + cierre
				+ ", estatus=" + estatus + ", referencia=" + referencia + "]";
	}
}


