package unbosque.ejemplobd.hibernate.modelo;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table (name="medicamento")
public class Medicamento {

	@Id
	@Column(name="id_Medicamento")
	private String idmedicamento;
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Presentacion")
	private String presentacion;

	@Column(name="Laboratorio")
	private String laboratorio;
	
	/*@OneToMany(mappedBy="medicamento", cascade = CascadeType.ALL)
	private List<Medicamento_sucursal> Medicamento_sucursal = new ArrayList<>();*/

	public Medicamento(String idmedicamento, String nombre, String presentacion, String laboratorio) {
		this.idmedicamento = idmedicamento;
		this.nombre = nombre;
		this.presentacion = presentacion;
		this.laboratorio = laboratorio;
	}
	
	public Medicamento() {
		
	}

	public String getIdmedicamento() {
		return idmedicamento;
	}

	public void setIdmedicamento(String idmedicamento) {
		this.idmedicamento = idmedicamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	/*public List<Medicamento_sucursal> getMedicamento_sucursal() {
		return Medicamento_sucursal;
	}

	public void setMedicamento_sucursal(List<Medicamento_sucursal> medicamento_sucursal) {
		Medicamento_sucursal = medicamento_sucursal;
	}
	*/
	
}
