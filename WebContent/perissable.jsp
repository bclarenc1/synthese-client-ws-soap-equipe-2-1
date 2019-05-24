<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page title \o/</title>
</head>

<body> 
	<h2>CRUD Produits Non Périssables</h2>

	<form action="GestionPerissables" method="GET" id="form-contact" class="container">
		<table>
			<input type="hidden" name="idProduit" value="${idProduit}" />
			<div class="from-group">
				<label for="nomProduit">Nom du Produit </label> <input id="prenom"
					type="text" placeholder="Nom du Produit" value="${nomProduit}"
					name="nomProduit" required />
			</div>
			<div class="from-group">
				<label for="stock">Nombre en Stock</label> <input id="stock"
					type="number" value="${stock}" name="stock" required />
			</div>
			<div class="from-group">
				<label for="prix">Prix unitaire </label> <input id="prix"
					type="number" value="${prix}" name="prix" required />
			</div>
			<div class="from-group">
				<label for="nom">Date limite de consomation</label> <input
					id="dateLimiteUtilisation" type="text"
					value="${dateLimiteUtilisation}" name="dateLimiteUtilisation"
					required />
			</div>
		</table>
	</form>
</body>

</tbody>
</table>
</body>

</html>