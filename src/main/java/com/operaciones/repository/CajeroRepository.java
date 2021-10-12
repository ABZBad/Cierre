package com.operaciones.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.operaciones.model.BilleteModel;
import com.operaciones.model.CajeroModel;
import com.operaciones.model.MonedaModel;


public interface CajeroRepository extends JpaRepository<CajeroModel, Long> {
	
	/*obtener todas las cajero*/
	@Query( value = "{call lista_cajero()}", nativeQuery = true)
	List<CajeroModel> lista_cajero();
	
	/*obtener las cajero por Id*/
	@Query( value = "{call n_cajero(:idIn)}", nativeQuery = true)
	Optional<CajeroModel> nCajero(@Param("idIn") Long idIN);
	
	
	@Query(value = "{call save_cajero(:edo_cuentaIn,:montoIn,:n_transaccionesIn,:retiroIn,:billeteIn,:monedaIn)}", nativeQuery = true)
	    void saveProcedure(
	            @Param("edo_cuentaIn") String edo_cuentaIn,
	            @Param("montoIn") double montoIn,
	            @Param("n_transaccionesIn") int n_transaccionesIn,
	            @Param("retiroIn") double retiroIn,
	            @Param("billeteIn") BilleteModel billeteIn,
	            @Param("monedaIn") MonedaModel monedaIn
	            
	    );
	/*actualizar cajero*/
	@Query(value= "{call update_cajero(:cajeroIn,:edo_cuentaIn,:montoIn,:n_transaccionesIn,:retiroIn,:billeteIn,:monedaIn)}", nativeQuery = true)
	        void updateProcedure(
	            @Param("cajeroIn") Long iDproductoIn,
			    @Param("edo_cuentaIn") String edo_cuentaIn,
	            @Param("montoIn") double montoIn,
	            @Param("n_transaccionesIn") int n_transaccionesIn,
	            @Param("retiroIn") double retiroIn,
	            @Param("billeteIn") BilleteModel billeteIn,
	            @Param("monedaIn") MonedaModel monedaIn
	
		);

}
