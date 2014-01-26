<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
<%@ include file ="/resources/css/student.css" %> 
</style>

<title>Book Management</title>
</head>
<body>

	<script>
		
	<%@include file="/resources/js/student.js" %></script>
	<p>Click the button to display a random number.</p>

	<button onmouseover="mouseover();" onclick="myAlert();">Try
		it</button>
	<div id="more">
		more</div>
		<div id="less">less
		</div>
	
	<h1 id="headline" style="text-align: center;" style="color: red;">Books</h1>
	<hr/>
 <form:form action="login" commandName="name">
    go to login: <input type="text" name="log"> <input type="submit" value="login">
  
 
	</form:form>
  <form:form action="hi" commandName="message">
    Name: <input type="text" name="name"> <input type="submit" value="Submit">
  
 
	</form:form> <br> <h6>message: <c:out value="${message}" ></c:out>
	${student.number}</h6>
	<form:form action="student.do" method="POST" commandName="student">
		<table>
			<tr>
				<td>Book ID</td>
				<td><form:input path="bookID" /></td>
			</tr>
			<tr>
				<td>First name</td>
				<td><form:input path="firstname" /></td>
			</tr>
			<tr>
				<td>Last name</td>
				<td><form:input path="lastname" /></td>
			</tr>
			<tr>
				<td>Year Level</td>
				<td><form:input path="yearLevel" /></td>
			</tr>
			<tr>
				<td>Book Title</td>
				<td><form:input path="title" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="action" value="Add" />
					<input type="submit" name="action" value="Edit" /> <input
					type="submit" name="action" value="Delete" /> <input type="submit"
					name="action" value="Search" /></td>
			</tr>
		</table>
	</form:form>
	<br>
	<table border="1">
		<th>ID</th>
		<th>First name</th>
		<th>Last name</th>
		<th>Year level</th>
		<th>Book title</th>
		<th>Number</th>
		<c:forEach items="${studentList}" var="student">
			<tr>
				<td>${student.bookID}</td>
				<td>${student.firstname}</td>
				<td>${student.lastname}</td>
				<td>${student.yearLevel}</td>
				<td>${student.title}</td>
				<td>${student.number}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>