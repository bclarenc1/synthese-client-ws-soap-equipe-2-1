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
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Nom</th>
				<th>Prénom</th>
				<th>Âge</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${personnes}" var="pers">
				<tr>
					<td>${pers.id}</td>
					<td>${pers.nom}</td>
					<td>${pers.prenom}</td>
					<td>${pers.age}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>

</html>
