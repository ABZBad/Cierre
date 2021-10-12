package com.operaciones.model;

import javax.persistence.*;

@Entity
@Table( name = "tienda_detalle")
public class TiendaDetalleModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id_detalle;
	
	private String nombre;
	private String descripcion;
	
	/*@ManyToOne
	@JoinColumn(name = "matricula")
	private EmpleadoModel matricula;*/
	
	@ManyToOne
	@JoinColumn(name = "id_ubicacion")
	private UbicacionModel ubicacion;
	
	@ManyToOne
	@JoinColumn(name = "id_tienda")
	private TiendaModel tienda;
	
	@ManyToOne
	@JoinColumn(name = "n_caja")
	private CajaModel caja;
	
	@ManyToOne
	@JoinColumn(name = "n_boveda")
	private BovedaModel boveda;
	
	@ManyToOne
	@JoinColumn(name = "n_cajero")
	private CajeroModel cajero;
	
	/*@ManyToOne
	@JoinColumn(name = "id_cliente")
	private ClienteModel cliente;*/
	
	private char token;
	
	public TiendaDetalleModel() {
		
	}
	
	public TiendaDetalleModel(Long id_detalle, String nombre, String descripcion, UbicacionModel ubicacion,
								TiendaModel tienda, CajaModel caja, BovedaModel boveda, CajeroModel cajero,  char token) {
		this.id_detalle = id_detalle;
		this.nombre = nombre;
		this.descripcion = descripcion;
		/*this.matricula = matricula;*/
		this.ubicacion = ubicacion;
		this.tienda = tienda;
		this.caja = caja;
		this.boveda = boveda;
		this.cajero = cajero;
		/*this.cliente = cliente;*/
		this.token = token;
	}
	public Long getId_detalle() {
		return id_detalle;
	}

	public void setId_detalle(Long id_detalle) {
		this.id_detalle = id_detalle;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/*public EmpleadoModel getMatricula() {
		return matricula;
	}*/

	/*public void setMatricula(EmpleadoModel matricula) {
		this.matricula = matricula;
	}*/

	public UbicacionModel getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(UbicacionModel ubicacion) {
		this.ubicacion = ubicacion;
	}

	public TiendaModel getTienda() {
		return tienda;
	}

	public void setTienda(TiendaModel tienda) {
		this.tienda = tienda;
	}

	public CajaModel getCaja() {
		return caja;
	}

	public void setCaja(CajaModel caja) {
		this.caja = caja;
	}

	public BovedaModel getBoveda() {
		return boveda;
	}

	public void setBoveda(BovedaModel boveda) {
		this.boveda = boveda;
	}

	public CajeroModel getCajero() {
		return cajero;
	}

	public void setCajero(CajeroModel cajero) {
		this.cajero = cajero;
	}

	/*public ClienteModel getCliente() {
		return cliente;
	}*/

	/*public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}*/

	public char getToken() {
		return token;
	}

	public void setToken(char token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "TiendaDetalleModel [id_detalle=" + id_detalle + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", ubicacion=" + ubicacion + ", tienda=" + tienda + ", caja=" + caja
				+ ", boveda=" + boveda + ", cajero=" + cajero + ",  token=" + token + "]";
	}
}


