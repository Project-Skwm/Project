package TFG;

public class Trabajador {
	
	protected String nombre, apellidos, DNI, pass, email;
	protected int id;
// El boolean trabajador haremos que si da SI, es trabajador. Si da NO, es Supervisor.
	
	protected boolean trabajador = true;

	public Trabajador () {
	}
	
	public Trabajador (String nombre, String apellidos, String DNI, String email, String pass) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = DNI;
		this.pass = pass;
		this.email = email;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isTrabajador() {
		return trabajador;
	}

	public void setTrabajador(boolean trabajador) {
		this.trabajador = trabajador;
	}
	
	
	public boolean trabajo (boolean si) {
		if (si == true) {
			trabajador = true;
		}
		else {
			trabajador = false;
		}
		return trabajador;
	}
	
	public void eliminarUsuario () {
	}
	
	
	public void realizarPedido () {
	}
	
}