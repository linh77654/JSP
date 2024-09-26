<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 9/25/2024
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h2>Product Discount Calculator</h2>
  <form action="/discount" method="POST">
    <label for="description">Product Description:</label>
    <input type="text" id="description" name="description" required><br><br>

    <label for="listPrice">List Price:</label>
    <input type="number" id="listPrice" name="listPrice" required><br><br>

    <label for="discountPercent">Discount Percent:</label>
    <input type="number" id="discountPercent" name="discountPercent" required><br><br>

    <input type="submit" value="Calculate Discount">
  </form>
</body>
</html>
