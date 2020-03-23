package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the formation database table.
 * 
 */
@Entity
@Table(name="formation")
@NamedQuery(name="Formation.findAll", query="SELECT f FROM Formation f")
public class Formation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID_formation;

	@Column(name="formation_duree")
	private String formationDuree;

	@Column(name="formation_etablissement")
	private String formationEtablissement;

	@Column(name="formation_libelle")
	private String formationLibelle;

	//bi-directional many-to-many association to Utilisateur
	@ManyToMany(mappedBy="formations")
	private List<Utilisateur> utilisateurs;

	public Formation() {
	}

	public int getID_formation() {
		return this.ID_formation;
	}

	public void setID_formation(int ID_formation) {
		this.ID_formation = ID_formation;
	}

	public String getFormationDuree() {
		return this.formationDuree;
	}

	public void setFormationDuree(String formationDuree) {
		this.formationDuree = formationDuree;
	}

	public String getFormationEtablissement() {
		return this.formationEtablissement;
	}

	public void setFormationEtablissement(String formationEtablissement) {
		this.formationEtablissement = formationEtablissement;
	}

	public String getFormationLibelle() {
		return this.formationLibelle;
	}

	public void setFormationLibelle(String formationLibelle) {
		this.formationLibelle = formationLibelle;
	}

	public List<Utilisateur> getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}