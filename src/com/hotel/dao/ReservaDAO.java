package com.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hotel.model.Reserva;

public class ReservaDAO {
	private Connection conexion;

	public ReservaDAO(Connection conexion) {
		this.conexion = conexion;
	}

	public void guardar(Reserva reserva) {
		try {
			String consulta = "INSERT INTO hotel.reservas (fecha_entrada, fecha_salida, valor, forma_pago) VALUES (?, ?, ?, ?)";
			try (PreparedStatement ps = conexion.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS)) {
				ps.setDate(1, reserva.getFechaEntrada());
				ps.setDate(2, reserva.getFechaSalida());
				ps.setString(3, reserva.getValor());
				ps.setString(4, reserva.getFormaPago());
				ps.execute();
				//ps.close();
				try (ResultSet resultado = ps.getGeneratedKeys()) {
					while (resultado.next()) {
						reserva.setId(resultado.getInt(1));
					}
				}
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
