<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <br><br>
            <h2 class="display-4">Search Result</h2>
            <hr>
            Account Number : ${acc.accno}
            <br>
            Name : ${acc.accnm}
            <br>
            Type : ${acc.acctype}
            <br>
            Balance : <b>${acc.balance} <b/>
            <br><br>
            <a href = "/" >Home</a>
        </div>
    </body>
</html>