<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Calculator</title>
</head>
<body>
<div>
    <h1>Calculator</h1>
    <form action="/calculator" method="post">
        <input type="text" name="firstNumber">
        <input type="text" name="secondNumber">
        <button type="submit" name="action" value="add">Addition(+)</button>
        <button type="submit" name="action" value="sub">Subtraction(-)</button>
        <button type="submit" name="action" value="mul">Multiplication(X)</button>
        <button type="submit" name="action" value="div">Division(/)</button>
    </form>
<div>${result}</div>
</div>
</body>
</html>