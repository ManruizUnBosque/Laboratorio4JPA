package unbosque.ejemplobd.hibernate.modelo;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {

	@Id
	@Column(name = "id_empleado")
	private String idempleado;

	@Column(name = "Nombre")
	private String nombre;

	@Column(name = "Fecha_Nac")
	@Temporal(TemporalType.DATE)
	private Date fechanac;

	@Column(name = "Identificacion")
	private String identificacion;

	@Column(name = "Salario")
	private String salario;

	/*
	 * @Column(name="id_Sucursal") private String idsucursal;
	 */

	@ManyToOne
	@JoinColumn(name = "id_Sucursal", nullable = false)
	private Sucursal id_Sucursal;

	public Empleado() {

	}

	public Empleado(String idempleado, String nombre, Date fechanac, String identificacion, String salario,
			Sucursal id_sucursal) {
		this.idempleado = idempleado;
		this.nombre = nombre;
		this.fechanac = fechanac;
		this.identificacion = identificacion;
		this.salario = salario;
		this.id_Sucursal = id_sucursal;

	}

	public String getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(String idempleado) {
		this.idempleado = idempleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechanac() {
		return fechanac;
	}

	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	/*
	 * public Sucursal getSucursal() { return sucursal; }
	 * 
	 * public void setSucursal(Sucursal sucursal) { this.sucursal = sucursal; }
	 */

}
