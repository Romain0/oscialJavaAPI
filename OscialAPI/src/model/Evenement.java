package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the evenement database table.
 * 
 */
@Entity
@Table(name="evenement")
@NamedQuery(name="Evenement.findAll", query="SELECT e FROM Evenement e")
public class Evenement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID_post;

	@Column(name="evenement_adresse")
	private String evenementAdresse;

	@Column(name="evenement_adresse_complementaire")
	private String evenementAdresseComplementaire;

	@Column(name="evenement_code_postal")
	private int evenementCodePostal;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="evenement_date_debut")
	private Date evenementDateDebut;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="evenement_date_fin")
	private Date evenementDateFin;

	@Column(name="evenement_type")
	private String evenementType;

	@Column(name="evenement_ville")
	private String evenementVille;

	//bi-directional one-to-one association to Post
	@OneToOne
	@JoinColumn(name="ID_post")
	private Post post;

	public Evenement() {
	}

	public int getID_post() {
		return this.ID_post;
	}

	public void setID_post(int ID_post) {
		this.ID_post = ID_post;
	}

	public String getEvenementAdresse() {
		return this.evenementAdresse;
	}

	public void setEvenementAdresse(String evenementAdresse) {
		this.evenementAdresse = evenementAdresse;
	}

	public String getEvenementAdresseComplementaire() {
		return this.evenementAdresseComplementaire;
	}

	public void setEvenementAdresseComplementaire(String evenementAdresseComplementaire) {
		this.evenementAdresseComplementaire = evenementAdresseComplementaire;
	}

	public int getEvenementCodePostal() {
		return this.evenementCodePostal;
	}

	public void setEvenementCodePostal(int evenementCodePostal) {
		this.evenementCodePostal = evenementCodePostal;
	}

	public Date getEvenementDateDebut() {
		return this.evenementDateDebut;
	}

	public void setEvenementDateDebut(Date evenementDateDebut) {
		this.evenementDateDebut = evenementDateDebut;
	}

	public Date getEvenementDateFin() {
		return this.evenementDateFin;
	}

	public void setEvenementDateFin(Date evenementDateFin) {
		this.evenementDateFin = evenementDateFin;
	}

	public String getEvenementType() {
		return this.evenementType;
	}

	public void setEvenementType(String evenementType) {
		this.evenementType = evenementType;
	}

	public String getEvenementVille() {
		return this.evenementVille;
	}

	public void setEvenementVille(String evenementVille) {
		this.evenementVille = evenementVille;
	}

	public Post getPost() {
		return this.post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}