
public class empleados {
	String id;
	String nombre;
	String apellidos;
	String direccion;
	int tlfno;
	
	public empleados(String id, String nombre, String apellidos, String direccion, int tlfno) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.tlfno = tlfno;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTlfno() {
		return tlfno;
	}
	public void setTlfno(int tlfno) {
		this.tlfno = tlfno;
	}
}
