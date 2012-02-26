<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="person" scope="request" type="me.benpaddock.addressbook.model.Person"/>
<html>
  <head>
    <title>Person</title>
    </head>
  <body>
    <h1>Person</h1>
    <p><%=person.getFirstName() %></p>
    <p><%=person.getLastName() %></p>
  </body>
</html>