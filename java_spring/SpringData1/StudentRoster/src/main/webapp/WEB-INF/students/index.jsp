<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students</title>

<!-- BootStrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<!-- BootStrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>


</head>
<body>
	<div class="container-fluid">
		<h1>All Students</h1>
		<a href="/students/new">Add Student</a>
		<a href="/contacts/new">Add Contact</a>
		<a href="/dorms/new">Add Dorm</a>
		<a href="/courses/new">Add Course</a>
		
		<table class="table mt-5">
			<thead>
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Age</th>
					<th scope="col">Address</th>
					<th scope="col">City</th>
					<th scope="col">State</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${students}" var="student">
					<tr>
						<td><a href="/students/${student.id}"><c:out value="${student.first_name} ${student.last_name}" /></a></td>
						<td><c:out value="${student.age}" /></td>
						<td><c:out value="${student.contact.address}" /></td>
						<td><c:out value="${student.contact.city}" /></td>
						<td><c:out value="${student.contact.state}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>


	</div>
</body>
</html>