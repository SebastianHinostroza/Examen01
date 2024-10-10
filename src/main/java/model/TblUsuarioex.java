package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_usuarioex database table.
 * 
 */
@Entity
@Table(name="tbl_usuarioex")
@NamedQuery(name="TblUsuarioex.findAll", query="SELECT t FROM TblUsuarioex t")
public class TblUsuarioex implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idusuarioex;

	private String passwordex;

	private String usuarioex;

	public TblUsuarioex() {
	}

	public int getIdusuarioex() {
		return this.idusuarioex;
	}

	public void setIdusuarioex(int idusuarioex) {
		this.idusuarioex = idusuarioex;
	}

	public String getPasswordex() {
		return this.passwordex;
	}

	public void setPasswordex(String passwordex) {
		this.passwordex = passwordex;
	}

	public String getUsuarioex() {
		return this.usuarioex;
	}

	public void setUsuarioex(String usuarioex) {
		this.usuarioex = usuarioex;
	}

}