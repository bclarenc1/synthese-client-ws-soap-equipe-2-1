
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/main.css">
<title>CRUD périssable</title>
</head>

<body class="pinkbg">

	<h2>CRUD produits périssables</h2>

	<form action="AjouterPerissable" method="GET" id="form-contact" class="container">
		<br/>
		<input type="hidden" name="idProduit" value="${idProduit}" />
		<div class="from-group">
			<label for="nomProduit">Nom du produit</label>
			<input id="nomProduit" type="text" value="${nomProduit}" name="nomProduit" required/>
		</div>
		<div class="from-group">
			<label for="stock">Nombre en stock</label>
			<input id="stock" type="number" value="${stock}" name="stock" required/>
		</div>
		<div class="from-group">
			<label for="prix">Prix unitaire (€)</label>
			<input id="prix" type="number" value="${prix}" name="prix" required/>
		</div>
		<input type="submit" name="ajouter" value="Ajouter"/>
        <button type="reset">Reset</button>
	</form>

	<div class="container">
		<h2>Tous les produits de la BDD</h2>
		<table class="table table-bordered table-sm">
			<thead class=greenrow>
				<tr>
					<th>ID</th>
					<th>Nom</th>
					<th>Stock</th>
					<th>Prix (€)</th>
				</tr>
			</thead>

			<tbody>
				<c:if test="${not empty produits}">
					<c:forEach items="${produits}" var="p">
						<tr>
							<td>${p.idProduit}</td>
							<td>${p.nomProduit}</td>
							<td>${p.stock}</td>
							<td>${p.prix}</td>
							<td><a href="ModifierPerissable?idProduit=${p.idProduit}">modifier</a></td>
							<td><a href="SupprimerPerissable?idProduit=${p.idProduit}">supprimer</a></td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
		<p> Il faudrait créer/appeler une méthode getAllPerissables(), là on a tous les produits donc "Modifier" sur les non périssables renvoie une erreur.</p> 
		<p> "Modifier" ne marche de toute façon pas encore </p>
		<p> Le CSS non plus :(</p>
	</div>

</body>

</html>
