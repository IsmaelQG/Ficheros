package ejercicio_8;

import java.io.Serializable;
import java.time.LocalDate;

public class Contacto implements Serializable{
	private String nombre;
	private int telefono;
	private String direccion;
	private int cPostal;
	private LocalDate fNac;
	private boolean siDebo;
	private double debito;
	
	public Contacto(String nombre, int telefono, String direccion, int cPostal, LocalDate fNac, boolean siDebo, double debito) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.cPostal = cPostal;
		this.fNac = fNac;
		this.siDebo = siDebo;
		this.debito = debito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getcPostal() {
		return cPostal;
	}

	public void setcPostal(int cPostal) {
		this.cPostal = cPostal;
	}

	public LocalDate getfNac() {
		return fNac;
	}

	public void setfNac(LocalDate fNac) {
		this.fNac = fNac;
	}

	public boolean isSiDebo() {
		return siDebo;
	}

	public void setSiDebo(boolean siDebo) {
		this.siDebo = siDebo;
	}

	public double getDebito() {
		return debito;
	}

	public void setDebito(double debito) {
		this.debito = debito;
	}

}
