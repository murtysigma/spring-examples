<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<form action="saveStudent">
		<table border="1">
			<tr>
				<td>Student ID :</td>
				<td><input name="stu_id" /></td>
			</tr>
			<tr>
				<td>Student First Name :</td>
				<td><input name="first_name" /></td>
			</tr>
			<tr>
				<td>Student Last Name :</td>
				<td><input name="last_name" /></td>
			</tr>
			<tr>
				<td>Student Date Of Joining :</td>
				<td><input name="date_of_joining" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>