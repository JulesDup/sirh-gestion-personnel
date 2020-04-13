<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="dev.sgp.util.Constantes"%>
<%@page import="java.util.List"%>

<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-4.4.1-
dist/css/bootstrap.css"
>
</head>
<body>
</head>
<body class="bg-light">
	<div class="container-fluid">

		<div class="row">
			<h1 class="display-4">Les collaborateurs</h1>
		</div>

		<div class="row form-group">
			<div class="container-fluid">

				<div class="row">
					<div class="col-3">
						<label for="recherche_id" class="float-right">Rechercher un nom ou
							un prénom qui commence par : </label>
					</div>
					<div class="col-2">
						<input type="text" class="form-control" name="recherche" id="recherche_id">
					</div>
					<div class="col-2">
						<input class="btn btn-outline-dark" type="submit" name="Rechercher"
							id="boouton_rechercher_id" value="Rechercher"
						>
					</div>
					<div class="col">
						<input type="checkbox" class="form-check-input" id="check"> <label
							class="form-check-label" for="check"
						>Collaborateurs désactivés</label>
					</div>
				</div>

				<div class="row mt-3">
					<div class="col-3">
						<label for="departement_select_id" class="float-right">Filtrer par
							département : </label>
					</div>
					<div class="col-2">
						<select class="form-control" id="departement_select_id">
							<option>Comptabilité</option>
							<option>Ressources Humaines</option>
							<option>Informatique</option>
						</select>
					</div>
				</div>

			</div>
		</div>

		<div class="row">
			<a href="<%=request.getContextPath()%>/collaborateurs/nouveau"
				class="btn btn-outline-dark mt-3 ml-3"
			>Créer</a>
		</div>

		<div class="row">

			<%
				for (Collaborateur collab : Constantes.COLLAB_SERVICE.listerCollaborateurs()) {
			%>

			<div class="card m-2">
				<div class="card-body">
					<h4 class="card-title"><%=collab.getNom() + " " + collab.getPrenom()%></h4>
					<div class="row">
						<div class="col-4">
							<img src="https://www.thispersondoesnotexist.com/image"
								class="img-thumbnail" style="width: 200px; height: 200px;"
								alt="photo de profil"
							>
						</div>
						<div class="col-8">
							<div class="row">
								<div class="col-6">Matricule :</div>
								<div class="col-6">
									<%=collab.getMatricule()%>
								</div>
							</div>
							<div class="row">
								<div class="col-6">Numéro de sécurité sociale :</div>
								<div class="col-6">
									<%=collab.getNumeroDeSecu()%>
								</div>
							</div>
							<div class="row">
								<div class="col-6">Email :</div>
								<div class="col-6">
									<%=collab.getEmailPro()%>
								</div>
							</div>
							<div class="row">
								<div class="col-6">Date de naissance :</div>
								<div class="col-6">
									<%=collab.getDateDeNaissance()%>
								</div>
							</div>

						</div>
						<div class="col-12">
							<input class="btn btn-outline-dark float-right" type="submit"
								name="Editer" value="Editer"
							>
						</div>

					</div>
				</div>
			</div>

			<%
				}
			%>

		</div>

	</div>
</body>


</html>