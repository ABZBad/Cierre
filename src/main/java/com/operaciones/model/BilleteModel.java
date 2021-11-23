package com.operaciones.model;
import javax.persistence.*;

@Entity
@Table( name = "billete")
public class BilleteModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_billete;
	
	private Integer valor_billete = 0;
	private String descripcion = " ";
	
	public BilleteModel() {
		
	}
	public BilleteModel(Long id_billete, Integer valor_billete, String descripcion) {
		this.id_billete = id_billete;
		this.valor_billete = valor_billete;
		this.descripcion = descripcion;
	}
	public Long getId_billete() {
		return id_billete;
	}
	public void setId_billete(Long id_billete) {
		this.id_billete = id_billete;
	}
	public Integer getValor_billete() {
		return valor_billete;
	}
	public void setValor_billete(Integer valor_billete) {
		this.valor_billete = valor_billete;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "BilleteModel [id_billete=" + id_billete + ", valor_billete=" + valor_billete + ", descripcion="
				+ descripcion + "]";
	}
}
