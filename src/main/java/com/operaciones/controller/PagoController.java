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

import com.operaciones.service.PagoService;
import com.operaciones.model.PagoModel;

@RestController
@RequestMapping("/pagos")
public class PagoController {

		@Autowired
		PagoService pagoService;
		
		/*obtener todas las monedas*/
		@RequestMapping("/lista")
		public ResponseEntity<List<PagoModel>> lista(){
			List<PagoModel> lista = pagoService.lista();
			return new ResponseEntity(lista, HttpStatus.OK);
		}
		
		/*obtener todas las monedas por Id*/
		@GetMapping("/verid/{id_pago}")
		public ResponseEntity<PagoModel> verId(@PathVariable("id_pago") Long id_pago){ 
		Optional<PagoModel> moneda = pagoService.buscarPorId(id_pago);
		return new ResponseEntity(moneda, HttpStatus.OK);
		}
		
		/*guardar una nueva moneda*/
		@PostMapping("/nuevo")
		public ResponseEntity<?> guardar(@RequestBody  PagoModel pago){
			pagoService.save(pago);
			return new ResponseEntity("guardado", HttpStatus.CREATED);
		}
		
		@PutMapping("/actualizar")
	    public ResponseEntity<?> updatePago(@RequestBody  PagoModel pago){
			pagoService.updateProcedure(pago);
	        return new ResponseEntity("moneda actulizada", HttpStatus.CREATED);
	    }

}
