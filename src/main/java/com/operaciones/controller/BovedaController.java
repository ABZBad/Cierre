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

import com.operaciones.service.BovedaService;
import com.operaciones.model.BovedaModel;


@RestController
@RequestMapping("/bovedas")
public class BovedaController {
	
	@Autowired
	BovedaService bovedaservice;
	
	@RequestMapping("/lista")
	public ResponseEntity<List<BovedaModel>>lista(){
		List<BovedaModel> lista = bovedaservice.lista();
		return new ResponseEntity(lista, HttpStatus.OK);
		
	}
	@GetMapping("/verid/{n_boveda}")
	public ResponseEntity<BovedaModel> verId(@PathVariable("n_boveda") Long n_boveda){
		Optional<BovedaModel> boveda = bovedaservice.buscarPorId(n_boveda);
		return new ResponseEntity(boveda, HttpStatus.OK);
	}
	@PostMapping("/nuevo")
	public ResponseEntity<?> saveBoveda(@RequestBody BovedaModel boveda){
		bovedaservice.saveProcedure(boveda);
		return new ResponseEntity("boveda guardada",HttpStatus.CREATED);
	}
	@PutMapping("/actualizar")
	public ResponseEntity<?>updateBoveda(@RequestBody BovedaModel boveda){
		bovedaservice.updateProcedure(boveda);
		return new ResponseEntity("Boveda Actualizada",HttpStatus.CREATED);
	}
	
	
	

}
