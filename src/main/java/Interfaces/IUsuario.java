package Interfaces;

import java.util.List;

import model.TblUsuarioex;

public interface IUsuario {

	void RegistrarUsuario(TblUsuarioex tblu);
	void ActualizarUsuario(TblUsuarioex tblu);
	void EliminarUsuario(TblUsuarioex tblu);
	List<TblUsuarioex>ListarUsuario();
	TblUsuarioex BuscarUsuario(TblUsuarioex tblu);
}
