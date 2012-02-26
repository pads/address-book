<html>
  <head>
    <title>Create Person</title>
    </head>
  <body>
    <h1>Create Person</h1>
    <form method="POST" action="createPerson">
        <table>
            <tr>
                <td>First Name:</td>
                <td><input name="firstName"/></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><input name="lastName"/></td>
            </tr>
            <tr>
                <td colspan="3">
                    <input type="submit" value="Create Person"/>
                </td>
            </tr>
        </table>
    </form>
    <a href="${pageContext.request.contextPath}">home</a>
  </body>
</html>