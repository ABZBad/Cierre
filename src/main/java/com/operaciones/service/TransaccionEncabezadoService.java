package com.operaciones.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaciones.model.TransaccionEncabezadoModel;
import com.operaciones.repository.TransaccionEncabezadoRepository;


@Service
public class TransaccionEncabezadoService {

	@Autowired
	TransaccionEncabezadoRepository TransaccionEncabezadoRepository;
	
	/*obtener todas las monedas*/
	public List<TransaccionEncabezadoModel> lista(){
		return TransaccionEncabezadoRepository.lista_transacion_encabezado();
	}
	/*obtener las monedas por Id*/
	public Optional<TransaccionEncabezadoModel> buscarPorId(Long id_referencia){
		return TransaccionEncabezadoRepository.idReferencia(id_referencia);
	}
	/*agregar una nueva moneda*/
	
	 public void saveProcedure(TransaccionEncabezadoModel transaccionE){
	     TransaccionEncabezadoRepository.saveProcedure(
	                transaccionE.getFecha(), 
	        		transaccionE.getMonto(), 
	        		transaccionE.getOperacion_destino(), 
	        		transaccionE.getOpercion_origen(),
	        		transaccionE.getOperacion(),
	        		transaccionE.getPago()
	        		);
	    }
	
	/*actualizar una moneda por el Id*/
	public void updateProcedure(TransaccionEncabezadoModel transaccionE) {
		 TransaccionEncabezadoRepository.updateProcedure(
		            transaccionE.getReferencia(),
				    transaccionE.getFecha(), 
	        		transaccionE.getMonto(), 
	        		transaccionE.getOperacion_destino(), 
	        		transaccionE.getOpercion_origen(),
	        		transaccionE.getOperacion(),
	        		transaccionE.getPago()
	        		
	        		);

		
	         }
	}

