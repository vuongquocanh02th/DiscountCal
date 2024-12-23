<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
    <h2>Product Discount Calculator</h2>
    <form action="${pageContext.request.contextPath}/discount" method="post">
        <label>Product Description: </label>
        <input type="text" name="descript" placeholder="description"><br>
        <label>List Price: </label>
        <input type="text" name="price" placeholder="list price"><br>
        <label>Discount Percent: </label>
        <input type="text" name="discnt" placeholder="discount percent"><br>
        <input type="submit" id="submit" value="Calculate Discount">
    </form>
</body>
</html>