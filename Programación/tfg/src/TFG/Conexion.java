package TFG;

import java.sql.*;

import javax.swing.*;

public class Conexion {

	private Connection cn = null;
	
	public Conexion() {
		
		try {
			//1 - Crear conexion
			cn = DriverManager.getConnection("jdbc:mysql://localhost/proyectointegrado","root","");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR LA BASE DE DATOS \n\n" + e.getMessage() );
			e.printStackTrace();
		}
	}
	
	public Connection getCn() {
		
		return cn;
	}
}