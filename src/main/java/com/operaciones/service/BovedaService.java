package com.operaciones.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaciones.model.BovedaModel;
import com.operaciones.repository.BovedaRepository;


@Service
public class BovedaService {
	
	@Autowired
	BovedaRepository bovedarepository;
	
	public List<BovedaModel> lista(){
		return bovedarepository.lista_boveda();
	}
	
	public Optional<BovedaModel> buscarPorId(Long n_boveda){
		return bovedarepository.nBoveda(n_boveda);
	}

	public void saveProcedure(BovedaModel boveda){
	    bovedarepository.saveProcedure(
	                boveda.getDeposito(), 
	        		boveda.getMonto(), 
	        		boveda.getRetiro(), 
	        		boveda.getBilletes(),
	        		boveda.getMonedas()
	        		);
	    }
	
	public void updateProcedure(BovedaModel boveda) {
		 bovedarepository.updateProcedure(
		        boveda.getN_boveda(),
			    boveda.getMonto(), 
				boveda.getDeposito(),
				boveda.getRetiro(),
				boveda.getMonedas(),
				boveda.getBilletes() 
				);
	}

}
