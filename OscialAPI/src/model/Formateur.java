package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the formateur database table.
 * 
 */
@Entity
@Table(name="formateur")
@NamedQuery(name="Formateur.findAll", query="SELECT f FROM Formateur f")
public class Formateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID_utilisateur;

	@Column(name="formateur_anciennete")
	private String formateurAnciennete;

	@Column(name="formateur_matiere")
	private String formateurMatiere;

	//bi-directional one-to-one association to Utilisateur
	@OneToOne
	@JoinColumn(name="ID_utilisateur")
	private Utilisateur utilisateur;

	public Formateur() {
	}

	public int getID_utilisateur() {
		return this.ID_utilisateur;
	}

	public void setID_utilisateur(int ID_utilisateur) {
		this.ID_utilisateur = ID_utilisateur;
	}

	public String getFormateurAnciennete() {
		return this.formateurAnciennete;
	}

	public void setFormateurAnciennete(String formateurAnciennete) {
		this.formateurAnciennete = formateurAnciennete;
	}

	public String getFormateurMatiere() {
		return this.formateurMatiere;
	}

	public void setFormateurMatiere(String formateurMatiere) {
		this.formateurMatiere = formateurMatiere;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}