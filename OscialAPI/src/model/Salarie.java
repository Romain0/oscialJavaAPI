package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the salarie database table.
 * 
 */
@Entity
@Table(name="salarie")
@NamedQuery(name="Salarie.findAll", query="SELECT s FROM Salarie s")
public class Salarie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID_utilisateur;

	@Column(name="salarie_anciennete")
	private String salarieAnciennete;

	@Column(name="salarie_entreprise")
	private String salarieEntreprise;

	//bi-directional one-to-one association to Utilisateur
	@OneToOne
	@JoinColumn(name="ID_utilisateur")
	private Utilisateur utilisateur;

	public Salarie() {
	}

	public int getID_utilisateur() {
		return this.ID_utilisateur;
	}

	public void setID_utilisateur(int ID_utilisateur) {
		this.ID_utilisateur = ID_utilisateur;
	}

	public String getSalarieAnciennete() {
		return this.salarieAnciennete;
	}

	public void setSalarieAnciennete(String salarieAnciennete) {
		this.salarieAnciennete = salarieAnciennete;
	}

	public String getSalarieEntreprise() {
		return this.salarieEntreprise;
	}

	public void setSalarieEntreprise(String salarieEntreprise) {
		this.salarieEntreprise = salarieEntreprise;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}