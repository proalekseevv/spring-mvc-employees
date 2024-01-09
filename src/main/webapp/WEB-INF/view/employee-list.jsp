<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>All employees</h2>
<br>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Salary</th>
        <th>Department</th>
        <th>Options</th>
    </tr>
    <c:forEach var="employee" items="${employees}">
        <tr>
            <td>${employee.name}</td>
            <td>${employee.salary}</td>
            <td>${employee.department}</td>
            <td>
                <input type="button" value="View"
                onclick="window.location.href = '/${employee.id}'">
                <input type="button" value="Update"
                       onclick="window.location.href = '/update/${employee.id}'">
                <form action="/delete/${employee.id}" method="post">
                    <button type="submit">Delete</button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="Add"
       onclick="window.location.href = '/new'"/>
</body>
</html>
