package com.operaciones.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.operaciones.model.TiendaModel;


public interface TiendaRepository extends JpaRepository<TiendaModel, Long> {
	/*obtener todas las monedas*/
	@Query( value = "{call lista_tienda()}", nativeQuery = true)
	List<TiendaModel> lista_tienda();
	
	/*obtener las monedas por Id*/
	@Query( value = "{call id_tienda(:idIn)}", nativeQuery = true)
	Optional<TiendaModel> idTienda(@Param("idIn") Long idIN);
	
	/*agregar una nueva */
	
	@Query(value = "{call save_tipo_tienda(:descripcionIn,:tipo_tiendaIn)}", nativeQuery = true)
	    void saveProcedure(
	            @Param("descripcionIn") String descripcionIn,
	            @Param("tipo_tiendaIn") String tipo_tiendaIn
	            );

    @Query(value= "{call update_tipo_tienda(:tiendaIn,:descripcionIn,:tipo_tiendaIn)}", nativeQuery = true)
	        void updateProcedure(
	        @Param("tiendaIn") Long tiendaIn,
			@Param("descripcionIn") String descripcionIn,
            @Param("tipo_tiendaIn") String tipo_tiendaIn
      
            );
	

	
}
