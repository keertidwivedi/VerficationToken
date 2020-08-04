<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h2 style="color: red">User Registration Form</h2>
<table bgcolor="blue">

<form:form modelAttribute="usercmd">
 <tr bgcolor="yellow"><td>first Name:: </td><td><form:input path="firstName"/></td></tr>
  <tr bgcolor="yellow"><td>last Name:: </td><td><form:input path="lastName"/></td></tr>
  <tr bgcolor="yellow"><td>user Name:: </td><td><form:input path="username"/></td></tr>
  <tr bgcolor="yellow"><td>password:: </td><td><form:input path="password"/></td></tr>
  <tr bgcolor="yellow"><td>age:: </td><td><form:input path="age"/></td></tr>
  <tr bgcolor="yellow"><td>salary:: </td><td><form:input path="salary"/></td></tr>
 <tr bgcolor="yellow"><td colspan="2"><input type="submit" value="Register"></td></tr>
</form:form>
</table>