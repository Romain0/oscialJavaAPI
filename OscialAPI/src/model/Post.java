package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the post database table.
 * 
 */
@Entity
@Table(name="post")
@NamedQuery(name="Post.findAll", query="SELECT p FROM Post p")
public class Post implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID_post;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="post_date_creation")
	private Date postDateCreation;

	@Lob
	@Column(name="post_description")
	private String postDescription;

	@Column(name="post_img")
	private String postImg;

	@Column(name="post_titre")
	private String postTitre;

	//bi-directional one-to-one association to Evenement
	@OneToOne(mappedBy="post")
	private Evenement evenement;

	//bi-directional one-to-one association to Offre
	@OneToOne(mappedBy="post")
	private Offre offre;

	public Post() {
	}

	public int getID_post() {
		return this.ID_post;
	}

	public void setID_post(int ID_post) {
		this.ID_post = ID_post;
	}

	public Date getPostDateCreation() {
		return this.postDateCreation;
	}

	public void setPostDateCreation(Date postDateCreation) {
		this.postDateCreation = postDateCreation;
	}

	public String getPostDescription() {
		return this.postDescription;
	}

	public void setPostDescription(String postDescription) {
		this.postDescription = postDescription;
	}

	public String getPostImg() {
		return this.postImg;
	}

	public void setPostImg(String postImg) {
		this.postImg = postImg;
	}

	public String getPostTitre() {
		return this.postTitre;
	}

	public void setPostTitre(String postTitre) {
		this.postTitre = postTitre;
	}

	public Evenement getEvenement() {
		return this.evenement;
	}

	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
	}

	public Offre getOffre() {
		return this.offre;
	}

	public void setOffre(Offre offre) {
		this.offre = offre;
	}

}