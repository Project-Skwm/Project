package TFG;

public class Usuario extends Trabajador{
	
	private int idUser;
	
	public Usuario() {
	}
	
	public Usuario (String nombre, String apellidos, String email, String pass) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.pass = pass;
		this.email = email;
	}
	
	public void crearUsuario () {
		
	}
	
}