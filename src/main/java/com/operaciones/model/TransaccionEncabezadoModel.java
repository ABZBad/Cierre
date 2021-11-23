package com.operaciones.model;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="transaccion_encabezado")
public class TransaccionEncabezadoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private char referencia;
	
	private String opercion_origen;
	private double monto;
	private String operacion_destino;
	private LocalDate fecha;
	
	/*@ManyToOne
	@JoinColumn(name = "id_cliente")
	private ClienteModel cliente;*/
	
	@ManyToOne
	@JoinColumn(name = "id_operacion")
	private OperacionModel operacion;
	
	@ManyToOne
	@JoinColumn(name = "id_pago")
	private PagoModel pago;
	
	public TransaccionEncabezadoModel() {
		
	}
	public TransaccionEncabezadoModel(char referencia, String operecion_origen, double monto, String operacion_destino, LocalDate fecha,
									 OperacionModel operacion, PagoModel pago) {
		this.referencia = referencia;
		this.opercion_origen = operecion_origen;
		this.monto = monto;
		this.operacion_destino = operacion_destino;
		this.fecha = fecha;
		/*this.cliente = cliente;*/
		this.operacion = operacion;
		this.pago = pago;
	}
	public char getReferencia() {
		return referencia;
	}
	public void setReferencia(char referencia) {
		this.referencia = referencia;
	}
	public String getOpercion_origen() {
		return opercion_origen;
	}
	public void setOpercion_origen(String opercion_origen) {
		this.opercion_origen = opercion_origen;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getOperacion_destino() {
		return operacion_destino;
	}
	public void setOperacion_destino(String operacion_destino) {
		this.operacion_destino = operacion_destino;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	/*public ClienteModel getCliente() {
		return cliente;
	}*/
	/*public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}*/
	public OperacionModel getOperacion() {
		return operacion;
	}
	public void setOperacion(OperacionModel operacion) {
		this.operacion = operacion;
	}
	public PagoModel getPago() {
		return pago;
	}
	public void setPago(PagoModel pago) {
		this.pago = pago;
	}
	@Override
	public String toString() {
		return "TransaccionEncabezado [referencia=" + referencia + ", opercion_origen=" + opercion_origen + ", monto="
				+ monto + ", operacion_destino=" + operacion_destino + ", fecha=" + fecha + ", operacion=" + operacion + ", pago=" + pago + "]";
	}
}

