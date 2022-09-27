package unbosque.ejemplobd.hibernate.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Sucursal ")
public class Sucursal implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_Sucursal")
	private String idsucursal;

	@Column(name = "Direccion")
	private String direccion;

	@Column(name = "Horario")
	private String horario;

	@Column(name = "Ciudad")
	private String ciudad;

	@Column(name = "Jefe")
	private String jefe;

	
	 @OneToMany
	 @JoinColumn(name="id_Sucursal")
	 private List<Empleado> empleados;
	 @OneToMany
	 @JoinColumn(name="id_Sucursal")
	 private List<Medicamento_sucursal> medicamentos;
	  

	public Sucursal() {

	}

	public Sucursal(String idsucursal, String direccion, String horario, String ciudad, String jefe) {
		this.idsucursal = idsucursal;
		this.direccion = direccion;
		this.horario = horario;
		this.ciudad = ciudad;
		this.jefe = jefe;
	}

	public String getIdsucursal() {
		return idsucursal;
	}

	public void setIdsucursal(String idsucursal) {
		this.idsucursal = idsucursal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getJefe() {
		return jefe;
	}

	public void setJefe(String jefe) {
		this.jefe = jefe;
	}

	/*
	 * public List<Empleado> getEmpleado() { return Empleado; }
	 * 
	 * public void setEmpleado(List<Empleado> empleado) { Empleado = empleado; }
	 * 
	 * public List<Medicamento_sucursal> getMedicamento_sucursal() { return
	 * Medicamento_sucursal; }
	 * 
	 * public void setMedicamento_sucursal(List<Medicamento_sucursal>
	 * medicamento_sucursal) { Medicamento_sucursal = medicamento_sucursal; }
	 */
}
