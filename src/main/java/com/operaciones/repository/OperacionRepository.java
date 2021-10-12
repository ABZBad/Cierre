package com.operaciones.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.operaciones.model.OperacionModel;


public interface OperacionRepository extends JpaRepository<OperacionModel, Long> {
	/*obtener todas las monedas*/
	@Query( value = "{call lista_operacion}", nativeQuery = true)
	List<OperacionModel> lista_operacion();
	
	/*obtener las monedas por Id*/
	@Query( value = "{call id_operacion(:idIn)}", nativeQuery = true)
	Optional<OperacionModel> idOperacion(@Param("idIn") Long idIN);
	
	/*agregar una nueva moneda*/
	@Query( value = "{call save_operacion(:tipo_operacionIn)}", nativeQuery = true)
	void saveProcedure(
			@Param("tipo_operacionIn") String tipo_operacionIn
			
			);
	
	/*actualizar modenda*/
	@Query( value = "{call update_operacion(:id_operacionIn,:tipo_operacionIn)}", nativeQuery = true)
	void updateProcedure(
			@Param("id_operacionIn") long id_monedaIn,
			@Param("tipo_operacionIn") String tipo_operacionIn
			
			);
	
	

	
	

	
	
	

	
	
}
