package model;

public class Persona {
	private String nombre,apellidos,direccion,ciudad,date;
	private int codigo, telefono;
	
	public Persona(String nombre, String apellidos, String direccion, String ciudad, String date,int codigo, int telefono) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.direccion=direccion;
		this.ciudad=ciudad;
		this.date=date;
		this.codigo=codigo;
		this.telefono=telefono;
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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}
