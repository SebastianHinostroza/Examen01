package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;

import model.TblUsuarioex;

public class UsuarioImp implements IUsuario{

	public void RegistrarUsuario(TblUsuarioex tblu) {
		//Nos conectamos con la unidad de persistencia
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoExamen");
				//Para administrar las transacciones
				EntityManager em = emf.createEntityManager();
				
				try{
				//Iniciamos la transaccion
				em.getTransaction().begin();
				
				//Invocamos el metodo registrar
				em.persist(tblu);
				
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

	public void ActualizarUsuario(TblUsuarioex tblu) {
		//Nos conectamos con la unidad de persistencia
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoExamen");
		//Para administrar las transacciones
		EntityManager em = emf.createEntityManager();
		
		try{
		//Iniciamos la transaccion
		em.getTransaction().begin();
		
		//Invocamos el metodo actualizar
		em.merge(tblu);
		
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

	public void EliminarUsuario(TblUsuarioex tblu) {
		
		//Nos conectamos con la unidad de persistencia
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoExamen");
				//Para administrar las transacciones
				EntityManager em = emf.createEntityManager();
				
				try{
				//Iniciamos la transaccion
				em.getTransaction().begin();
				
				//Recuperamos el codigo a eliminar
				TblUsuarioex codeli = em.find(TblUsuarioex.class, tblu.getIdusuarioex());
				
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

	public List<TblUsuarioex> ListarUsuario() {
		//Nos conectamos con la unidad de persistencia
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoExamen");
				//Para administrar las transacciones
				EntityManager em = emf.createEntityManager();
		        List <TblUsuarioex> listado = null;
				
				try {
				em.getTransaction().begin();
				
				listado = em.createQuery("select u from TblUsuarioex u", TblUsuarioex.class).getResultList();
				
				em.getTransaction().commit();
				
				} catch(RuntimeException ex) {
					
					if(em.getTransaction().isActive()) em.getTransaction().rollback();
					ex.getMessage();
				
				} finally {
					em.close();
				}
				
				return listado;
	}

	public TblUsuarioex BuscarUsuario(TblUsuarioex tblu) {
		//Nos conectamos con la unidad de persistencia
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoExamen");
				//Para administrar las transacciones
				EntityManager em = emf.createEntityManager();
				TblUsuarioex bususu = null;
				
				try {
					//Iniciamos la transaccion
					em.getTransaction().begin();
					
					//Buscamos por codigo
					bususu = em.find(TblUsuarioex.class, tblu.getIdusuarioex());
					
					//Confirmamos
					em.getTransaction().commit();
				} catch (RuntimeException ex) {
					if(em.getTransaction().isActive()) em.getTransaction().rollback();
					ex.getMessage();
				} finally {
					em.close();
				}
				return bususu;
		
	}

}
