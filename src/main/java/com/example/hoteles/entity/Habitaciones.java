package com.example.hoteles.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "habitaciones")
public class Habitaciones implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "habitacion_id")
	private Long habitacionId;

	@Column(name = "numero_habitacion")
	private Integer numeroHabitacion;

	@Column(name = "hotel_id")
	private Long hotelId;

	@Column(name = "tipo_habitacion")
	private String tipoHabitacion;

	@Column(name = "reservada")
	private String reserva;

	@Column(name = "fecha_reserva")
	private Date fechaReserva;

	public Habitaciones() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Habitaciones(Long habitacionId, Integer numeroHabitacion, Long hotelId, String tipoHabitacion,
			String reserva, Date fechaReserva) {
		super();
		this.habitacionId = habitacionId;
		this.numeroHabitacion = numeroHabitacion;
		this.hotelId = hotelId;
		this.tipoHabitacion = tipoHabitacion;
		this.reserva = reserva;
		this.fechaReserva = fechaReserva;
	}

	public Long getHabitacionId() {
		return habitacionId;
	}

	public void setHabitacionId(Long habitacionId) {
		this.habitacionId = habitacionId;
	}

	public Integer getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(Integer numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public String getReserva() {
		return reserva;
	}

	public void setReserva(String reserva) {
		this.reserva = reserva;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	@Override
	public String toString() {
		return "Habitaciones [habitacionId=" + habitacionId + ", numeroHabitacion=" + numeroHabitacion + ", hotelId="
				+ hotelId + ", tipoHabitacion=" + tipoHabitacion + ", reserva=" + reserva + ", fechaReserva="
				+ fechaReserva + "]";
	}

}
