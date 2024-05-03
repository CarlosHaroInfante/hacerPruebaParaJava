package dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class ClienteDto {

	long id;
	
	String nombre = "aaaaa";
	
	String apellidos = "aaaaa";
	
	String apellido1 = "aaaaa";
	
	String apellido2 = "aaaaa";
	
	String fechaNac = "31-12-9999";
	
	String dni = "aaaaa";
	
	String correo = "aaaaa";
	
	boolean esValido = false;
	
	String fechaInicioSuspension = "31-12-9999";
	
	String fechaFinSuspensión = "31-12-9999";
	
	long bibliotecaId;
	
	

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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public boolean isEsValido() {
		return esValido;
	}

	public void setEsValido(boolean esValido) {
		this.esValido = esValido;
	}

	public LocalDate getFechaInicioSuspension() {
		return fechaInicioSuspension;
	}

	public void setFechaInicioSuspension(LocalDate fechaInicioSuspension) {
		this.fechaInicioSuspension = fechaInicioSuspension;
	}

	public LocalDate getFechaFinSuspensión() {
		return fechaFinSuspensión;
	}

	public void setFechaFinSuspensión(LocalDate fechaFinSuspensión) {
		this.fechaFinSuspensión = fechaFinSuspensión;
	}

	public long getBibliotecaId() {
		return bibliotecaId;
	}

	public void setBibliotecaId(long bibliotecaId) {
		this.bibliotecaId = bibliotecaId;
	}

	public ClienteDto(long id, String nombre, String apellidos, String apellido1, String apellido2, LocalDate fechaNac,
			String dni, String correo, boolean esValido, LocalDate fechaInicioSuspension, LocalDate fechaFinSuspensión,
			long bibliotecaId) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		this.dni = dni;
		this.correo = correo;
		this.esValido = esValido;
		this.fechaInicioSuspension = fechaInicioSuspension;
		this.fechaFinSuspensión = fechaFinSuspensión;
		this.bibliotecaId = bibliotecaId;
		String[] apellidosJunto = apellidos.split(" ");
		this.apellido1 = apellidosJunto[0];
		this.apellido2 = apellidosJunto[1];
		
	}

	public ClienteDto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ClienteDto [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + ", fechaNac=" + fechaNac + ", dni=" + dni + ", correo=" + correo
				+ ", esValido=" + esValido + ", fechaInicioSuspension=" + fechaInicioSuspension
				+ ", fechaFinSuspensión=" + fechaFinSuspensión + ", bibliotecaId=" + bibliotecaId + "]";
	}

	
}
