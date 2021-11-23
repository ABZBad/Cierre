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

import com.operaciones.model.UbicacionModel;
import com.operaciones.service.UbicacionService;

@RestController
@RequestMapping("/ubicaciones")
public class UbicacionController {
	
	@Autowired
	UbicacionService UbicacionService;
	
	@RequestMapping("/lista")
	public ResponseEntity<List<UbicacionModel>> lista(){
		List<UbicacionModel> lista = UbicacionService.lista();
		return new ResponseEntity(lista, HttpStatus.OK);
	}
	/*@GetMapping("/verid/{id_ubicacion}")
	public ResponseEntity<UbicacionModel> verId(@PathVariable("id_ubicacion") Long id_ubicacion){ 
		Optional<UbicacionModel> ubicacion = UbicacionService.buscarPorId(id_ubicacion);
		return new ResponseEntity(ubicacion, HttpStatus.OK);
	}
	/*@PostMapping("/nuevo")
	public ResponseEntity<?> saveUbicacion(@RequestBody  UbicacionModel ubicacion){
		UbicacionService.saveProcedure(ubicacion);
		return new ResponseEntity("guardado", HttpStatus.CREATED);
	}
	/*@PutMapping("/actualizar")
    public ResponseEntity<?> updateUbicacion(@RequestBody  UbicacionModel ubicacion){
		UbicacionService.updateProcedure(ubicacion);
    return new ResponseEntity("actulizada", HttpStatus.CREATED);
    
    }*/

}
