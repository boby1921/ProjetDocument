package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "document")
public class Document implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cote;
	private String titre;
	private String description;
	private int nbExemplaireDispo;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "idLocalisation", unique = true, nullable = true)
	private Localisation localisation;
	@ManyToOne
	@JoinColumn(name = "idAuteur")
	private Auteur auteur;
	@ManyToMany
	@JoinTable(name="doc_theme", 
			joinColumns = @JoinColumn(name="idDocument"),
			inverseJoinColumns = @JoinColumn(name="idTheme")
	)
	private List<Theme> themes;

	public Document() {
	}

	public Document(String titre, String description, int nbExemplaireDispo) {
		super();
		this.titre = titre;
		this.description = description;
		this.nbExemplaireDispo = nbExemplaireDispo;
	}

	public Document(String titre, String description, int nbExemplaireDispo, Localisation localisation, Auteur auteur) {
		super();
		this.titre = titre;
		this.description = description;
		this.nbExemplaireDispo = nbExemplaireDispo;
		this.localisation = localisation;
		this.auteur = auteur;
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

	public Localisation getLocalisation() {
		return localisation;
	}

	public void setLocalisation(Localisation localisation) {
		this.localisation = localisation;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

}
