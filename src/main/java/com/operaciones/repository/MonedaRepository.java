package com.operaciones.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.operaciones.model.MonedaModel;

public interface MonedaRepository extends JpaRepository<MonedaModel, Long> {
	/*obtener todas las monedas*/
	@Query( value = "{call lista_moneda()}", nativeQuery = true)
	List<MonedaModel> lista_moneda();
	
	/*obtener por Id*/
	@Query( value = "{call id_moneda(:idIn)}", nativeQuery = true)
	Optional<MonedaModel> idMoneda(@Param("idIn") Long idIN);
	
	/*agregar una nueva moneda*/
	@Query( value = "{call save_moneda(:valor_monedaIn, :descripcionIn)}", nativeQuery = true)
	void saveProcedure(
			@Param("valor_monedaIn") double valor_monedaIn,
			@Param("descripcionIn") String descripcionIn
			);

	/*actualizar modenda*/
	@Query( value = "{call update_moneda(:id_monedaIn,:valor_monedaIn, :descripcionIn)}", nativeQuery = true)
	void updateProcedure(
			@Param("id_monedaIn") long id_monedaIn,
			@Param("valor_monedaIn") double valor_monedaIn,
			@Param("descripcionIn") String descripcionIn
			);
	
	

	
	

	
	
	

	
	
}
