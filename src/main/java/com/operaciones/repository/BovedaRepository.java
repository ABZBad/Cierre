package com.operaciones.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.operaciones.model.BilleteModel;
import com.operaciones.model.BovedaModel;
import com.operaciones.model.MonedaModel;


public interface BovedaRepository extends JpaRepository<BovedaModel, Long>{
	@Query( value = "{call lista_boveda()}", nativeQuery = true)
	List<BovedaModel> lista_boveda();
	
	@Query( value = "{call n_boveda(:idIn)}", nativeQuery = true)
	Optional<BovedaModel> nBoveda(@Param("idIn") Long idIN);
	
	 
	@Query(value = "{call save_boveda( :depositoIn, :montoIn, :retiroIn, :billeteIn, :monedaIn)}", nativeQuery = true)
	    void saveProcedure(
	            @Param("depositoIn") double depositoIn,
	            @Param("montoIn") double montoIn,
	            @Param("retiroIn") double retiroIn,
	            @Param("billeteIn") BilleteModel billeteIn,
	            @Param("monedaIn") MonedaModel monedaModeIn
	            
	            );
	 
	@Query(value= "{call update_boveda(:bovedaIn,:depositoIn, :montoIn, :retiroIn, :billeteIn, :monedaIn)}", nativeQuery = true)
	void updateProcedure(
	        @Param("bovedaIn") Long bovedaIn,
	        @Param("depositoIn") Double depositoIn,
	        @Param("montoIn") Double montoIn,
	        @Param("retiroIn") Double retiroIn,
	        @Param("monedaIn") MonedaModel monedaModeIn,
	        @Param("billeteIn") BilleteModel billeteIn
			
		);

}
