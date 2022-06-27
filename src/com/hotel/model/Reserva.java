/**
 * 
 */
package com.hotel.model;

import java.sql.Date;

/**
 * @author ezequiel
 *
 */
public class Reserva {
	private Integer id;
	private Date fechaEntrada;
	private Date fechaSalida;
	private String valor;
	private String formaPago;
	
	public Reserva(Date fechaEntrada, Date fechaSalida, String valor, String formaPago) {
		super();
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.valor = valor;
		this.formaPago = formaPago;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the fechaEntrada
	 */
	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * @return the fechaSalida
	 */
	public Date getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * @return the formaPago
	 */
	public String getFormaPago() {
		return formaPago;
	}
}
