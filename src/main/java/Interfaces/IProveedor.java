package Interfaces;

import java.util.List;

import model.TblProveedorex;

public interface IProveedor {

	void RegistrarProveedor(TblProveedorex tblp);
	void ActualizarProveedor(TblProveedorex tblp);
	void EliminarProveedor(TblProveedorex tblp);
	List<TblProveedorex>ListarProveedor();
	TblProveedorex BuscarProveedor(TblProveedorex tblu);
}
