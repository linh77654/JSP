<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Thêm mới sinh viên</title>
    <script>
        function validateForm() {
            var name = document.forms["studentForm"]["name"].value;
            var classID = document.forms["studentForm"]["classID"].value;

            if (name === "") {
                alert("Tên không được để trống");
                return false;
            }
            if (classID === "") {
                alert("Mã lớp không được để trống");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<h2>Thêm mới sinh viên</h2>

<c:if test="${not empty error}">
    <div style="color: red;">${error}</div>
</c:if>

<form name="studentForm" method="post" action="/Student?action=create" onsubmit="return validateForm()">
    <label for="name">Tên:</label>
    <input type="text" id="name" name="name" required>
    <br>
    <label for="address">Mã lớp:</label>
    <input type="text" id="address" name="address">
    <br>
    <button type="submit">Thêm mới</button>
</form>

</form>
</body>
</html>
