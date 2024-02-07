package com.example.hoteles.controller;

import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.hoteles.dto.ResponseService;
import com.example.hoteles.entity.Habitaciones;
import com.example.hoteles.repository.impl.HabitacionesServiceRepositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
@RestController
@RequestMapping("/Reservas")
public class HabitacionController {
	
	
	
	private ResponseService responService = null;
	@Autowired
	private HabitacionesServiceRepositoryImpl habitacionesServiceRepositoryImpl; 
	
	@GetMapping(value = "/estadoHabitaciones/{hotelId}/{tipoHabitacion}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody ResponseService searchByhotlIdAntipoHabitacion(@PathVariable Long hotelId,@PathVariable String tipoHabitacion) {

		try {

			List<Habitaciones> clientTem =habitacionesServiceRepositoryImpl.findByreservaAndIdHotelAndTipo(null, hotelId, tipoHabitacion);
			return responService = new ResponseService("Exitoso", "200", clientTem);

		} catch (Exception e) {
			e.getMessage();
			return responService = new ResponseService("Error", "404", false);
		}

	}

}
