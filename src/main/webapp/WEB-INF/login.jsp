<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<c:if test="${not empty status}">
   <c:out value="${status}"/>
</c:if>
<h2 style="color: red">User Login Form</h2>
<table bgcolor="blue">
<form:form modelAttribute="usercmd" action="token/generate-token">
   <tr bgcolor="yellow"><td>user Name:: </td><td><form:input path="username"/></td></tr>
  <tr bgcolor="yellow"><td>password:: </td><td><form:input path="password"/></td></tr>
  <tr bgcolor="yellow"><td colspan="2"><input type="submit" value="Login"></td></tr>
</form:form>
</table>