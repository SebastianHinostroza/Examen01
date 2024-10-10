package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProveedor;
import model.TblProveedorex;


public class ProveedorImp implements IProveedor{

	public void RegistrarProveedor(TblProveedorex tblp) {
		
		//Nos conectamos con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoExamen");
		//Para administrar las transacciones
		EntityManager em = emf.createEntityManager();
		
		try{
		//Iniciamos la transaccion
		em.getTransaction().begin();
		
		//Invocamos el metodo registrar
		em.persist(tblp);
		
		//Confirmamos
		em.getTransaction().commit();
		}catch(RuntimeException ex){
			//Emitimos mensaje de error
			ex.getMessage();
		}finally{	
		    //Cerramos
		    em.close();
		}
	}
	

	public void ActualizarProveedor(TblProveedorex tblp) {
		//Nos conectamos con la unidad de persistencia
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoExamen");
				//Para administrar las transacciones
				EntityManager em = emf.createEntityManager();
				
				try{
				//Iniciamos la transaccion
				em.getTransaction().begin();
				
				//Invocamos el metodo actualizar
				em.merge(tblp);
				
				//Confirmamos
				em.getTransaction().commit();
				}catch(RuntimeException ex){
					//Emitimos mensaje de error
					ex.getMessage();
				}finally{	
				    //Cerramos
				    em.close();
				}
		
	}

	public void EliminarProveedor(TblProveedorex tblp) {
		//Nos conectamos con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoExamen");
		//Para administrar las transacciones
		EntityManager em = emf.createEntityManager();
		
		try{
		//Iniciamos la transaccion
		em.getTransaction().begin();
		
		//Recuperamos el codigo a eliminar
		TblProveedorex codeli = em.find(TblProveedorex.class, tblp.getIdproveedorex());
		
		//Aplicamos una condicion
		if(codeli != null){
		
		//Procedemos a eliminar
		em.remove(codeli);
		
		//Confirmamos
		em.getTransaction().commit();
		}
		}catch(RuntimeException ex){
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			//Emitimos mensaje de error
			ex.getMessage();
		}finally{	
		    //Cerramos
		    em.close();
		}
		
	}

	public List<TblProveedorex> ListarProveedor() {
		//Nos conectamos con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoExamen");
		//Para administrar las transacciones
		EntityManager em = emf.createEntityManager();
        List <TblProveedorex> listado = null;
		
		try {
		em.getTransaction().begin();
		
		listado = em.createQuery("select p from TblProveedorex p", TblProveedorex.class).getResultList();
		
		em.getTransaction().commit();
		
		} catch(RuntimeException ex) {
			
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			ex.getMessage();
		
		} finally {
			em.close();
		}
		
		return listado;
	}

	public TblProveedorex BuscarProveedor(TblProveedorex tblu) {
		//Nos conectamos con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoExamen");
		//Para administrar las transacciones
		EntityManager em = emf.createEntityManager();
		TblProveedorex buspro = null;
		
		try {
			//Iniciamos la transaccion
			em.getTransaction().begin();
			
			//Buscamos por codigo
			buspro = em.find(TblProveedorex.class, tblu.getIdproveedorex());
			
			//Confirmamos
			em.getTransaction().commit();
		} catch (RuntimeException ex) {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			ex.getMessage();
		} finally {
			em.close();
		}
		return buspro;
	}

}
