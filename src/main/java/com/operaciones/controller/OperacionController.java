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

import com.operaciones.model.OperacionModel;
import com.operaciones.service.OperacionService;


@RestController
@RequestMapping("/operacion")
public class OperacionController {

	@Autowired
	OperacionService OperacionService;
	
	/*obtener todas las monedas*/
	@RequestMapping("/lista")
	public ResponseEntity<List<OperacionModel>> lista(){
		List<OperacionModel> lista = OperacionService.lista();
		return new ResponseEntity(lista, HttpStatus.OK);
	}
	
	/*obtener todas las monedas por Id*/
	@GetMapping("/verid/{id_operacion}")
	public ResponseEntity<OperacionModel> verId(@PathVariable("id_operacion") Long id_operacion){ 
	Optional<OperacionModel> operacion = OperacionService.buscarPorId(id_operacion);
	return new ResponseEntity(operacion, HttpStatus.OK);
	}
	
	/*guardar una nueva moneda*/
	@PostMapping("/nuevo")
	public ResponseEntity<?> guardar(@RequestBody  OperacionModel operacion){
		OperacionService.save(operacion);
		return new ResponseEntity("guardado", HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
    public ResponseEntity<?> updateOperacion(@RequestBody  OperacionModel operacion){
		OperacionService.updateProcedure(operacion);
        return new ResponseEntity("actulizada", HttpStatus.CREATED);
    }
}
