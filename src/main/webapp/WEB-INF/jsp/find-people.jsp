<html>
  <head>
    <title>Find People</title>
    </head>
  <body>
    <h1>Find People</h1>
    <form method="POST" action="getPeople">
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
                    <input type="submit" value="Find People"/>
                </td>
            </tr>
        </table>
    </form>
    <a href="${pageContext.request.contextPath}">home</a>
  </body>
</html>