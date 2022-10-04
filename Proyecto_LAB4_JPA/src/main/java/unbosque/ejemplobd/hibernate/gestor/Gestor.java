package unbosque.ejemplobd.hibernate.gestor;

import java.text.SimpleDateFormat;
import java.util.List;
import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;

import unbosque.ejemplobd.hibernate.modelo.Empleado;
import unbosque.ejemplobd.hibernate.modelo.Sucursal;

public class Gestor {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");

	public static void main(String[] args) {
		insertarSucursal();
		insertarEmpleado();
		imprimirTodo();
		List<Sucursal> result = sucursalesPorCiudad("Bogota");
		for (Sucursal a : result) {
			System.out.println(a.getCiudad()+", "+a.getIdsucursal()+", "+a.getHorario()+", "+a.getJefe()+", "+a.getDireccion());
		}
	}

	public static List<Sucursal> sucursalesPorCiudad(String ciudad) {
		EntityManager gestor = emf.createEntityManager();
		try {
			List<Sucursal> sucursales = gestor.createNamedQuery("Sucursal.ciudad", Sucursal.class)
					.setParameter("CIUDAD", ciudad).getResultList();
			gestor.close();
			return sucursales;
		} catch (Exception e) {
			return null;
		}
	}

	private static void insertarEmpleado() {
		try {
			EntityManager gestor = emf.createEntityManager();

			Sucursal sucursal = getSucursal().get(0);
			Empleado empleado = new Empleado("AC001", "Nigger", new SimpleDateFormat("yyyy-MM-dd").parse("1999-05-08"),
					"11564897", "99.05", sucursal);

			gestor.getTransaction().begin();
			gestor.persist(empleado);
			gestor.getTransaction().commit();

			gestor.close();
		} catch (ParseException | RollbackException e) {
			System.out.println("Empleado ya existente");
			// e.printStackTrace();
		}

	}

	private static void insertarSucursal() {
		try {
			EntityManager gestor = emf.createEntityManager();

			Sucursal sucursal = new Sucursal("Bog01", "calle 60a", "Lunes-viernes", "Bogota", "Aura");

			gestor.getTransaction().begin();
			gestor.persist(sucursal);
			gestor.getTransaction().commit();

			gestor.close();
		} catch (RollbackException e) {
			System.out.println("Sucursal ya existente!");
			// e.printStackTrace();
		}

	}

	private static List<Sucursal> getSucursal() {
		EntityManager gestor = emf.createEntityManager();
		List<Sucursal> sucursal = (List<Sucursal>) gestor.createQuery("FROM Sucursal").getResultList();
		gestor.close();
		return sucursal;
	}

	private static void imprimirTodo() {
		EntityManager gestor = emf.createEntityManager();
		System.out.println("Conexion Exitosa");
		List<Sucursal> sucursal = (List<Sucursal>) gestor.createQuery("FROM Sucursal").getResultList();
		List<Empleado> empleado = (List<Empleado>) gestor.createQuery("FROM Empleado").getResultList();
		System.out.println("En la base de datos hay " + sucursal.size() + " sucursales.");

		System.out.println("En la base de datos hay " + empleado.size() + " empleados.");

		gestor.close();
	}

}
