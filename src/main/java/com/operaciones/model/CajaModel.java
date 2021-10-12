package com.operaciones.model;

import java.time.*;

import javax.persistence.*;

@Entity
@Table( name = "caja")
public class CajaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long n_caja;
	
	private LocalDate apertura = LocalDate.now();
	private LocalDate cierre = LocalDate.now();
	private Integer cantidad_moneda = 0;
	private Integer cantidad_billete = 0;
	private String estatus = "cerrada";
	
	@ManyToOne
	@JoinColumn(name="id_moneda")
	private MonedaModel monedas;
	
	@ManyToOne
	@JoinColumn(name = "id_billete")
	private BilleteModel billetes;
	
	public CajaModel() {
		
	}
	public CajaModel(Long n_caja, LocalDate apertura, LocalDate cierre,Integer cantidad_moneda, Integer cantidad_billete, String estatus, MonedaModel monedas, BilleteModel billetes) {
		this.n_caja = n_caja;
		this.apertura = apertura;
		this.cierre = cierre;
		this.cantidad_moneda = cantidad_moneda;
		this.cantidad_billete = cantidad_billete;
		this.monedas = monedas;
		this.billetes = billetes;
	}
	public Long getN_caja() {
		return n_caja;
	}
	public void setN_caja(Long n_caja) {
		this.n_caja = n_caja;
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
	public Integer getCantidad_moneda() {
		return cantidad_moneda;
	}
	public void setCantidad_moneda(Integer cantidad_moneda) {
		this.cantidad_moneda = cantidad_moneda;
	}
	public Integer getCantidad_billete() {
		return cantidad_billete;
	}
	public void setCantidad_billete(Integer cantidad_billete) {
		this.cantidad_billete = cantidad_billete;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public MonedaModel getMonedas() {
		return monedas;
	}
	public void setMonedas(MonedaModel monedas) {
		this.monedas = monedas;
	}
	public BilleteModel getBilletes() {
		return billetes;
	}
	public void setBilletes(BilleteModel billetes) {
		this.billetes = billetes;
	}
	@Override
	public String toString() {
		return "CajaModel [n_caja=" + n_caja + ", apertura=" + apertura + ", cierre=" + cierre + ", cantidad_moneda="
				+ cantidad_moneda + ", cantidad_billete=" + cantidad_billete + ", estatus=" + estatus + ", monedas="
				+ monedas + ", billetes=" + billetes + "]";
	}
}
