/**
 * 
 */
package com.hotel.controller;

import java.util.ArrayList;
import com.hotel.dao.HuespedDAO;
import com.hotel.factory.CrearConexion;
import com.hotel.model.Huesped;

/**
 * @author ezequiel
 *
 */
public class HuespedController {
	private HuespedDAO huespedDAO;
	
	public HuespedController() {
		CrearConexion conexion = new CrearConexion();
		this.huespedDAO = new HuespedDAO(conexion.crearConexion());
	}
	
	public void guardar(Huesped huesped) {
		this.huespedDAO.guardar(huesped);
	}
	
	public ArrayList<Huesped> listar() {
		return this.huespedDAO.listar();
	}

}
