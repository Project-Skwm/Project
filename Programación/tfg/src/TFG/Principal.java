package TFG;
import java.sql.*;
public class Principal {

	public static void main(String[] args) {
		
		try {
			//1 - Crear conexion
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/proyectointegrado","root","");
			//2 - Crear un Statement para la consulta.
			Statement stat1 = con1.createStatement();
			//3 - ResultSet rs1
			ResultSet rs1 = stat1.executeQuery ("select * from piezas");
			//4 - Se recorre el RseultSet, mostrando por pantalla los resultados.
			String nombre;
			while (rs1.next()) {
				System.out.println (rs1.getString ("ID") + " " + rs1.getString (2) + " " + rs1.getString(3) + " " + rs1.getString(4) + " " + rs1.getInt(5) + " " + rs1.getInt(6));
			nombre=rs1.getString("Nombre")+ "ZZ";
			
			//stat1.executeUpdate("UPDATE `piezas` SET `Nombre` ='"+nombre+"' WHERE `piezas`.`ID` = "+rs1.getString ("ID")+"");
			}
			
			
			//PreparedStatement
			
			PreparedStatement pSST= con1.prepareStatement("UPDATE `piezas` SET `Nombre` = ? WHERE `piezas`.`ID` = ?");
			pSST.setString(1, "Kal");
			pSST.setInt(2, 2);
			pSST.executeUpdate();
			
			//5 - Cerrar conexion
			con1.close();
		}catch (Exception e) {
			System.out.println("ERROR CONNEXION"+ e.getMessage());
		}
	}
}