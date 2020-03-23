package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the covoiturage database table.
 * 
 */
@Entity
@Table(name="covoiturage")
@NamedQuery(name="Covoiturage.findAll", query="SELECT c FROM Covoiturage c")
public class Covoiturage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID_covoit;

	@Column(name="covoit_adresse_arrivee")
	private String covoitAdresseArrivee;

	@Column(name="covoit_adresse_complementaire_arrivee")
	private String covoitAdresseComplementaireArrivee;

	@Column(name="covoit_adresse_complementaire_depart")
	private String covoitAdresseComplementaireDepart;

	@Column(name="covoit_adresse_depart")
	private String covoitAdresseDepart;

	@Column(name="covoit_code_postal_arrivee")
	private int covoitCodePostalArrivee;

	@Column(name="covoit_code_postal_depart")
	private int covoitCodePostalDepart;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="covoit_date_arrive")
	private Date covoitDateArrive;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="covoit_date_depart")
	private Date covoitDateDepart;

	@Column(name="covoit_vehicule")
	private String covoitVehicule;

	@Column(name="covoit_ville_arrivee")
	private String covoitVilleArrivee;

	@Column(name="covoit_ville_depart")
	private String covoitVilleDepart;

	//bi-directional many-to-one association to Tchat
	@ManyToOne
	@JoinColumn(name="ID_tchat")
	private Tchat tchat;

	public Covoiturage() {
	}

	public int getID_covoit() {
		return this.ID_covoit;
	}

	public void setID_covoit(int ID_covoit) {
		this.ID_covoit = ID_covoit;
	}

	public String getCovoitAdresseArrivee() {
		return this.covoitAdresseArrivee;
	}

	public void setCovoitAdresseArrivee(String covoitAdresseArrivee) {
		this.covoitAdresseArrivee = covoitAdresseArrivee;
	}

	public String getCovoitAdresseComplementaireArrivee() {
		return this.covoitAdresseComplementaireArrivee;
	}

	public void setCovoitAdresseComplementaireArrivee(String covoitAdresseComplementaireArrivee) {
		this.covoitAdresseComplementaireArrivee = covoitAdresseComplementaireArrivee;
	}

	public String getCovoitAdresseComplementaireDepart() {
		return this.covoitAdresseComplementaireDepart;
	}

	public void setCovoitAdresseComplementaireDepart(String covoitAdresseComplementaireDepart) {
		this.covoitAdresseComplementaireDepart = covoitAdresseComplementaireDepart;
	}

	public String getCovoitAdresseDepart() {
		return this.covoitAdresseDepart;
	}

	public void setCovoitAdresseDepart(String covoitAdresseDepart) {
		this.covoitAdresseDepart = covoitAdresseDepart;
	}

	public int getCovoitCodePostalArrivee() {
		return this.covoitCodePostalArrivee;
	}

	public void setCovoitCodePostalArrivee(int covoitCodePostalArrivee) {
		this.covoitCodePostalArrivee = covoitCodePostalArrivee;
	}

	public int getCovoitCodePostalDepart() {
		return this.covoitCodePostalDepart;
	}

	public void setCovoitCodePostalDepart(int covoitCodePostalDepart) {
		this.covoitCodePostalDepart = covoitCodePostalDepart;
	}

	public Date getCovoitDateArrive() {
		return this.covoitDateArrive;
	}

	public void setCovoitDateArrive(Date covoitDateArrive) {
		this.covoitDateArrive = covoitDateArrive;
	}

	public Date getCovoitDateDepart() {
		return this.covoitDateDepart;
	}

	public void setCovoitDateDepart(Date covoitDateDepart) {
		this.covoitDateDepart = covoitDateDepart;
	}

	public String getCovoitVehicule() {
		return this.covoitVehicule;
	}

	public void setCovoitVehicule(String covoitVehicule) {
		this.covoitVehicule = covoitVehicule;
	}

	public String getCovoitVilleArrivee() {
		return this.covoitVilleArrivee;
	}

	public void setCovoitVilleArrivee(String covoitVilleArrivee) {
		this.covoitVilleArrivee = covoitVilleArrivee;
	}

	public String getCovoitVilleDepart() {
		return this.covoitVilleDepart;
	}

	public void setCovoitVilleDepart(String covoitVilleDepart) {
		this.covoitVilleDepart = covoitVilleDepart;
	}

	public Tchat getTchat() {
		return this.tchat;
	}

	public void setTchat(Tchat tchat) {
		this.tchat = tchat;
	}

}