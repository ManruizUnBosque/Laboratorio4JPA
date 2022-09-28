package unbosque.ejemplobd.hibernate.modelo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Medicamento_sucursal")
public class Medicamento_sucursal implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne
	@JoinColumn(name = "id_Sucursal", nullable = false)
	private Sucursal id_Sucursal;
	@ManyToOne
	@JoinColumn(name = "id_Medicamento", nullable = false)
	private Medicamento id_Medicamento;

	@Column(name = "Cantidad")
	private String cantidad;

	public Medicamento_sucursal() {

	}

	public Medicamento_sucursal(String cantidad, Sucursal id_Sucursal, Medicamento id_Medicamento) {

		this.cantidad = cantidad;
		this.id_Sucursal = id_Sucursal;
		this.id_Medicamento = id_Medicamento;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public Sucursal getId_sucursal() {
		return id_Sucursal;
	}

	public void setId_sucursal(Sucursal id_sucursal) {
		this.id_Sucursal = id_sucursal;
	}

	public Medicamento getId_medicamento() {
		return id_Medicamento;
	}

	public void setId_medicamento(Medicamento id_medicamento) {
		this.id_Medicamento = id_medicamento;
	}
}
