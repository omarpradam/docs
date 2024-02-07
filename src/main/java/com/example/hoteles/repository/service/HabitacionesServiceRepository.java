package com.example.hoteles.repository.service;

import java.util.List;

import com.example.hoteles.entity.Habitaciones;

public interface HabitacionesServiceRepository {
	
	public List<Habitaciones> findByreservaAndIdHotelAndTipo(String reserva, Long hotelId, String tipoHabitacion);

}
