package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the etudiant database table.
 * 
 */
@Entity
@Table(name="etudiant")
@NamedQuery(name="Etudiant.findAll", query="SELECT e FROM Etudiant e")
public class Etudiant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID_utilisateur;

	@Column(name="etudiant_entreprise")
	private String etudiantEntreprise;

	@Column(name="etudiant_niveau_etudes")
	private String etudiantNiveauEtudes;

	//bi-directional one-to-one association to Utilisateur
	@OneToOne
	@JoinColumn(name="ID_utilisateur")
	private Utilisateur utilisateur;

	public Etudiant() {
	}

	public int getID_utilisateur() {
		return this.ID_utilisateur;
	}

	public void setID_utilisateur(int ID_utilisateur) {
		this.ID_utilisateur = ID_utilisateur;
	}

	public String getEtudiantEntreprise() {
		return this.etudiantEntreprise;
	}

	public void setEtudiantEntreprise(String etudiantEntreprise) {
		this.etudiantEntreprise = etudiantEntreprise;
	}

	public String getEtudiantNiveauEtudes() {
		return this.etudiantNiveauEtudes;
	}

	public void setEtudiantNiveauEtudes(String etudiantNiveauEtudes) {
		this.etudiantNiveauEtudes = etudiantNiveauEtudes;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}