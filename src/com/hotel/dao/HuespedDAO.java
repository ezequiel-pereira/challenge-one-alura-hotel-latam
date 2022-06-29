package com.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hotel.model.Huesped;

public class HuespedDAO {
	final private Connection conexion;

	public HuespedDAO(Connection conexion) {
		this.conexion = conexion;
	}

	public void guardar(Huesped huesped) {
		try(conexion) {
			String consulta = "INSERT INTO hotel.huespedes (nombre, apellido, fecha_nacimiento, nacionalidad, telefono, reservas_id) VALUES (?, ?, ?, ?, ?, ?)";
			try (PreparedStatement ps = conexion.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS)) {
				ps.setString(1, huesped.getNombre());
				ps.setString(2, huesped.getApellido());
				ps.setDate(3, huesped.getFechaNacimiento());
				ps.setString(4, huesped.getNacionalidad());
				ps.setString(5, huesped.getTelefono());
				ps.setInt(6, huesped.getIdReserva());
				ps.execute();
				try (ResultSet resultado = ps.getGeneratedKeys()) {
					while (resultado.next()) {
						huesped.setId(resultado.getInt(1));
					}
				}
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
