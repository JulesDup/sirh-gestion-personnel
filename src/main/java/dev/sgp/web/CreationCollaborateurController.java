package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.util.Constantes;

public class CreationCollaborateurController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/CreationCollaborateur.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Map<String, String> mapErreur = new HashMap<String, String>();
		Boolean isErreur = false;
		String numSecu = req.getParameter("numSecu");
//Verificaiton des parametres passé dans la requête
		List<String> params = Arrays.asList("nom", "prenom", "dateNaissance", "adresse", "numSecu");
		for (String courant : params) {
			if (req.getParameter(courant) == null || req.getParameter(courant).isEmpty()
					|| req.getParameter(courant) == "") {
				mapErreur.put(courant, "");
				isErreur = true;

			} else {
				mapErreur.put(courant, req.getParameter(courant));
			}
		}

		// Si IsError => retourne Bad Request Sinon création du collaborateur
		if (isErreur || numSecu == null || numSecu.length() != 15 || !numSecu.matches("\\d*")) {
			req.setAttribute("isErreur", true);
			req.setAttribute("mapErreur", mapErreur);
			resp.setStatus(400);
			req.getRequestDispatcher("/WEB-INF/views/collab/CreationCollaborateur.jsp").forward(req, resp);
		} else {

//			 Création du collaborateur (on réutilise la mapErreur
			String matricule = Double.toString(Math.random());
			String photo = "photo coucou";
//			TODO CREATION DU MAIL A PARTIR DU NOM ET PR2NOM DU COLLAB!!
			String email = mapErreur.get("nom").toLowerCase() + "." + mapErreur.get("prenom").toLowerCase()
					+ "@societe.com";
			Constantes.COLLAB_SERVICE.sauvegarderCollaborateur(new Collaborateur(matricule, mapErreur.get("nom"),
					mapErreur.get("prenom"), mapErreur.get("naissance"), mapErreur.get("adresse"), numSecu, email,
					photo, ZonedDateTime.now(), true));

			resp.sendRedirect(req.getContextPath() + "/collaborateurs/lister");
		}

	}

}