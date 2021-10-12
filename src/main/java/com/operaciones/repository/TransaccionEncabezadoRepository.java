package com.operaciones.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.operaciones.model.OperacionModel;
import com.operaciones.model.PagoModel;
import com.operaciones.model.TransaccionEncabezadoModel;


public interface TransaccionEncabezadoRepository extends JpaRepository<TransaccionEncabezadoModel, Long> {
	
	/*obtener todas las monedas*/
	@Query( value = "{call lista_transacion_encabezado()}", nativeQuery = true)
	List<TransaccionEncabezadoModel> lista_transacion_encabezado();
	
	/*obtener las monedas por Id*/
	@Query( value = "{call id_referencia(:idIn)}", nativeQuery = true)
	Optional<TransaccionEncabezadoModel> idReferencia(@Param("idIn") Long idIN);
	
	/*agregar una nueva moneda*/
	@Query(value = "{call save_transaccion_encabezado(:fechaIn, :montoIn,:operacion_destinoIn,:operacion_origenIn,:operacionIn,:pagoIn)}", nativeQuery = true)
	    void saveProcedure(
	            @Param("fechaIn") LocalDate fechaIn,
	            @Param("montoIn") double montoIn,
	            @Param("operacion_destinoIn") String operacion_destinoIn,
	            @Param("operacion_origenIn") String operacion_origenIn,
	            @Param("operacionIn") OperacionModel operacionIn,
	            @Param("pagoIn") PagoModel pagoIn
	           
	    );
	/*actualizar modenda*/
	
	@Query(value= "{call update_transaccion_encabezado(:referenciaIn,:fechaIn, :montoIn,:operacion_destinoIn,:operacion_origenIn,:operacionIn,:pagoIn)}", nativeQuery = true)
	    void updateProcedure(
	        @Param("referenciaIn") char refereciaIn,
			@Param("fechaIn") LocalDate fechaIn,
            @Param("montoIn") double montoIn,
            @Param("operacion_destinoIn") String operacion_destinoIn,
            @Param("operacion_origenIn") String operacion_origenIn,
            @Param("operacionIn") OperacionModel operacionIn,
            @Param("pagoIn") PagoModel pagoIn
            
		);

}
