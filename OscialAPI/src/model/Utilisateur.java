package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the utilisateur database table.
 * 
 */
@Entity
@Table(name="utilisateur")
@NamedQuery(name="Utilisateur.findAll", query="SELECT u FROM Utilisateur u")
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID_utilisateur;

	@Column(name="utilisateur_adresse_complementaire")
	private String utilisateurAdresseComplementaire;

	@Column(name="utilisateur_adresse_postale")
	private String utilisateurAdressePostale;

	@Column(name="utilisateur_code_postal")
	private int utilisateurCodePostal;

	@Temporal(TemporalType.DATE)
	@Column(name="utilisateur_date_naissance")
	private Date utilisateurDateNaissance;

	@Column(name="utilisateur_img_profil")
	private String utilisateurImgProfil;

	@Lob
	@Column(name="utilisateur_loisirs")
	private String utilisateurLoisirs;

	@Column(name="utilisateur_nom")
	private String utilisateurNom;

	@Column(name="utilisateur_possede_permis")
	private byte utilisateurPossedePermis;

	@Column(name="utilisateur_possede_vehicule")
	private byte utilisateurPossedeVehicule;

	@Column(name="utilisateur_prenom")
	private String utilisateurPrenom;

	@Column(name="utilisateur_sexe")
	private byte utilisateurSexe;

	@Column(name="utilisateur_telephone")
	private String utilisateurTelephone;

	@Column(name="utilisateur_ville")
	private String utilisateurVille;

	//bi-directional many-to-many association to Message
	@ManyToMany
	@JoinTable(
		name="envoyer"
		, joinColumns={
			@JoinColumn(name="ID_utilisateur")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_message")
			}
		)
	private List<Message> messages;

	//bi-directional one-to-one association to Etudiant
	@OneToOne(mappedBy="utilisateur")
	private Etudiant etudiant;

	//bi-directional many-to-many association to Formation
	@ManyToMany
	@JoinTable(
		name="etudier"
		, joinColumns={
			@JoinColumn(name="ID_utilisateur")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_formation")
			}
		)
	private List<Formation> formations;

	//bi-directional one-to-one association to Formateur
	@OneToOne(mappedBy="utilisateur")
	private Formateur formateur;

	//bi-directional one-to-one association to Salarie
	@OneToOne(mappedBy="utilisateur")
	private Salarie salarie;

	//bi-directional many-to-one association to Socialiser
	@OneToMany(mappedBy="utilisateur1")
	private List<Socialiser> socialisers1;

	//bi-directional many-to-one association to Socialiser
	@OneToMany(mappedBy="utilisateur2")
	private List<Socialiser> socialisers2;

	public Utilisateur() {
	}

	public int getID_utilisateur() {
		return this.ID_utilisateur;
	}

	public void setID_utilisateur(int ID_utilisateur) {
		this.ID_utilisateur = ID_utilisateur;
	}

	public String getUtilisateurAdresseComplementaire() {
		return this.utilisateurAdresseComplementaire;
	}

	public void setUtilisateurAdresseComplementaire(String utilisateurAdresseComplementaire) {
		this.utilisateurAdresseComplementaire = utilisateurAdresseComplementaire;
	}

	public String getUtilisateurAdressePostale() {
		return this.utilisateurAdressePostale;
	}

	public void setUtilisateurAdressePostale(String utilisateurAdressePostale) {
		this.utilisateurAdressePostale = utilisateurAdressePostale;
	}

	public int getUtilisateurCodePostal() {
		return this.utilisateurCodePostal;
	}

	public void setUtilisateurCodePostal(int utilisateurCodePostal) {
		this.utilisateurCodePostal = utilisateurCodePostal;
	}

	public Date getUtilisateurDateNaissance() {
		return this.utilisateurDateNaissance;
	}

	public void setUtilisateurDateNaissance(Date utilisateurDateNaissance) {
		this.utilisateurDateNaissance = utilisateurDateNaissance;
	}

	public String getUtilisateurImgProfil() {
		return this.utilisateurImgProfil;
	}

	public void setUtilisateurImgProfil(String utilisateurImgProfil) {
		this.utilisateurImgProfil = utilisateurImgProfil;
	}

	public String getUtilisateurLoisirs() {
		return this.utilisateurLoisirs;
	}

	public void setUtilisateurLoisirs(String utilisateurLoisirs) {
		this.utilisateurLoisirs = utilisateurLoisirs;
	}

	public String getUtilisateurNom() {
		return this.utilisateurNom;
	}

	public void setUtilisateurNom(String utilisateurNom) {
		this.utilisateurNom = utilisateurNom;
	}

	public byte getUtilisateurPossedePermis() {
		return this.utilisateurPossedePermis;
	}

	public void setUtilisateurPossedePermis(byte utilisateurPossedePermis) {
		this.utilisateurPossedePermis = utilisateurPossedePermis;
	}

	public byte getUtilisateurPossedeVehicule() {
		return this.utilisateurPossedeVehicule;
	}

	public void setUtilisateurPossedeVehicule(byte utilisateurPossedeVehicule) {
		this.utilisateurPossedeVehicule = utilisateurPossedeVehicule;
	}

	public String getUtilisateurPrenom() {
		return this.utilisateurPrenom;
	}

	public void setUtilisateurPrenom(String utilisateurPrenom) {
		this.utilisateurPrenom = utilisateurPrenom;
	}

	public byte getUtilisateurSexe() {
		return this.utilisateurSexe;
	}

	public void setUtilisateurSexe(byte utilisateurSexe) {
		this.utilisateurSexe = utilisateurSexe;
	}

	public String getUtilisateurTelephone() {
		return this.utilisateurTelephone;
	}

	public void setUtilisateurTelephone(String utilisateurTelephone) {
		this.utilisateurTelephone = utilisateurTelephone;
	}

	public String getUtilisateurVille() {
		return this.utilisateurVille;
	}

	public void setUtilisateurVille(String utilisateurVille) {
		this.utilisateurVille = utilisateurVille;
	}

	public List<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Etudiant getEtudiant() {
		return this.etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public List<Formation> getFormations() {
		return this.formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	public Formateur getFormateur() {
		return this.formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	public Salarie getSalarie() {
		return this.salarie;
	}

	public void setSalarie(Salarie salarie) {
		this.salarie = salarie;
	}

	public List<Socialiser> getSocialisers1() {
		return this.socialisers1;
	}

	public void setSocialisers1(List<Socialiser> socialisers1) {
		this.socialisers1 = socialisers1;
	}

	public Socialiser addSocialisers1(Socialiser socialisers1) {
		getSocialisers1().add(socialisers1);
		socialisers1.setUtilisateur1(this);

		return socialisers1;
	}

	public Socialiser removeSocialisers1(Socialiser socialisers1) {
		getSocialisers1().remove(socialisers1);
		socialisers1.setUtilisateur1(null);

		return socialisers1;
	}

	public List<Socialiser> getSocialisers2() {
		return this.socialisers2;
	}

	public void setSocialisers2(List<Socialiser> socialisers2) {
		this.socialisers2 = socialisers2;
	}

	public Socialiser addSocialisers2(Socialiser socialisers2) {
		getSocialisers2().add(socialisers2);
		socialisers2.setUtilisateur2(this);

		return socialisers2;
	}

	public Socialiser removeSocialisers2(Socialiser socialisers2) {
		getSocialisers2().remove(socialisers2);
		socialisers2.setUtilisateur2(null);

		return socialisers2;
	}

}