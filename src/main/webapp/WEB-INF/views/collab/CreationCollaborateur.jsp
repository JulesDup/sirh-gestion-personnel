<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Creation d'un collaborateur</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-4.4.1-
dist/css/bootstrap.css"
>
</head>
<body>
	<%
		Map<String, String> mapErreur = new HashMap<String, String>();
		boolean isErreur = request.getAttribute("isErreur") != null;
		if (isErreur) {
			mapErreur = (Map<String, String>) request.getAttribute("mapErreur");
		}
	%>
	<div class="container">
		<div class="row">
			<h1 class="offset-1 offset-sm-1 offset-md-1 offset-lg-1">Nouveau
				Collaborateur</h1>
		</div>
		</br>
		<form method="post">
			<div class="form-group row">
				<label for="nom"
					class="offset-1 offset-sm-1 offset-md-1 offset-lg-1 col-sm-5 col-md-4 col-lg-3 col-form-label"
				>Nom</label>
				<div class="offset-1 col-sm-5">
					<input type="text" name="nom" id="nom"
						value="<%=mapErreur.getOrDefault("nom", "")%>"
					/>
					<%
						if (isErreur && mapErreur.get("nom") == "") {
					%>
					<%="<small id='nom_id' class='form-text text-danger'>Le nom doit être renseigné.</small>"%>
					<%
						}
					%>
				</div>
			</div>
			</br>
			<div class="form-group row">
				<label for="prenom"
					class="offset-1 offset-sm-1 offset-md-1 offset-lg-1 col-sm-5 col-md-4 col-lg-3 col-form-label"
				>Prenom</label>
				<div class="offset-1 col-sm-5">
					<input type="text" name="prenom" id="prenom"
						value="<%=mapErreur.getOrDefault("prenom", "")%>"
					/>
					<%
						if (isErreur && mapErreur.get("prenom") == "") {
					%>
					<%="<small id='nom_id' class='form-text text-danger'>Le prenom n'a pas été renseigné.</small>"%>
					<%
						}
					%>
				</div>
			</div>
			</br>
			<div class="form-group row">
				<label for="dateNaissance"
					class="offset-1 offset-sm-1 offset-md-1 offset-lg-1 col-sm-5 col-md-4 col-lg-3 col-form-label"
				>Date de naissance</label>
				<div class="offset-1 col-sm-5">
					<input type="date" name="dateNaissance" id="dateNaissance"
						value="<%=mapErreur.getOrDefault("naissance", "")%>"
					/>
					<%
						if (isErreur && mapErreur.get("dateNaissance") == "") {
					%>
					<%="<small id='dateNaissance' class='form-text text-danger'>La date de naissance n'a pas été renseigné.</small>"%>
					<%
						}
					%>
				</div>
			</div>
			</br>
			<div class="form-group row">
				<label for="adresse"
					class="offset-1 offset-sm-1 offset-md-1 offset-lg-1 col-sm-5 col-md-4 col-lg-3 col-form-label"
				>Adresse</label>
				<div class="offset-1 col-sm-5">
					<textarea name="adresse" id="adresse" rows="3" cols="19"><%=mapErreur.getOrDefault("adresse", "")%></textarea>
					<%
						if (isErreur && mapErreur.get("adresse") == "") {
					%>
					<%="<small id='adresse' class='form-text text-danger'>L'adresse doit être renseigné.</small>"%>
					<%
						}
					%>
				</div>
			</div>
			<div class="form-group row">
				<label for="adresse"
					class="offset-1 offset-sm-1 offset-md-1 offset-lg-1 col-sm-5 col-md-4 col-lg-3 col-form-label"
				>N° de Sécurité social</label>
				<div class="offset-1 col-sm-5">
					<input type="text" name="numSecu" id="numSecu" />
					<%
						if (isErreur && (mapErreur.get("secu") == null || mapErreur.get("secu").length() != 15
								|| !mapErreur.get("secu").matches("\\d*"))) {
					%>
					<%="<small id='numSecu' class='form-text text-danger'>Le numéro de sécurité sociale doit être compsosé de 15 chiffres</small>"%>
					<%
						}
					%>
				</div>
			</div>
			</br> <input
				class="offset-4 offset-sm-9 offset-md-7 offset-lg-7 col-2 col-sm-2 col-lg-1"
				type="submit" value="Creer"
			/>
		</form>
	</div>
</body>
</html>