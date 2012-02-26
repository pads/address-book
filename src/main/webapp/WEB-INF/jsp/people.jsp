<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <head>
    <title>People</title>
    </head>
  <body>
    <h1>People</h1>
    <table>
      <c:forEach var="person" items="${people}">
        <tr>
            <td>${person.id}</td>
            <td>${person.firstName}</td>
            <td>${person.lastName}</td>
        </tr>
      </c:forEach>
    </table>
    <a href="${pageContext.request.contextPath}">home</a>
  </body>
</html>