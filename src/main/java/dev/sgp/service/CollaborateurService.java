package dev.sgp.service;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;

public class CollaborateurService {
	List<Collaborateur> listeCollaborateurs = new ArrayList<>();
	
	
	
	
	
	public List<Collaborateur> listDeCollaborateurService() {
//		Collaborateur collab1 = new Collaborateur("123456", "Gulle", "julien");
//		Collaborateur collab2 = new Collaborateur("1234562", "Gulle2", "julien2");
//		Collaborateur collab3 = new Collaborateur("1234562", "Gulle2", "julien2");
//		listeCollaborateurs.add(collab1);
//		listeCollaborateurs.add(collab2);
//		listeCollaborateurs.add(collab3);
		
		return listeCollaborateurs; 
	}
	

	/**
	 * listerCollaborateurs
	 * 
	 * @return la liste des collaborateurs
	 */
	public List<Collaborateur> listerCollaborateurs() {


		return listeCollaborateurs;
	}

	public void sauvegarderCollaborateur(Collaborateur collab) {
		listeCollaborateurs.add(collab);
	}
}
