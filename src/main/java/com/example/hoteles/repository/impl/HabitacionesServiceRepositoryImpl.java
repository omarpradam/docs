package com.example.hoteles.repository.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.hoteles.entity.Habitaciones;
import com.example.hoteles.repository.HabitacionesRepository;
import com.example.hoteles.repository.service.HabitacionesServiceRepository;

@Service("HabitacionesServiceRepositoryImpl")
public class HabitacionesServiceRepositoryImpl implements HabitacionesServiceRepository {

	@Autowired
	@Qualifier("habitacionesRepository")
	private HabitacionesRepository habitacionesRepository;

	@Override
	public List<Habitaciones> findByreservaAndIdHotelAndTipo(String reserva, Long hotelId, String tipoHabitacion) {
		
		List<Habitaciones> habita = habitacionesRepository.findByreservaAndIdHotelAndTipo(reserva, hotelId, tipoHabitacion);

		List<Habitaciones> habitaTem = habita != null ? habita : null;
		return habitaTem;
	}

}
