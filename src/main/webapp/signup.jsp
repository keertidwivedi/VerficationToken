<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h2 style="color: red">User Registration Form</h2>
<table border="blue">

<form:form modelAttribute="usercmd">
 <tr bgcolor="yellow"><td>first Name:: </td><td><form:input path="firstName"/></td></tr><br>
  <tr bgcolor="yellow"><td>last Name:: </td><td><form:input path="lastName"/></td></tr><br>
  <tr bgcolor="yellow"><td>user Name:: </td><td><form:input path="username"/></td></tr><br>
  <tr bgcolor="yellow"><td>password:: </td><td><form:input path="password"/></td></tr><br>
  <tr bgcolor="yellow"><td>age:: </td><td><form:input path="age"/></td></tr><br>
  <tr bgcolor="yellow"><td>salary:: </td><td><form:input path="salary"/></td></tr><br>
 <tr bgcolor="yellow"><td colspan="2"><input type="submit" value="Register"></td></tr><br>
</form:form>
</table>