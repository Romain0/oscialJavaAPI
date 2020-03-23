package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the message database table.
 * 
 */
@Entity
@Table(name="message")
@NamedQuery(name="Message.findAll", query="SELECT m FROM Message m")
public class Message implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID_message;

	@Lob
	@Column(name="message_contenu")
	private String messageContenu;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="message_date_envoi")
	private Date messageDateEnvoi;

	//bi-directional many-to-many association to Utilisateur
	@ManyToMany(mappedBy="messages")
	private List<Utilisateur> utilisateurs;

	//bi-directional many-to-one association to Tchat
	@ManyToOne
	@JoinColumn(name="ID_tchat")
	private Tchat tchat;

	public Message() {
	}

	public int getID_message() {
		return this.ID_message;
	}

	public void setID_message(int ID_message) {
		this.ID_message = ID_message;
	}

	public String getMessageContenu() {
		return this.messageContenu;
	}

	public void setMessageContenu(String messageContenu) {
		this.messageContenu = messageContenu;
	}

	public Date getMessageDateEnvoi() {
		return this.messageDateEnvoi;
	}

	public void setMessageDateEnvoi(Date messageDateEnvoi) {
		this.messageDateEnvoi = messageDateEnvoi;
	}

	public List<Utilisateur> getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public Tchat getTchat() {
		return this.tchat;
	}

	public void setTchat(Tchat tchat) {
		this.tchat = tchat;
	}

}