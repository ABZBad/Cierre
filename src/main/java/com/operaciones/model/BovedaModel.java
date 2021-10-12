package com.operaciones.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table( name = "boveda")
public class BovedaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long n_boveda;
	
	private double monto = 0.0;
	private double deposito = 0.0;
	private double retiro = 0.0;
	
	@ManyToOne
	@JoinColumn(name="id_moneda")
	private MonedaModel monedas;
	
	@ManyToOne
	@JoinColumn(name = "id_billete")
	private BilleteModel billetes;
	
	public BovedaModel() {
		
	}
	public BovedaModel(Long n_boveda, double monto, double deposito, double retiro, MonedaModel monedas, BilleteModel billetes) {
		this.n_boveda = n_boveda;
		this.monto = monto;
		this.deposito = deposito;
		this.retiro = retiro;
		this.monedas = monedas;
		this.billetes = billetes;
	}
	public Long getN_boveda() {
		return n_boveda;
	}
	public void setN_boveda(Long n_boveda) {
		this.n_boveda = n_boveda;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public double getDeposito() {
		return deposito;
	}
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	public double getRetiro() {
		return retiro;
	}
	public void setRetiro(double retiro) {
		this.retiro = retiro;
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
		return "Boveda [n_boveda=" + n_boveda + ", monto=" + monto + ", deposito=" + deposito + ", retiro=" + retiro
				+ ", monedas=" + monedas + ", billetes=" + billetes + "]";
	}
}
