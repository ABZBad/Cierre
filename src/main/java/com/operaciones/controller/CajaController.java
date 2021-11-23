package com.operaciones.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.operaciones.model.CajaModel;
import com.operaciones.service.CajaService;

@RestController
@RequestMapping("/cajas")
public class CajaController {

	@Autowired
	CajaService CajaService;
	
	/*obtener todas las monedas*/
	
	@RequestMapping("/lista")
	public ResponseEntity<List<CajaModel>> lista(){
		List<CajaModel> lista = CajaService.lista();
		return new ResponseEntity(lista, HttpStatus.OK);
	}
	
	/*obtener todas las monedas por Id*/
	@GetMapping("/verid/{n_caja}")
	public ResponseEntity<CajaModel> verId(@PathVariable("n_caja") Long n_caja){ 
		Optional<CajaModel> caja = CajaService.buscarPorId(n_caja);
		return new ResponseEntity(caja, HttpStatus.OK);
	}
	/*guardar una nueva moneda*/
	@PostMapping("/nuevo")
	public ResponseEntity<?> saveCaja(@RequestBody  CajaModel caja){
		CajaService.saveCaja(caja);
		return new ResponseEntity("guardado", HttpStatus.CREATED);
	}
	
    @PutMapping("/actualizar")
    public ResponseEntity<?> updateCaja(@RequestBody  CajaModel caja){
	CajaService.updateProcedure(caja);
    return new ResponseEntity("actulizada", HttpStatus.CREATED);
    
    }
}
