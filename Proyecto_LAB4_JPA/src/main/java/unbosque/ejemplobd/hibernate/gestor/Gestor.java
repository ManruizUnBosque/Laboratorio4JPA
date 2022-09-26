package unbosque.ejemplobd.hibernate.gestor;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import unbosque.ejemplobd.hibernate.modelo.Cliente;

public class Gestor {
	private static EntityManager gestor;
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("Persistencia");
		gestor = emf.createEntityManager( );
		List<Cliente> clientes = (List<Cliente>) gestor.createQuery("FROM Cliente").getResultList( );
		System.out.println("En la base de datos hay " + clientes.size( ) + " clientes.");
	}

}
