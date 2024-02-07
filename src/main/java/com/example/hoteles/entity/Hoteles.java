package com.example.hoteles.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "hoteles")
public class Hoteles implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hotel_id")
	private Long hotelId;

	@Column(name = "zona_hotel")
	private String zonaHotel;

	@Column(name = "cantidad_personas")
	private Integer cantidadPersonas;

	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

	@Column(name = "fecha_update")
	private Date FechaUpdate;

	public Hoteles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hoteles(Long hotelId, String zonaHotel, Integer cantidadPersonas, Date fechaCreacion, Date fechaUpdate) {
		super();
		this.hotelId = hotelId;
		this.zonaHotel = zonaHotel;
		this.cantidadPersonas = cantidadPersonas;
		this.fechaCreacion = fechaCreacion;
		FechaUpdate = fechaUpdate;
	}

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public String getZonaHotel() {
		return zonaHotel;
	}

	public void setZonaHotel(String zonaHotel) {
		this.zonaHotel = zonaHotel;
	}

	public Integer getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(Integer cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaUpdate() {
		return FechaUpdate;
	}

	public void setFechaUpdate(Date fechaUpdate) {
		FechaUpdate = fechaUpdate;
	}

	@Override
	public String toString() {
		return "Hoteles [hotelId=" + hotelId + ", zonaHotel=" + zonaHotel + ", cantidadPersonas=" + cantidadPersonas
				+ ", fechaCreacion=" + fechaCreacion + ", FechaUpdate=" + FechaUpdate + "]";
	}

}
