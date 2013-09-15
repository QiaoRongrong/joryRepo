<!DOCTYPE html> 

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html lang="en">
<body>

<h2>Hello World!</h2>

<div id="Content">
  <h2>222 Welcome to fruit store. Please enjoy!</h2>

  <p><a href="goLogin">Login</a></p>
  
  <p><a href="<spring:url value="/account/login" htmlEscape="true" />">
  		Login using spring url tag</a></p>

  <p><sub>Copyright fruit store </sub></p>

</div>


</body>
</html>
