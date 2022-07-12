<%--
  Created by IntelliJ IDEA.
  User: michaeldickens
  Date: 7/11/22
  Time: 3:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Pizza Order Page</title>
</head>

<body><h3 Pizza Order Form/>

<form action="/pizza-order" method="POST"></form>

<%--select inputs for crust, sauce, and size--%>
<label for="crust">Choose crust:</label>
<select name="crust" id="crust">
    <option value="hand-tossed-original">Hand tossed original</option>
    <option value="deep-dish">Deep dish</option>
    <option value="crispy-thin">Thin and Crispy</option>
    <option value="cheese-stuffed">Cheese stuffed</option>
</select>

<label for="sauce">Choose sauce:</label>

<select name="crust" id="sauce">
    <option value="Original">Original</option>
    <option value="Spicy">Spicy</option>
    <option value="BBQ">BBQ</option>
    <option value="No sauce">No sauce</option>
</select>

<label for="crust">Choose crust:</label>

<select name="size" id="size">
    <option value="Personal">Personal</option>
    <option value="Medium">Medium</option>
    <option value="Large">Large</option>
    <option value="Pizzageddon">Pizzageddon</option>
</select>
<%--check box for toppings--%>
<input type="checkbox" id="topping1" name="topping1" value="Pepperoni">
<label for="topping1"> Pepperoni</label><br>
<input type="checkbox" id="topping2" name="topping2" value="Beef">
<label for="topping2"> Beef</label><br>
<input type="checkbox" id="topping3" name="topping3" value="Sausage">
<label for="topping3"> Sausage</label><br>
<input type="checkbox" id="topping4" name="topping4" value="Anchovies">
<label for="topping4"> Anchovies</label><br>
<input type="checkbox" id="topping5" name="topping5" value="Jalapenos">
<label for="topping5"> Jalapenos</label><br>
<input type="checkbox" id="topping6" name="topping6" value="Pineapple">
<label for="topping6"> Pineapple</label><br>

<%--input for address--%>
<label for="address">Delivery Address</label>
<br>
<input id="address" type="text" name="address" placeholder="Enter delivery address:">
<button>Submit</button>

</body>
</html>
