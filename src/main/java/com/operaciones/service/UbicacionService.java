package com.operaciones.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaciones.model.UbicacionModel;
import com.operaciones.repository.UbicacionRepository;

@Service
public class UbicacionService {
	
	@Autowired
	UbicacionRepository UbicacionRepository;
	
	public List<UbicacionModel> lista(){
		return UbicacionRepository.lista_ubicacion();
	}
	
	/*public Optional<UbicacionModel> buscarPorId(Long id_ubicacion){
		return UbicacionRepository.idUbicacion(id_ubicacion);
	}*/
	 /*public void saveProcedure(UbicacionModel ubicacion){
		 UbicacionRepository.saveProcedure(
				    ubicacion.getCiudad(),
				    ubicacion.getEstado(),
				    ubicacion.getPais()
	        		);
	    }
	 
	/*public void updateProcedure(UbicacionModel ubicacion) {
		 UbicacionRepository.updateProcedure(
				    ubicacion.getId_ubicacion(),
				    ubicacion.getCiudad(),
				    ubicacion.getEstado(),
				    ubicacion.getPais()
	        		);

                  }*/
}
