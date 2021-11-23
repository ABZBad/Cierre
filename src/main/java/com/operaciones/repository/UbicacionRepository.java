package com.operaciones.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.operaciones.model.UbicacionModel;


@Repository
public interface UbicacionRepository extends JpaRepository <UbicacionModel, Long > {
	
	@Query( value = "{call lista_ubicacion()}", nativeQuery = true)
	List<UbicacionModel> lista_ubicacion();
	
	
	/*@Query(value = "{call id_ubicacion(:idIn)}", nativeQuery = true)
    Optional <UbicacionModel> idUbicacion(@Param(":idIn") Long idIn);/*
 
    
	/*@Query(value = "{call save_ubicacion(:ciudadIn, :estadoIn, :paisIn)}", nativeQuery = true)
        void saveProcedure(
            @Param("ciudadIn") String cuidadIn,
            @Param("estadoIn") String estadoIn,
            @Param("precioIn") String precioIn
            
    );

  
      /*@Query(value= "{call update_ubicacion(:ubicacionIn,:ciudadIn, :estadoIn, :paisIn )}", nativeQuery = true)
          void updateProcedure(
           
           @Param("ubicacionIn") Long ubicacionIn,
		   @Param("cuidadIn") String cuidadIn,
           @Param("estadoIn") String estadoIn,
           @Param("paisIn") String paisIn
          
	);*/


}
