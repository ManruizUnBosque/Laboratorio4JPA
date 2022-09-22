package unbosque.ejemplobd.hibernate.gestor;

import java.util.List;
import javax.persistence.*;

public class GestorClientes {
	private static EntityManager gestor;
	private static EntityManagerFactory emf;

	public static void main(String[] args) 
	{
		emf = Persistence.createEntityManagerFactory("Persistencia");
		gestor = emf.createEntityManager( );
		
	}
}
