<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${msg}
<center>
<h1>Welcome to My First Spring Boot App</h1>

<table>

<form method="post" action="saveuser">
<tr><td>
	Userid <input type="number" name="id"/>
		</td></tr>
<tr><td>
	Password <input type="text" name="pass"/>
	</td></tr>
<tr><td>
<tr><td>
	Name <input type="text" name="name"/>
	</td></tr>
<tr><td>
<tr><td>
	Address <input type="text" name="address"/>
	</td></tr>
<tr><td>
<tr><td>
	City <input type="text" name="city"/>
	</td></tr>
<tr><td>
	<input type="submit" value="submit"/>
</td></tr>

</form>
</table>

<a href="/go">Click Here</a>
</center>



</body>
</html>