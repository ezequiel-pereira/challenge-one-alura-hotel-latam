/**
 * 
 */
package com.hotel.controller;


import com.hotel.dao.ReservaDAO;
import com.hotel.factory.CrearConexion;
import com.hotel.model.Reserva;

/**
 * @author ezequiel
 *
 */
public class ReservaController {
	private ReservaDAO reservaDAO;
	
	public ReservaController() {
		CrearConexion conexion = new CrearConexion();
		this.reservaDAO = new ReservaDAO(conexion.crearConexion());
	}
	
	public void guardar(Reserva reserva) {
		this.reservaDAO.guardar(reserva);
	}

}
