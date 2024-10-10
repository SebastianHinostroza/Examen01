package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_proveedorex database table.
 * 
 */
@Entity
@Table(name="tbl_proveedorex")
@NamedQuery(name="TblProveedorex.findAll", query="SELECT t FROM TblProveedorex t")
public class TblProveedorex implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproveedorex;

	private String emailex;

	@Temporal(TemporalType.DATE)
	private Date feingex;

	private String nomprovex;

	private String rsocialex;

	private String rucprovex;

	public TblProveedorex() {
	}

	public int getIdproveedorex() {
		return this.idproveedorex;
	}

	public void setIdproveedorex(int idproveedorex) {
		this.idproveedorex = idproveedorex;
	}

	public String getEmailex() {
		return this.emailex;
	}

	public void setEmailex(String emailex) {
		this.emailex = emailex;
	}

	public Date getFeingex() {
		return this.feingex;
	}

	public void setFeingex(Date feingex) {
		this.feingex = feingex;
	}

	public String getNomprovex() {
		return this.nomprovex;
	}

	public void setNomprovex(String nomprovex) {
		this.nomprovex = nomprovex;
	}

	public String getRsocialex() {
		return this.rsocialex;
	}

	public void setRsocialex(String rsocialex) {
		this.rsocialex = rsocialex;
	}

	public String getRucprovex() {
		return this.rucprovex;
	}

	public void setRucprovex(String rucprovex) {
		this.rucprovex = rucprovex;
	}

}