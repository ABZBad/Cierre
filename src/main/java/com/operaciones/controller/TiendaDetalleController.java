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

import com.operaciones.model.TiendaDetalleModel;
import com.operaciones.service.TiendaDetalleService;


@RestController
@RequestMapping("/tiendasdetalles")
public class TiendaDetalleController {

	@Autowired
	TiendaDetalleService TiendaDetalleService;
	
	/*obtener todas las tiendaD*/
	@RequestMapping("/lista")
	public ResponseEntity<List<TiendaDetalleModel>> lista(){
		List<TiendaDetalleModel> lista = TiendaDetalleService.lista();
		return new ResponseEntity(lista, HttpStatus.OK);
	}
	
	/*obtener todas las tiendaD por Id*/
	@GetMapping("/verid/{id_detalle}")
	public ResponseEntity<TiendaDetalleModel> verId(@PathVariable("id_detalle") Long id_detalle){ 
	Optional<TiendaDetalleModel> tiendaD = TiendaDetalleService.buscarPorId(id_detalle);
	return new ResponseEntity(tiendaD, HttpStatus.OK);
	}
	
	/*guardar una nueva tiendaD*/
	@PostMapping("/nuevo")
	public ResponseEntity<?> saveTiendaD(@RequestBody  TiendaDetalleModel tiendaD){
		TiendaDetalleService.saveProcedure(tiendaD);
		return new ResponseEntity("guardado", HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
    public ResponseEntity<?> updateTiendaD(@RequestBody  TiendaDetalleModel tiendaD){
		TiendaDetalleService.updateProcedure(tiendaD);
        return new ResponseEntity("actulizada", HttpStatus.CREATED);
    }
}
