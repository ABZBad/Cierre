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

import com.operaciones.model.BilleteModel;
import com.operaciones.service.BilleteService;

@RestController
@RequestMapping("/billetes")
public class BilleteController {

	@Autowired
	BilleteService BilleteService; 
	/*obtener todos los billetes*/
	@RequestMapping("/lista")
	public ResponseEntity<List<BilleteModel>> lista(){
		List<BilleteModel> lista = BilleteService.lista();
		return new ResponseEntity(lista, HttpStatus.OK);
	}
	
	@GetMapping("/verid/{id_billete}")
	public ResponseEntity<BilleteModel> verId(@PathVariable("id_billete") Long id_billete){ 
	Optional<BilleteModel> billete = BilleteService.buscarPorId(id_billete);
	return new ResponseEntity(billete, HttpStatus.OK);
	}
	
	/*guardar una nueva moneda*/
	@PostMapping("/nuevo")
	public ResponseEntity<?> saveBillete(@RequestBody  BilleteModel billete){
		BilleteService.save(billete);
		return new ResponseEntity("billete guardado", HttpStatus.CREATED);
	}
	
	/*borr una moneda*/
	@PutMapping("/actualizar")
    public ResponseEntity<?> updateBillete(@RequestBody  BilleteModel billete){
		BilleteService.updateProcedure(billete);
		return new ResponseEntity("billete actualizado", HttpStatus.CREATED);
	}

}
