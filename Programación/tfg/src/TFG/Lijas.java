package TFG;
import java.sql.*;

public class Lijas {
	private String Nombre, Marca;
	private double Precio;
	private int cantTienda, cantRecTienda, idPieza;
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public int getCantTienda() {
		return cantTienda;
	}
	public void setCantTienda(int cantTienda) {
		this.cantTienda = cantTienda;
	}
	public int getCantRecTienda() {
		return cantRecTienda;
	}
	public void setCantRecTienda(int cantRecTienda) {
		this.cantRecTienda = cantRecTienda;
	}
	public int getIdPieza() {
		return idPieza;
	}
	public void setIdPieza(int idPieza) {
		this.idPieza = idPieza;
	}
	
}