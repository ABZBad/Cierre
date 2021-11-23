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

import com.operaciones.model.TransaccionEncabezadoModel;
import com.operaciones.service.TransaccionEncabezadoService;

@RestController
@RequestMapping("/transaccionesE")
public class TransaccionEncabezadoController {

	@Autowired
	TransaccionEncabezadoService TransaccionEncabezadoService;
	
	/*obtener todas las monedas*/
	@RequestMapping("/lista")
	public ResponseEntity<List<TransaccionEncabezadoModel>> lista(){
		List<TransaccionEncabezadoModel> lista = TransaccionEncabezadoService.lista();
		return new ResponseEntity(lista, HttpStatus.OK);
	}
	
	/*obtener todas las monedas por Id*/
	@GetMapping("/verid/{id_referencia}")
	public ResponseEntity<TransaccionEncabezadoModel> verId(@PathVariable("id_referencia") Long id_referencia){ 
	Optional<TransaccionEncabezadoModel> transaccionD = TransaccionEncabezadoService.buscarPorId(id_referencia);
	return new ResponseEntity(transaccionD, HttpStatus.OK);
	}
	
	/*guardar una nueva moneda*/
	@PostMapping("/nuevo")
	public ResponseEntity<?> saveTransaccionE(@RequestBody  TransaccionEncabezadoModel transaccionD){
		TransaccionEncabezadoService.saveProcedure(transaccionD);
		return new ResponseEntity("guardado", HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
    public ResponseEntity<?> updateTransaccionE(@RequestBody  TransaccionEncabezadoModel transaccionD){
		TransaccionEncabezadoService.updateProcedure(transaccionD);
        return new ResponseEntity("actulizada", HttpStatus.CREATED);
    }
}
