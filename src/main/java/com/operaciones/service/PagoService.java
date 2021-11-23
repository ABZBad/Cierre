package com.operaciones.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaciones.repository.PagoRepository;
import com.operaciones.model.PagoModel;

@Service
public class PagoService {

    @Autowired
    PagoRepository pagoRepository;
    
    /*obtener todas las monedas*/
    public List<PagoModel> lista(){
        return pagoRepository.lista_pago();
    }
    /*obtener las monedas por Id*/
    public Optional<PagoModel> buscarPorId(Long id_pago){
        return pagoRepository.idPago(id_pago);
    }
    /*agregar una nueva moneda*/
    public void save(PagoModel pago) {
        pagoRepository.saveProcedure(pago.getTipo_pago());
    }
    /*actualizar una moneda por el Id*/
    public void updateProcedure(PagoModel pago) {
        pagoRepository.updateProcedure(pago.getId_pago(), pago.getTipo_pago());

 

        
    }

}
