package com.operaciones.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.operaciones.model.BilleteModel;
import com.operaciones.model.CajaModel;
import com.operaciones.model.MonedaModel;

public interface CajaRepository extends JpaRepository<CajaModel, Long> {
	
	/*obtener todas las cajas*/
	@Query( value = "{call lista_caja()}", nativeQuery = true)
	List<CajaModel> lista_caja();
	
	/*obtener las cajas por Id*/
	@Query( value = "{call selectId_caja(:idIn)}", nativeQuery = true)
	Optional<CajaModel> idProcedure(@Param("idIn") Long idIN);
	
	/*agregar una nueva caja*/
	@Query( value = "{call save_caja(:aperturaIn, :cantidad_billeteIn, :cantidad_monedaIn, :cierreIn, :estatusIn, :billeteIn, :monedaIn)}", nativeQuery = true)
	void saveProcedure(
			
			 @Param("aperturaIn") LocalDate apaerturaIn,
			 @Param("cantidad_billeteIn") int cantidad_billeteIn,
			 @Param("cantidad_monedaIn") int cantidad_monedaIn,
			 @Param("cierreIn") LocalDate cierreIn,
			 @Param("estatusIn") String estatusIn,
			 @Param("billeteIn") BilleteModel billeteIn,
			 @Param("monedaIn") MonedaModel monedaIn
			
			);
	
	/*actualizar caja*/
	@Query( value = "{call update_caja(:cajaIn,:aperturaIn, :cantidad_billeteIn, :cantidad_monedaIn, :cierreIn, :estatusIn, :billeteIn, :monedaIn)}", nativeQuery = true)
	void updateProcedure(
			@Param("cajaIn") Long cajaIn,
			@Param("aperturaIn") LocalDate apaerturaIn,
			 @Param("cantidad_billeteIn") int cantidad_billeteIn,
			 @Param("cantidad_monedaIn") int cantidad_monedaIn,
			 @Param("cierreIn") LocalDate cierreIn,
			 @Param("estatusIn") String estatusIn,
			 @Param("billeteIn") BilleteModel billeteIn,
			 @Param("monedaIn") MonedaModel monedaIn
			);

	

	

}
