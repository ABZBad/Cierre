package com.operaciones.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaciones.model.CajeroModel;
import com.operaciones.repository.CajeroRepository;


@Service
public class CajeroService {

	@Autowired
	CajeroRepository CajeroRepository;
	
	/*obtener todas las monedas*/
	public List<CajeroModel> lista(){
		return CajeroRepository.lista_cajero();
	}
	/*obtener las monedas por Id*/
	public Optional<CajeroModel> buscarPorId(Long n_cajero){
		return CajeroRepository.nCajero(n_cajero);
	}
	
	/*agregar una nueva caja*/
	public void saveProcedure(CajeroModel cajero){
	        CajeroRepository.saveProcedure(
	        		cajero.getEdo_cuenta(), 
	        		cajero.getMonto(), 
	        		cajero.getN_transacciones(), 
	        		cajero.getRetiro(),
	        		cajero.getBilletes(),
	        		cajero.getMonedas()
	        		);
	    
	    }
	/*actualizar una moneda por el Id*/
	public void updateProcedure(CajeroModel cajero) {
		 CajeroRepository.updateProcedure(
		            cajero.getCajero(),
				    cajero.getEdo_cuenta(),
				    cajero.getMonto(), 
	        		cajero.getN_transacciones(), 
	        		cajero.getRetiro(), 
	        		cajero.getBilletes(),
	        		cajero.getMonedas()
	        		
	        		);
            
       }
}
