package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the offre database table.
 * 
 */
@Entity
@Table(name="offre")
@NamedQuery(name="Offre.findAll", query="SELECT o FROM Offre o")
public class Offre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID_post;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="offre_date_expiration")
	private Date offreDateExpiration;

	@Column(name="offre_entreprise_adresse_complementaire")
	private String offreEntrepriseAdresseComplementaire;

	@Column(name="offre_entreprise_adresse_postale")
	private String offreEntrepriseAdressePostale;

	@Column(name="offre_entreprise_code_postal")
	private int offreEntrepriseCodePostal;

	@Column(name="offre_entreprise_ville")
	private String offreEntrepriseVille;

	@Column(name="offre_nb_max_candidats")
	private int offreNbMaxCandidats;

	@Column(name="offre_niveau_etudes")
	private String offreNiveauEtudes;

	//bi-directional one-to-one association to Post
	@OneToOne
	@JoinColumn(name="ID_post")
	private Post post;

	public Offre() {
	}

	public int getID_post() {
		return this.ID_post;
	}

	public void setID_post(int ID_post) {
		this.ID_post = ID_post;
	}

	public Date getOffreDateExpiration() {
		return this.offreDateExpiration;
	}

	public void setOffreDateExpiration(Date offreDateExpiration) {
		this.offreDateExpiration = offreDateExpiration;
	}

	public String getOffreEntrepriseAdresseComplementaire() {
		return this.offreEntrepriseAdresseComplementaire;
	}

	public void setOffreEntrepriseAdresseComplementaire(String offreEntrepriseAdresseComplementaire) {
		this.offreEntrepriseAdresseComplementaire = offreEntrepriseAdresseComplementaire;
	}

	public String getOffreEntrepriseAdressePostale() {
		return this.offreEntrepriseAdressePostale;
	}

	public void setOffreEntrepriseAdressePostale(String offreEntrepriseAdressePostale) {
		this.offreEntrepriseAdressePostale = offreEntrepriseAdressePostale;
	}

	public int getOffreEntrepriseCodePostal() {
		return this.offreEntrepriseCodePostal;
	}

	public void setOffreEntrepriseCodePostal(int offreEntrepriseCodePostal) {
		this.offreEntrepriseCodePostal = offreEntrepriseCodePostal;
	}

	public String getOffreEntrepriseVille() {
		return this.offreEntrepriseVille;
	}

	public void setOffreEntrepriseVille(String offreEntrepriseVille) {
		this.offreEntrepriseVille = offreEntrepriseVille;
	}

	public int getOffreNbMaxCandidats() {
		return this.offreNbMaxCandidats;
	}

	public void setOffreNbMaxCandidats(int offreNbMaxCandidats) {
		this.offreNbMaxCandidats = offreNbMaxCandidats;
	}

	public String getOffreNiveauEtudes() {
		return this.offreNiveauEtudes;
	}

	public void setOffreNiveauEtudes(String offreNiveauEtudes) {
		this.offreNiveauEtudes = offreNiveauEtudes;
	}

	public Post getPost() {
		return this.post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}