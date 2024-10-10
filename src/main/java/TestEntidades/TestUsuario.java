package TestEntidades;

import java.util.List;

import DaoImp.UsuarioImp;
import model.TblUsuarioex;

public class TestUsuario {

	public static void main(String[] args) {
		
		TblUsuarioex tblu = new TblUsuarioex();
		UsuarioImp uimp = new UsuarioImp();
		
		//Registrar
		/*tblu.setUsuarioex("jose");
		tblu.setPasswordex("123");
		uimp.RegistrarUsuario(tblu);
		System.out.println("Usuario Registrado");*/
		
		//Actualizar
		/*tblu.setIdusuarioex(3);
		tblu.setUsuarioex("jose cibertec");
		tblu.setPasswordex("jose123");
		uimp.ActualizarUsuario(tblu);
		System.out.println("Usuario Actualizado");*/
		
		//Eliminar
		/*tblu.setIdusuarioex(1);
		uimp.EliminarUsuario(tblu);
		System.out.println("Usuario Eliminado");*/
		
		//Listar
		List<TblUsuarioex> listado = uimp.ListarUsuario();
		for(TblUsuarioex lis:listado){
			System.out.println("ID : " + lis.getIdusuarioex() + "\n" +
					           "Usuario : " + lis.getUsuarioex() + "\n" +
					           "Password : " + lis.getPasswordex());
		}
		
		//Buscar
		/*tblu.setIdusuarioex(1);
		TblUsuarioex bususu = uimp.BuscarUsuario(tblu);
		System.out.println("Usuario : " + bususu.getIdusuarioex() + "\n" +
		           "Usuario : " + bususu.getUsuarioex() + "\n" +
		           "Password : " + bususu.getPasswordex());*/
		

	}

}
