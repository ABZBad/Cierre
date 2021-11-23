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

import com.operaciones.model.TransaccionDetalleModel;
import com.operaciones.service.TransaccionDetalleService;

@RestController
@RequestMapping("/transaccionD")
public class TransaccionDetalleController {

	@Autowired
	TransaccionDetalleService TransaccionDetalleService;
	
	/*obtener todas las monedas*/
	@RequestMapping("/lista")
	public ResponseEntity<List<TransaccionDetalleModel>> lista(){
		List<TransaccionDetalleModel> lista = TransaccionDetalleService.lista();
		return new ResponseEntity(lista, HttpStatus.OK);
	}
	
	/*obtener todas las monedas por Id*/
	@GetMapping("/verid/{id_tdetalle}")
	public ResponseEntity<TransaccionDetalleModel> verId(@PathVariable("id_tdetalle") Long id_tdetalle){ 
	Optional<TransaccionDetalleModel> transaccionD = TransaccionDetalleService.buscarPorId(id_tdetalle);
	return new ResponseEntity(transaccionD, HttpStatus.OK);
	}
	
	/*guardar una nueva moneda*/
	@PostMapping("/nuevo")
	public ResponseEntity<?> saveTransaccionD(@RequestBody  TransaccionDetalleModel transaccionD){
		TransaccionDetalleService.saveProcedure(transaccionD);
		return new ResponseEntity("guardado", HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
    public ResponseEntity<?> updateTransaccionD(@RequestBody  TransaccionDetalleModel transaccionD){
		TransaccionDetalleService.updateProcedure(transaccionD);
        return new ResponseEntity("actulizada", HttpStatus.CREATED);
    }
}
