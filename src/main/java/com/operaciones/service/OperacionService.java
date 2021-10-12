package com.operaciones.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaciones.model.OperacionModel;
import com.operaciones.repository.*;


@Service
public class OperacionService {

	@Autowired
	OperacionRepository OperacionRepository;
	
	/*obtener todas las monedas*/
	public List<OperacionModel> lista(){
		return OperacionRepository.lista_operacion();
	}
	/*obtener las monedas por Id*/
	public Optional<OperacionModel> buscarPorId(Long id_operacion){
		return OperacionRepository.idOperacion(id_operacion);
	}
	/*agregar una nueva moneda*/
	public void save(OperacionModel operacion) {
		OperacionRepository.saveProcedure(operacion.getTipo_operacion());
	}
	/*actualizar una moneda por el Id*/
	public void updateProcedure(OperacionModel operacion) {
		OperacionRepository.updateProcedure(operacion.getId_operacion(),
				operacion.getTipo_operacion());

		
	}
}
