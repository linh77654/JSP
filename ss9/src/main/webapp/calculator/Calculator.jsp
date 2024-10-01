<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="calculate" method="post">
    <label for="num1">Số thứ nhất:</label>
    <input type="text" id="num1" name="num1" required>
    <br>
    <label for="operator">Phép tính:</label>
    <select id="operator" name="operator">
        <option value="+">Cộng</option>
        <option value="-">Trừ</option>
        <option value="*">Nhân</option>
        <option value="/">Chia</option>
    </select>
    <br>
    <label for="num2">Số thứ hai:</label>
    <input type="text" id="num2" name="num2" required>
    <br>
    <input type="submit" value="Tính">
</form>
</body>
</html>
