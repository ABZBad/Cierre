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

import com.operaciones.model.MonedaModel;
import com.operaciones.service.MonedaService;


@RestController
@RequestMapping("/monedas")
public class MonedaController {

	@Autowired
	MonedaService MonedaService;
	
	/*obtener todas las monedas*/
	@RequestMapping("/lista")
	public ResponseEntity<List<MonedaModel>> lista(){
		List<MonedaModel> lista = MonedaService.lista();
		return new ResponseEntity(lista, HttpStatus.OK);
	}
	
	/*obtener todas las monedas por Id*/
	@GetMapping("/verid/{id_moneda}")
	public ResponseEntity<MonedaModel> verId(@PathVariable("id_moneda") Long id_moneda){ 
	Optional<MonedaModel> moneda = MonedaService.buscarPorId(id_moneda);
	return new ResponseEntity(moneda, HttpStatus.OK);
	}
	
	/*guardar una nueva moneda*/
	@PostMapping("/nuevo")
	public ResponseEntity<?> guardar(@RequestBody  MonedaModel moneda){
		MonedaService.save(moneda);
		return new ResponseEntity("guardado", HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
    public ResponseEntity<?> updateMoneda(@RequestBody  MonedaModel moneda){
		MonedaService.updateProcedure(moneda);
        return new ResponseEntity("moneda actulizada", HttpStatus.CREATED);
    }
}
