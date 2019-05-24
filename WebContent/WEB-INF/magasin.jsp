
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/main.css">
<title>CRUD magasin</title>
</head>

<body>

	<h2>CRUD magasins</h2>

	<form action="AjouterMagasin" method="GET" id="form-contact" class="container">
		<br/>
		<input type="hidden" name="idMagasin" value="${idMagasin}" />
		<div class="from-group">
			<label for="nomMagasin">Nom du magasin</label>
			<input id="nomMagasin" type="text" value="${nomMagasin}" name="nomMagasin" required/>
		</div>
		<div class="from-group">
			<label for="codeMagasin">Code du magasin</label>
			<input id="codeMagasin" type="number" value="${codeMagasin}" name="codeMagasin" required/>
		</div>
		<div class="from-group">
			<label for="prixLocal">prixLocal</label>
			<input id="prixLocal" type="number" value="${prixLocal}" name="prixLocal" required/>
		</div>
		<input type="submit" name="ajouter" value="Ajouter"/>
        <button type="reset">Reset</button>
	</form>

	<div class="container">
		<h2>Tous les magasins</h2>
		<table class="table table-bordered table-sm">
			<thead class=greenrow>
				<tr>
					<th>ID</th>
					<th>Nom</th>
					<th>Code</th>
					<th>Prix Local (€)</th>
				</tr>
			</thead>

			<tbody>
				<c:if test="${not empty magasins}">
					<c:forEach items="${magasins}" var="m">
						<tr>
							<td>${m.idMagasin}</td>
							<td>${m.nomMagasin}</td>
							<td>${m.codeMagasin}</td>
							<td>${m.prixLocal}</td>
							<td><a href="ModifierMagasin?idMagasin=${m.idMagasin}">modifier</a></td>
							<td><a href="SupprimerMagasin?idMagasin=${m.idMagasin}">supprimer</a></td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</div>

</body>

</html>
