package com.operaciones.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaciones.model.BilleteModel;
import com.operaciones.repository.BilleteRepository;

@Service
public class BilleteService {

	@Autowired
	BilleteRepository BilleteRepository;
	/*obtener todas las billete*/
	public List<BilleteModel> lista(){
		return BilleteRepository.lista_billete();
	}
	/*obtener las billete por Id*/
	public Optional<BilleteModel> buscarPorId(Long id_billete){
		return BilleteRepository.idBillete(id_billete);
	}
	/*agregar una nueva moneda*/
	public void save(BilleteModel billete) {
		BilleteRepository.saveProcedure(billete.getValor_billete(), billete.getDescripcion());
	}
	/*actualizar una moneda por el Id*/
	public void updateProcedure(BilleteModel billete) {
		BilleteRepository.updateProcedure(
				billete.getId_billete(),
				billete.getValor_billete(),
				billete.getDescripcion());
	}
}
