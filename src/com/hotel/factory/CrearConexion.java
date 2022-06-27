package com.hotel.factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 */

/**
 * @author ezequiel
 *
 */
public class CrearConexion {

	/**
	 * @param args
	 * @throws SQLException
	 */
	public Connection crearConexion() throws SQLException {
		System.out.println("Conectando base de datos...");
		return DriverManager.getConnection("jdbc:mysql://172.17.0.3/hotel?useTimeZone=true&serverTimeZone=UTC", "root",
				"alura");

	}

}
