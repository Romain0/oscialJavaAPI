package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the socialiser database table.
 * 
 */
@Embeddable
public class SocialiserPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int ID_utilisateur_1;

	@Column(insertable=false, updatable=false)
	private int ID_utilisateur_2;

	public SocialiserPK() {
	}
	public int getID_utilisateur_1() {
		return this.ID_utilisateur_1;
	}
	public void setID_utilisateur_1(int ID_utilisateur_1) {
		this.ID_utilisateur_1 = ID_utilisateur_1;
	}
	public int getID_utilisateur_2() {
		return this.ID_utilisateur_2;
	}
	public void setID_utilisateur_2(int ID_utilisateur_2) {
		this.ID_utilisateur_2 = ID_utilisateur_2;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SocialiserPK)) {
			return false;
		}
		SocialiserPK castOther = (SocialiserPK)other;
		return 
			(this.ID_utilisateur_1 == castOther.ID_utilisateur_1)
			&& (this.ID_utilisateur_2 == castOther.ID_utilisateur_2);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ID_utilisateur_1;
		hash = hash * prime + this.ID_utilisateur_2;
		
		return hash;
	}
}