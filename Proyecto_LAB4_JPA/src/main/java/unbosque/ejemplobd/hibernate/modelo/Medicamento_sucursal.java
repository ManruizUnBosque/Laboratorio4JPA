package unbosque.ejemplobd.hibernate.modelo;
import javax.persistence.*;

@Entity
@Table (name="medicamento_sucursal")
public class Medicamento_sucursal {
	
	@Column(name="id_Medicamento")
	private String idmedicamento;
	
	@Column(name="id_Sucursal")
	private String idsucursal;
	
	@Id
	@Column(name="Cantidad")
	private String cantidad;

	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_Sucursal")
	private Sucursal sucursal;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_Medicamento")
	private Medicamento medicamento;*/
	
	public Medicamento_sucursal() {
		
	}
	
	public Medicamento_sucursal(String idmedicamento, String idsucursal, String cantidad) {
		this.idmedicamento = idmedicamento;
		this.idsucursal = idsucursal;
		this.cantidad = cantidad;
	}

	public String getIdmedicamento() {
		return idmedicamento;
	}

	public void setIdmedicamento(String idmedicamento) {
		this.idmedicamento = idmedicamento;
	}

	public String getIdsucursal() {
		return idsucursal;
	}

	public void setIdsucursal(String idsucursal) {
		this.idsucursal = idsucursal;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	/*public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	*/
}
