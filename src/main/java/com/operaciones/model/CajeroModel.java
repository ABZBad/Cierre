package com.operaciones.model;
import javax.persistence.*;

@Entity
@Table( name = "cajero_automatico")
public class CajeroModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)


	private Long n_cajero;
	
	private double monto = 0.0;
	private Integer n_transacciones = 0;
	private String edo_cuenta = "estable";
	private double retiro = 0.0;
	
	@ManyToOne
	@JoinColumn(name="id_moneda")
	private MonedaModel monedas;
	
	@ManyToOne
	@JoinColumn(name = "id_billete")
	private BilleteModel billetes;
	
	public CajeroModel() {
		
	}
	public CajeroModel(Long n_cajero, double monto, Integer n_transacciones, String edo_cuenta, double retiro, MonedaModel monedas, BilleteModel billetes) {
		this.n_cajero = n_cajero;
		this.monto = monto;
		this.n_transacciones = n_transacciones;
		this.edo_cuenta = edo_cuenta;
		this.retiro = retiro;
		this.monedas = monedas;
		this.billetes = billetes;
	}
	
	public Long getCajero() {
		return n_cajero;
	}
	public void setCajero(Long n_cajero) {
		this.n_cajero = n_cajero;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public Integer getN_transacciones() {
		return n_transacciones;
	}
	public void setN_transacciones(Integer n_transacciones) {
		this.n_transacciones = n_transacciones;
	}
	public String getEdo_cuenta() {
		return edo_cuenta;
	}
	public void setEdo_cuenta(String edo_cuenta) {
		this.edo_cuenta = edo_cuenta;
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
		return "CajeroModel [n_cajero=" + n_cajero + ", monto=" + monto + ", n_transacciones=" + n_transacciones
				+ ", edo_cuenta=" + edo_cuenta + ", retiro=" + retiro + ", monedas=" + monedas + ", billetes="
				+ billetes + "]";
	}
}
