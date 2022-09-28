package unbosque.ejemplobd.hibernate.modelo;
import javax.persistence.*;

@Entity
@Table (name="medicamento_sucursal")
public class Medicamento_sucursal {
	
	@Column(name="Cantidad")
	private String cantidad;

	@Id
	@ManyToOne
	@JoinColumn(name="id_Sucursal", nullable=false)
	private Sucursal id_sucursal;
	@ManyToOne
	@JoinColumn(name="id_Medicamento", nullable=false)
	private Medicamento id_medicamento;
	
	public Medicamento_sucursal() {
		
	}
	
	public Medicamento_sucursal(String cantidad) {

		this.cantidad = cantidad;
	}


	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public Sucursal getId_sucursal() {
		return id_sucursal;
	}

	public void setId_sucursal(Sucursal id_sucursal) {
		this.id_sucursal = id_sucursal;
	}

	public Medicamento getId_medicamento() {
		return id_medicamento;
	}

	public void setId_medicamento(Medicamento id_medicamento) {
		this.id_medicamento = id_medicamento;
	}

}
