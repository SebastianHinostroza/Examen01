package TestEntidades;

import java.util.Date;
import java.util.List;

import DaoImp.ProveedorImp;
import model.TblProveedorex;

public class TestProveedor {

	public static void main(String[] args) {
		
		TblProveedorex tblp = new TblProveedorex();
		ProveedorImp pimp = new ProveedorImp();
		
		//Registrar
		tblp.setNomprovex("MAXX");
		tblp.setRucprovex("12345678");
		tblp.setRsocialex("Institucion");
		tblp.setEmailex("cib@gmail.com");
		Date fecha = new Date();
		Date fechasql = new Date(fecha.getTime());
		tblp.setFeingex(fechasql);
		pimp.RegistrarProveedor(tblp);
		System.out.println("Proveedor Registrado");
		
		//Actualizar
		/*tblp.setIdproveedorex(1);
		tblp.setNomprovex("Cibertec");
		tblp.setRucprovex("12345678");
		tblp.setRsocialex("Institucion");
		tblp.setEmailex("cib@gmail.com");
		//Date fecha = new Date();
		//Date fechasql = new Date(fecha.getTime());
		tblp.setFeingex(fechasql);
		pimp.ActualizarProveedor(tblp);
		System.out.println("Proveedor Actualizado");*/
		
		//Eliminar
		/*tblp.setIdproveedorex(1);
		pimp.EliminarProveedor(tblp);
		System.out.println("Producto Eliminado");*/
		
		//Listado
		/*List<TblProveedorex> listado = pimp.ListarProveedor();
		for(TblProveedorex lis:listado){
			System.out.println("ID : " + lis.getIdproveedorex() + "\n" +
					"Nombre : " + lis.getNomprovex() + "\n" +
					"RUC : " + lis.getRucprovex() + "\n" +
					"Razon Social : " + lis.getRsocialex() + "\n" +
					"Email : " + lis.getEmailex() + "\n" +
					"Feing : " + lis.getFeingex() + "\n" );
		}*/
		
		//Buscar
		/*tblp.setIdproveedorex(1);
		TblProveedorex buspro = pimp.BuscarProveedor(tblp);
		System.out.println("ID : " + buspro.getIdproveedorex() + "\n" +
					"Nombre : " + buspro.getNomprovex() + "\n" +
					"RUC : " + buspro.getRucprovex() + "\n" +
					"Razon Social : " + buspro.getRsocialex() + "\n" +
					"Email : " + buspro.getEmailex() + "\n" +
					"Feing : " + buspro.getFeingex() + "\n");*/
		

	}

}
