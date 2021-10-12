package com.operaciones.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaciones.model.MonedaModel;
import com.operaciones.repository.MonedaRepository;

@Service
public class MonedaService {

	@Autowired
	MonedaRepository MonedaRepository;
	
	/*obtener todas las monedas*/
	public List<MonedaModel> lista(){
		return MonedaRepository.lista_moneda();
	}
	/*obtener las monedas por Id*/
	public Optional<MonedaModel> buscarPorId(Long id_moneda){
		return MonedaRepository.idMoneda(id_moneda);
	}
	/*agregar una nueva moneda*/
	public void save(MonedaModel moneda) {
		MonedaRepository.saveProcedure(moneda.getValor_moneda(), moneda.getDescripcion());
	}
	/*actualizar una moneda por el Id*/
	public void updateProcedure(MonedaModel moneda) {
		MonedaRepository.updateProcedure(moneda.getId_moneda(),
				moneda.getValor_moneda(),
				moneda.getDescripcion());

		
	}
}
