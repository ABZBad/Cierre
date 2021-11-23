package com.operaciones.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaciones.repository.CajaRepository;
import com.operaciones.model.CajaModel;


@Service
public class CajaService {

	@Autowired
	CajaRepository CajaRepository;
	
	/*obtener todas las monedas*/
	public List<CajaModel> lista(){
		return CajaRepository.lista_caja();
	}
	/*obtener las monedas por Id*/
	public Optional<CajaModel> buscarPorId(Long n_caja){
		return CajaRepository.idProcedure(n_caja);
	}
	
	/*agregar una nueva caja*/
	public void saveCaja(CajaModel caja) {
		CajaRepository.saveProcedure(
				caja.getApertura(), 
				caja.getCantidad_billete(), 
				caja.getCantidad_moneda(), 
				caja.getCierre(), 
				caja.getEstatus(), 
				caja.getBilletes(), 
				caja.getMonedas());
	}
	/*actualizar una moneda por el Id*/
	public void updateProcedure(CajaModel caja) {
		CajaRepository.updateProcedure(caja.getN_caja(),
				caja.getApertura(), 
				caja.getCantidad_billete(), 
				caja.getCantidad_moneda(), 
				caja.getCierre(), 
				caja.getEstatus(), 
				caja.getBilletes(), 
				caja.getMonedas());
	
	
	
     }
}
