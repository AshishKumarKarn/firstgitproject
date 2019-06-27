<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<title>Spring Security</title>
</head>
<body>
<h1> All Employees in System</h1>
<table border="1">
<tr>
<th>Employee ID</th>
<th>First Name</th>
<th>Last Name</th>
</tr>
<c:forEach items="${employees}" var="employee">
<tr>
<td>${employee.id}</td>
<td>${employee.firstName}</td>
<td>${employee.lastName}</td>
</tr>

</c:forEach>
</table>
Click <a href="./logout">here</a> to logout.

</body>

</html>
