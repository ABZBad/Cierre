package com.operaciones.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaciones.model.TiendaDetalleModel;
import com.operaciones.repository.TiendaDetalleRepository;


@Service
public class TiendaDetalleService {

	@Autowired
	TiendaDetalleRepository TiendaDetalleRepository;
	
	/*obtener todas las monedas*/
	public List<TiendaDetalleModel> lista(){
		return TiendaDetalleRepository.lista_tienda_detalle();
	}
	/*obtener las monedas por Id*/
	public Optional<TiendaDetalleModel> buscarPorId(Long id_detalle){
		return TiendaDetalleRepository.idDetalle(id_detalle);
	}
	/*agregar una nueva moneda*/
	public void saveProcedure(TiendaDetalleModel tiendaD){
	     TiendaDetalleRepository.saveProcedure(
	            tiendaD.getDescripcion(), 
	            tiendaD.getNombre(),
				tiendaD.getToken(),
				tiendaD.getBoveda(),
				tiendaD.getCaja(),
				tiendaD.getCajero(),
				tiendaD.getTienda(),
				tiendaD.getUbicacion());
	    }
	/*actualizar una moneda por el Id*/
	public void updateProcedure(TiendaDetalleModel tiendaD) {
		 TiendaDetalleRepository.updateProcedure(
		            tiendaD.getId_detalle(),
				    tiendaD.getDescripcion(), 
	        		tiendaD.getToken(), 
	        		tiendaD.getBoveda(),
	        		tiendaD.getCaja(),
	        		tiendaD.getCajero(),
	        		tiendaD.getTienda(),
	        		tiendaD.getUbicacion()
	        		);
	 }	
	
}
