package dev.sgp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

/**
 * Servlet implementation class EditerCollaborateurController
 */
public class EditerCollaborateurController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// recupere la valeur d'un parametre dont le nom est avecPhoto
		String matricule = req.getParameter("matricule");

		if (matricule == null) {
			resp.setStatus(400);
			resp.getWriter().write("<h1>Edition de collaborateur</h1>" + "<ul>"
					+ "<li>matricule= Le matricule est absent</li>" + "</ul>");
		} else {

			resp.setStatus(200);
			// code HTML ecrit dans le corps de la reponse
			resp.getWriter().write(
					"<h1>Edition de collaborateur</h1>" + "<ul>" + "<li>matricule=" + matricule + "</li>" + "</ul>");
			resp.setContentType("text/html");
		}
		resp.setContentType("text/html");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");

//		Si parametre non présent ajouts dans la liste 
		List<String> parametreManquant = new ArrayList<String>();
		if (matricule == null || matricule.isEmpty())
			parametreManquant.add("matricule");
		if (titre == null || titre.isEmpty())
			parametreManquant.add("titre");
		if (nom == null || nom.isEmpty())
			parametreManquant.add("nom");
		if (prenom == null || prenom.isEmpty())
			parametreManquant.add("prenom");

		if (parametreManquant.isEmpty()) {
			// si on a pas d'erreur
			resp.setStatus(201);
			resp.getWriter().write("Creation d’un collaborateur avec les informations suivantes :");
			resp.getWriter()
					.write("matricule=" + matricule + ", titre=" + titre + ", nom=" + nom + ", prenom=" + prenom);

		} else {
			resp.setStatus(201);
			resp.getWriter().write("Creation d’un collaborateur avec les informations suivantes :");
			resp.getWriter().write("Les paramètres suivants sont incorrects :");
			for (String courant : parametreManquant) {
				resp.getWriter().write("_" + courant);
			}

		}
	}

}
