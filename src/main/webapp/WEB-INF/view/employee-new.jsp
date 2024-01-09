<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Employee</h2>
<br>
<form:form action="/" method="post" modelAttribute="employee">
    <form:hidden path="id"/>
Name:
    <form:input path="name"/>
    <form:errors path="name"/>
<br><br>
Surname:
    <form:input path="surname"/>
    <form:errors path="surname"/>
<br><br>
Age:
    <form:input path="age"/>
    <form:errors path="age"/>
<br><br>
Salary:
    <form:input path="salary"/>
    <form:errors path="salary"/>
<br><br>
Department:
    <form:input path="department"/>
    <form:errors path="department"/>
<br><br>
<button type="submit">Submit</button>
</form:form>
</html>
