package com.operaciones.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.operaciones.model.TransaccionDetalleModel;
import com.operaciones.model.TransaccionEncabezadoModel;


public interface TransaccionDetalleRepository extends JpaRepository<TransaccionDetalleModel, Long> {
	/*obtener todas las monedas*/
	@Query( value = "{call lista_transaccion_detalle()}", nativeQuery = true)
	List<TransaccionDetalleModel> lista_transaccion_detalle();
	
	/*obtener las monedas por Id*/
	@Query( value = "{call id_tdetalle(:idIn)}", nativeQuery = true)
	Optional<TransaccionDetalleModel> idTdetalle(@Param("idIn") Long idIN);
	
	/*agregar una nueva moneda*/
	@Query(value = "{call save_transaccion_detalle(:aperturaIn, :cierreIn, :estatusIn, :referenciaIn)}", nativeQuery = true)
	    void saveProcedure(
	            @Param("aperturaIn") LocalDate aperturaIn,
	            @Param("cierreIn") LocalDate cierreIn,
	            @Param("estatusIn") String estatusIn,
	            @Param("referenciaIn") TransaccionEncabezadoModel referenciaIn
	            
	    );

	/*actualizar modenda*/
	@Query(value= "{call update_transaccion_detalle(:tdetalleIn,:aperturaIn, :cierreIn, :estatusIn, :referenciaIn)}", nativeQuery = true)
	void updateProcedure(
	        @Param("tdetalleIn") Long tdetalleIn,
			@Param("aperturaIn") LocalDate aperturaIn,
            @Param("cierreIn") LocalDate cierreIn,
            @Param("estatusIn") String estatusIn,
            @Param("referenciaIn") TransaccionEncabezadoModel referenciaIn
			
	);

	
}
