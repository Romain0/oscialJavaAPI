package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the socialiser database table.
 * 
 */
@Entity
@Table(name="socialiser")
@NamedQuery(name="Socialiser.findAll", query="SELECT s FROM Socialiser s")
public class Socialiser implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SocialiserPK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="socialiser_date_amitie")
	private Date socialiserDateAmitie;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="socialiser_date_statut")
	private Date socialiserDateStatut;

	@Column(name="socialiser_statut")
	private String socialiserStatut;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="ID_utilisateur_2")
	private Utilisateur utilisateur1;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="ID_utilisateur_1")
	private Utilisateur utilisateur2;

	public Socialiser() {
	}

	public SocialiserPK getId() {
		return this.id;
	}

	public void setId(SocialiserPK id) {
		this.id = id;
	}

	public Date getSocialiserDateAmitie() {
		return this.socialiserDateAmitie;
	}

	public void setSocialiserDateAmitie(Date socialiserDateAmitie) {
		this.socialiserDateAmitie = socialiserDateAmitie;
	}

	public Date getSocialiserDateStatut() {
		return this.socialiserDateStatut;
	}

	public void setSocialiserDateStatut(Date socialiserDateStatut) {
		this.socialiserDateStatut = socialiserDateStatut;
	}

	public String getSocialiserStatut() {
		return this.socialiserStatut;
	}

	public void setSocialiserStatut(String socialiserStatut) {
		this.socialiserStatut = socialiserStatut;
	}

	public Utilisateur getUtilisateur1() {
		return this.utilisateur1;
	}

	public void setUtilisateur1(Utilisateur utilisateur1) {
		this.utilisateur1 = utilisateur1;
	}

	public Utilisateur getUtilisateur2() {
		return this.utilisateur2;
	}

	public void setUtilisateur2(Utilisateur utilisateur2) {
		this.utilisateur2 = utilisateur2;
	}

}