package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="document")
public class Document implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cote;
	private String titre;
	private String description;
	private int nbExemplaireDispo;

	public Document() {
	}

	public Document(String titre, String description, int nbExemplaireDispo) {
		super();
		this.titre = titre;
		this.description = description;
		this.nbExemplaireDispo = nbExemplaireDispo;
	}

	public int getCote() {
		return cote;
	}

	public void setCote(int cote) {
		this.cote = cote;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNbExemplaireDispo() {
		return nbExemplaireDispo;
	}

	public void setNbExemplaireDispo(int nbExemplaireDispo) {
		this.nbExemplaireDispo = nbExemplaireDispo;
	}

}
