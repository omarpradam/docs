package com.example.hoteles.repository;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.hoteles.entity.Habitaciones;

@Repository("habitacionesRepository")
public interface HabitacionesRepository extends JpaRepository<Habitaciones, Serializable>{

	@Query(value = "select a.* from habitaciones a where  a.reservada  = :reserva and a.hotel_id  = :hotelId and a.tipo_habitacion  = :tipoHabitacion;",nativeQuery = true)
	List<Habitaciones> findByreservaAndIdHotelAndTipo( @Param("reserva") String reserva, @Param("hotelId") Long hotelId, @Param("tipoHabitacion") String tipoHabitacion);
	
	@Query(value = "select * from habitaciones a where  a.fecha_reserva  = :fechaReserva",nativeQuery = true)
	List<Habitaciones> findByFecha( @Param("fechaReserva") Date fechaReserva);
}
