package com.operaciones.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.operaciones.model.BilleteModel;

public interface BilleteRepository extends JpaRepository<BilleteModel, Long> {
	
	@Query( value = "{call lista_billete()}", nativeQuery = true)
	List<BilleteModel> lista_billete();
	
	/*obtener las monedas por Id*/
	@Query( value = "{call id_billete(:idIn)}", nativeQuery = true)
	Optional<BilleteModel> idBillete(@Param("idIn") Long idIN);
	
	/*agregar una nueva moneda*/
	@Query( value = "{call save_billete(:valor_billeteIn, :descripcionIn)}", nativeQuery = true)
	void saveProcedure(
			@Param("valor_billeteIn") double valor_billeteIn,
			@Param("descripcionIn") String descripcionIn
			);
	
	/*actualizar una moneda*/
	@Query( value = "{call update_billete(:billeteIn,:descripcionIn,:valor_billeteIn)}", nativeQuery = true)
	void updateProcedure(
			@Param("billeteIn") Long billeteIn,
			@Param("valor_billeteIn") double valor_billeteIn,
			@Param("descripcionIn") String descripcionIn
			);

}
