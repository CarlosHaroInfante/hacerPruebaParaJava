package dtos;

public class bibliotecaDto {

	long id;
	
	String nombre = "aaaaa";
	
	String direccion = "aaaaa";

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public bibliotecaDto(long id, String nombre, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public bibliotecaDto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "bibliotecaDto [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	
}
