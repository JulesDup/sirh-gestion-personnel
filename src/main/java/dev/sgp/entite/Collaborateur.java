package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
	String matricule;
	String nom;
	String prenom;
	String dateDeNaissance;
	String Adresse;
	String numeroDeSecu;
	String emailPro;
	String photo;
	ZonedDateTime dateHeureCreation;
	Boolean actif;

	/**
	 * Constructeur
	 * 
	 * @param matricule
	 * @param nom
	 * @param prenom
	 * @param dateDeNaissance
	 * @param adresse
	 * @param numeroDeSecu
	 * @param emailPro
	 * @param photo
	 * @param dateHeureCreation
	 * @param actif
	 */
	public Collaborateur(String matricule, String nom, String prenom, String dateDeNaissance, String adresse,
			String numeroDeSecu, String emailPro, String photo, ZonedDateTime dateHeureCreation, Boolean actif) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.Adresse = adresse;
		this.numeroDeSecu = numeroDeSecu;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
	}

	/**
	 * Constructeur pour test avec moins de paramettre
	 * 
	 * @param matricule
	 * @param nom
	 * @param prenom
	 */
	public Collaborateur(String matricule, String nom, String prenom, String dateDeNaissance, String adresse) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.Adresse = adresse;
	}

	/**
	 * Getter
	 * 
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter
	 * 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Getter
	 * 
	 * @return the dateDeNaissance
	 */
	public String getDateDeNaissance() {
		return dateDeNaissance;
	}

	/**
	 * Getter
	 * 
	 * @return the adresse
	 */
	public String getAdresse() {
		return Adresse;
	}

	/**
	 * Getter
	 * 
	 * @return the numeroDeSecu
	 */
	public String getNumeroDeSecu() {
		return numeroDeSecu;
	}

	/**
	 * Getter
	 * 
	 * @return the emailPro
	 */
	public String getEmailPro() {
		return emailPro;
	}

	/**
	 * Getter
	 * 
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * Getter
	 * 
	 * @return the dateHeureCreation
	 */
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	/**
	 * Getter
	 * 
	 * @return the actif
	 */
	public Boolean getActif() {
		return actif;
	}

	/**
	 * Setter
	 * 
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Setter
	 * 
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Setter
	 * 
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	/**
	 * Setter
	 * 
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	/**
	 * Setter
	 * 
	 * @param numeroDeSecu the numeroDeSecu to set
	 */
	public void setNumeroDeSecu(String numeroDeSecu) {
		this.numeroDeSecu = numeroDeSecu;
	}

	/**
	 * Setter
	 * 
	 * @param emailPro the emailPro to set
	 */
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	/**
	 * Setter
	 * 
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * Setter
	 * 
	 * @param dateHeureCreation the dateHeureCreation to set
	 */
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	/**
	 * Setter
	 * 
	 * @param actif the actif to set
	 */
	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	@Override
	public String toString() {
		return "Collaborateur [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance="
				+ dateDeNaissance + ", Adresse=" + Adresse + ", numeroDeSecu=" + numeroDeSecu + ", emailPro=" + emailPro
				+ ", photo=" + photo + ", dateHeureCreation=" + dateHeureCreation + ", actif=" + actif + "]";
	}

}
