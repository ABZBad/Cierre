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

import com.operaciones.model.TiendaModel;
import com.operaciones.service.TiendaService;


@RestController
@RequestMapping("/tipostiendas")
public class TiendaController {

	@Autowired
	TiendaService TiendaService;
	
	/*obtener todas las monedas*/
	@RequestMapping("/lista")
	public ResponseEntity<List<TiendaModel>> lista(){
		List<TiendaModel> lista = TiendaService.lista();
		return new ResponseEntity(lista, HttpStatus.OK);
	}
	
	/*obtener todas las monedas por Id*/
	@GetMapping("/verid/{id_tienda}")
	public ResponseEntity<TiendaModel> verId(@PathVariable("id_tienda") Long id_tienda){ 
	Optional<TiendaModel> tiendaT = TiendaService.buscarPorId(id_tienda);
	return new ResponseEntity(tiendaT, HttpStatus.OK);
	}
	
	/*guardar una nueva moneda*/
	@PostMapping("/nuevo")
	public ResponseEntity<?> saveTiendaT(@RequestBody  TiendaModel tiendaT){
		TiendaService.saveProcedure(tiendaT);
		return new ResponseEntity("guardado", HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
    public ResponseEntity<?> updateTiendaT(@RequestBody  TiendaModel tiendaT){
		TiendaService.updateProcedure(tiendaT);
        return new ResponseEntity("actulizada", HttpStatus.CREATED);
    }
}
