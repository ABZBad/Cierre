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

import com.operaciones.model.CajeroModel;
import com.operaciones.service.*;

@RestController
@RequestMapping("/cajeros")
public class CajeroController {

	@Autowired
	CajeroService CajeroService;
	
	/*obtener todas las monedas*/
	@RequestMapping("/lista")
	public ResponseEntity<List<CajeroModel>> lista(){
		List<CajeroModel> lista = CajeroService.lista();
		return new ResponseEntity(lista, HttpStatus.OK);
	}
	
	/*obtener todas las monedas por Id*/
	@GetMapping("/verid/{n_cajero}")
	public ResponseEntity<CajeroModel> verId(@PathVariable("n_cajero") Long n_cajero){ 
	Optional<CajeroModel> cajero = CajeroService.buscarPorId(n_cajero);
	return new ResponseEntity(cajero, HttpStatus.OK);
	}
	/*guardar una nueva moneda*/
	@PostMapping("/nuevo")
	public ResponseEntity<?> saveCajero(@RequestBody  CajeroModel cajero){
		CajeroService.saveProcedure(cajero);
		return new ResponseEntity("guardado", HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
    public ResponseEntity<?> updateCajero(@RequestBody  CajeroModel cajero){
		CajeroService.updateProcedure(cajero);
        return new ResponseEntity("moneda actulizada", HttpStatus.CREATED);
    }
}
