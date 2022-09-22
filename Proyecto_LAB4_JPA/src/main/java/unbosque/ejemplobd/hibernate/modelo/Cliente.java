package unbosque.ejemplobd.hibernate.modelo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "RUT")
	private String rut;
	
	@Column(name = "Nombre")
	private String nombre;

	public Cliente() {
	}

	public Cliente(String nRut, String nNombre) {
		this.rut = nRut;
		this.nombre = nNombre;
	}

	public String getRut() {
		return rut;
	}
	
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombre=" + nombre + "]";
	}
}
