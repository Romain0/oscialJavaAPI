package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tchat database table.
 * 
 */
@Entity
@Table(name="tchat")
@NamedQuery(name="Tchat.findAll", query="SELECT t FROM Tchat t")
public class Tchat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID_tchat;

	@Column(name="tchat_titre")
	private String tchatTitre;

	//bi-directional many-to-one association to Covoiturage
	@OneToMany(mappedBy="tchat")
	private List<Covoiturage> covoiturages;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="tchat")
	private List<Message> messages;

	public Tchat() {
	}

	public int getID_tchat() {
		return this.ID_tchat;
	}

	public void setID_tchat(int ID_tchat) {
		this.ID_tchat = ID_tchat;
	}

	public String getTchatTitre() {
		return this.tchatTitre;
	}

	public void setTchatTitre(String tchatTitre) {
		this.tchatTitre = tchatTitre;
	}

	public List<Covoiturage> getCovoiturages() {
		return this.covoiturages;
	}

	public void setCovoiturages(List<Covoiturage> covoiturages) {
		this.covoiturages = covoiturages;
	}

	public Covoiturage addCovoiturage(Covoiturage covoiturage) {
		getCovoiturages().add(covoiturage);
		covoiturage.setTchat(this);

		return covoiturage;
	}

	public Covoiturage removeCovoiturage(Covoiturage covoiturage) {
		getCovoiturages().remove(covoiturage);
		covoiturage.setTchat(null);

		return covoiturage;
	}

	public List<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Message addMessage(Message message) {
		getMessages().add(message);
		message.setTchat(this);

		return message;
	}

	public Message removeMessage(Message message) {
		getMessages().remove(message);
		message.setTchat(null);

		return message;
	}

}