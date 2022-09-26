package unbosque.ejemplobd.hibernate.gestor;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import unbosque.ejemplobd.hibernate.modelo.Sucursal;

public class Gestor {
	private static EntityManager gestor;
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("Persistencia");
		gestor = emf.createEntityManager( );
		System.out.println("Conexion Exitosa");
	}

}
