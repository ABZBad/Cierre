package com.operaciones.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaciones.model.TiendaModel;
import com.operaciones.repository.TiendaRepository;


@Service
public class TiendaService {

	@Autowired
	TiendaRepository TiendaRepository;
	/*obtener todas */
	public List<TiendaModel> lista(){
		return TiendaRepository.lista_tienda();
	}
	/*obtener por Id*/
	public Optional<TiendaModel> buscarPorId(Long id_tienda){
		return TiendaRepository.idTienda(id_tienda);
	}
	/*agregar una nueva */
	public void saveProcedure(TiendaModel tiendaT){
	        TiendaRepository.saveProcedure(
	                tiendaT.getDescripcion(), 
	        		tiendaT.getTipo_tienda() 
	        		);
	        		
	    }
	/*actualizar por el Id*/
	public void updateProcedure(TiendaModel tiendaT) {
		      TiendaRepository.updateProcedure(
		            tiendaT.getId_tienda(),
		            tiendaT.getDescripcion(), 
	        		tiendaT.getTipo_tienda()
		            
	        		);
        }
}
