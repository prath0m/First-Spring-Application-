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
            <h2 class="display-4">Account Operations</h2>
            <hr>

            <form action="addacc" method="post">

               <table>
                <tr>
                    <td>Account Number</td>
                    <td><input type="number" name="accno" autocomplete="off" required class="form-control"></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="accnm" autocomplete="off" required class="form-control"></td>
                </tr>
                <tr>
                    <td>Type</td>
                    <td>
                        <select name="acctype" class="form-control">
                            <option value="saving">Saving</option>
                            <option value="fixed">Fixed</option>
                            <option value="current">Current</option>
                        </select>
                    </td>
                    </tr>
                    <tr>
                        <td>Balance</td>
                        <td>
                            <input type="number" name="balance" autocomplete="off" required class="form-control">
                        </td>
                    </tr>

                <tr>
                    <td><input type="submit" value="Submit" class="btn btn-outline-primary"></td>
                    <td></td>
                </tr>
               </table>
            </form>
            <br><br>
            <a href="showacc">Show accounts report</a>
            <br>
            <a href="search">Search Account</a>
            <br>
            <a href="/deposite">Deposit</a>
            <br>

            <hr>
            Developed at SohamGlobal&copy;July 2024
            <br>
            sohamglobal.com | spiderprojectsone.com

        </div>
    </body>
</html>