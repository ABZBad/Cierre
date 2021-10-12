package com.operaciones.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.operaciones.model.PagoModel;

public interface PagoRepository extends JpaRepository<PagoModel, Long> {
	   
    /*obtener todas las monedas*/
    @Query( value = "{call lista_pago()}", nativeQuery = true)
    List<PagoModel> lista_pago();
   
    /*obtener las monedas por Id*/
    @Query( value = "{call id_pago(:idIn)}", nativeQuery = true)
    Optional<PagoModel> idPago(@Param("idIn") Long idIN);
   
    /*agregar una nueva moneda*/
    @Query( value = "{call save_pago(:tipo_pagoIn)}", nativeQuery = true)
    void saveProcedure(
            @Param("tipo_pagoIn") String tipo_pagoIn
            );
   
    /*actualizar modenda*/
    @Query( value = "{call update_pago(:id_pagoIn,:tipo_pagoIn)}", nativeQuery = true)
    void updateProcedure(
            @Param("id_pagoIn") Long id_pagoIn,
            @Param("tipo_pagoIn") String tipo_pagoIn
            );

	
	

	
	
	

	
	
}
