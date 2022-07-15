<%--
  Created by IntelliJ IDEA.
  User: michaeldickens
  Date: 7/14/22
  Time: 9:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Number Guessing Game</title>
</head>
<body>

<form method="POST" action="/guess">
  <h2>Guess a number between 1 and 3: </h2>

  <input type="number" name="guess"/>

  <button>Submit</button>

</form>
</body>
</html>
