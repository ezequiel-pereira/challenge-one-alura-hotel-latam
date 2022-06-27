package com.hotel.factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author ezequiel
 *
 */
public class CrearConexion {
	
	private DataSource dataSource;
	
	public CrearConexion() {
		var pooledDataSource = new ComboPooledDataSource();
		pooledDataSource.setJdbcUrl("jdbc:mysql://172.17.0.3/hotel?useTimeZone=true&serverTimeZone=UTC");
		pooledDataSource.setUser("root");
		pooledDataSource.setPassword("alura");
		pooledDataSource.setMaxPoolSize(10);
		
		this.dataSource = pooledDataSource;
	}

	/**
	 * @param args
	 * @throws SQLException
	 */
	public Connection crearConexion() throws SQLException {
		return this.dataSource.getConnection();
//		System.out.println("Conectando base de datos...");
//		return DriverManager.getConnection("jdbc:mysql://172.17.0.3/hotel?useTimeZone=true&serverTimeZone=UTC", "root",
//				"alura");

	}

}
