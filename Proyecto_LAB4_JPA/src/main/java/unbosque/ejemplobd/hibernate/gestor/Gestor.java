package unbosque.ejemplobd.hibernate.gestor;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import unbosque.ejemplobd.hibernate.modelo.Sucursal;


public class Gestor {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");

	public static void main(String[] args) {
		insertar();
		imprimirTodo();
	}

	private static void insertar() {

		EntityManager gestor = emf.createEntityManager();
		/*
		 * Sucursal sucursal = new
		 * Sucursal("Bog01","calle 60a","Lunes-viernes","Bogota","Aura"); Empleado
		 * empleado = new Empleado( "AC001", "Nigger", "04/05/1998", "11564897",
		 * "99.05", "Bog01"); sucursal.setEmpleado((List<Empleado>) empleado);
		 * Medicamento_sucursal msucursal = new Medicamento_sucursal("Ace70", "Bog01",
		 * "130"); sucursal.setMedicamento_sucursal((List<Medicamento_sucursal>)
		 * msucursal); Medicamento medicamento = new Medicamento("Ace70",
		 * "Acetaminofem", "Tableta", "MK"); msucursal.setMedicamento(medicamento);
		 * 
		 * gestor.getTransaction( ).begin( ); gestor.persist(empleado);
		 * gestor.persist(msucursal); gestor.persist(medicamento);
		 * gestor.getTransaction( ).commit( );
		 * 
		 * gestor.close();
		 */
	}

	private static void imprimirTodo() {
		EntityManager gestor = emf.createEntityManager();
		System.out.println("Conexion Exitosa");
		List<Sucursal> sucursal = (List<Sucursal>) gestor.createQuery("FROM Sucursal").getResultList();
		System.out.println("En la base de datos hay " + sucursal.size() + " sucursales.");
		/*
		 * for( Sucursal c : sucursal ) { System.out.println(c.toString()); }
		 */
		gestor.close();
	}

}
