/**
 * 
 */
package com.hotel.controller;

import java.sql.Connection;
import java.sql.SQLException;

import com.hotel.dao.ReservaDAO;
import com.hotel.factory.CrearConexion;
import com.hotel.model.Reserva;

/**
 * @author ezequiel
 *
 */
public class ReservaController {
	private ReservaDAO reservaDAO;
	
	public ReservaController() throws SQLException {
		Connection conexion = new CrearConexion().crearConexion();
		conexion.setAutoCommit(false);
		this.reservaDAO = new ReservaDAO(conexion);
	}
	
	public void guardar(Reserva reserva) {
		this.reservaDAO.guardar(reserva);
	}

}
