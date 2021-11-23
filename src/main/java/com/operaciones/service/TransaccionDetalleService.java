package com.operaciones.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaciones.model.TransaccionDetalleModel;
import com.operaciones.repository.TransaccionDetalleRepository;


@Service
public class TransaccionDetalleService {

	@Autowired
	TransaccionDetalleRepository TransaccionDetalleRepository;
	/*obtener todas las monedas*/
	public List<TransaccionDetalleModel> lista(){
		return TransaccionDetalleRepository.lista_transaccion_detalle();
	}
	/*obtener las monedas por Id*/
	public Optional<TransaccionDetalleModel> buscarPorId(Long id_tdetalle){
		return TransaccionDetalleRepository.idTdetalle(id_tdetalle);
	}
	/*agregar una nueva moneda*/
	
	 
		public void saveProcedure(TransaccionDetalleModel  transaccionD){
	        TransaccionDetalleRepository.saveProcedure(
	                transaccionD.getApertura(), 
	        		transaccionD.getCierre(), 
	        		transaccionD.getEstatus(), 
	        		transaccionD.getReferencia()
	        		);
	    
	}
	/*actualizar una moneda por el Id*/
	public void updateProcedure(TransaccionDetalleModel transaccionD) {
		 TransaccionDetalleRepository.updateProcedure(
		            transaccionD.getId_Tdetalle(),
				    transaccionD.getApertura(), 
	        		transaccionD.getCierre(), 
	        		transaccionD.getEstatus(), 
	        		transaccionD.getReferencia()
	        		
	        		);

		
	}
}
