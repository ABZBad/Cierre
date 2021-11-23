package com.operaciones.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.operaciones.model.BovedaModel;
import com.operaciones.model.CajaModel;
import com.operaciones.model.CajeroModel;
import com.operaciones.model.TiendaDetalleModel;
import com.operaciones.model.TiendaModel;
import com.operaciones.model.UbicacionModel;


public interface TiendaDetalleRepository extends JpaRepository<TiendaDetalleModel, Long> {
	/*obtener todas las monedas*/
	@Query( value = "{call lista_tienda_detalle()}", nativeQuery = true)
	List<TiendaDetalleModel> lista_tienda_detalle();
	
	/*obtener las monedas por Id*/
	@Query( value = "{call id_detalle(:idIn)}", nativeQuery = true)
	Optional<TiendaDetalleModel> idDetalle(@Param("idIn") Long idIN);
	
	/*agregar una nueva moneda*/
	@Query( value = "{call save_tienda_detalle(:descripcionIn, :nombreIn, :tokenIn, :bovedaIn, :cajaIn, :cajeroIn,:tiendaIn,:ubicacionIn)}", nativeQuery = true)
			void saveProcedure(
	            @Param("descripcionIn") String descripcionIn,
	            @Param("nombreIn") String nombreIn,
	            @Param("tokenIn") char tokenIn,
	            @Param("bovedaIn") BovedaModel bovedaIn,
	            @Param("cajaIn") CajaModel cajaIn,
	            @Param("cajeroIn") CajeroModel cajaroIn,
	            @Param("tiendaIn") TiendaModel tiendaIn,
	            @Param("ubicacionIn") UbicacionModel ubicacionIn
			);


	@Query(value= "{call update_tienda_detalle(:detalleIn,:descripcionIn, :nombreIn, :tokenIn, :bovedaIn, :cajaIn, :cajeroIn,:tiendaIn,:ubicacionIn)}", nativeQuery = true)
	void updateProcedure(
	        @Param("detalleIn") Long detalleIn,
			@Param("nombreIn") String nombreIn,
	        @Param("tokenIn") char tokenIn,
	        @Param("bovedaIn") BovedaModel bovedaIn,
	        @Param("cajaIn") CajaModel cajaIn,
	        @Param("cajeroIn") CajeroModel cajaroIn,
	        @Param("tiendaIn") TiendaModel tiendaIn,
	        @Param("ubicacionIn") UbicacionModel ubicacionIn
			);

	
	
	
}
