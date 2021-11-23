package com.operaciones.model;

import javax.persistence.*;

@Entity
@Table( name="ubicacion")
public class UbicacionModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id_ubicacion;
	
	private String pais;
	private String estado;
	private String ciudad;
	
	/*@ManyToOne
	@JoinColumn(name="SKU")
	private ArticuloModel articulo;*/
	
	public UbicacionModel() {
		
	}
	public UbicacionModel(Long id_ubicacion, String pais, String estado, String ciudad) {
		this.id_ubicacion = id_ubicacion;
		this.pais = pais;
		this.estado = estado;
		this.ciudad = ciudad;
		/*this.articulo = articulo;*/
	}
	public Long getId_ubicacion() {
		return id_ubicacion;
	}
	public void setId_ubicacion(Long id_ubicacion) {
		this.id_ubicacion = id_ubicacion;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	/*public ArticuloModel getArticulo() {
		return articulo;
	}*/
	/*public void setArticulo(ArticuloModel articulo) {
		this.articulo = articulo;
	}*/
	@Override
	public String toString() {
		return "UbicacionModel [id_ubicacion=" + id_ubicacion + ", pais=" + pais + ", estado=" + estado + ", ciudad="
				+ ciudad + "]";
	}

}
