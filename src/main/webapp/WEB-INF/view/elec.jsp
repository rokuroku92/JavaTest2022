<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>count price of electricity</title>
        <meta charset=UTF-8">
        <link rel="stylesheet" href="./css/pure-min.css">
    </head>
    <body background="./image/bgimg.png" style="padding: 20px">
        <!--<h1>元創智動股份有限公司</h1>-->
        <img src="./image/logo.png" alt="image error">
        <!--<div class="content"></div>-->
        <br>
        <form class="pure-form-message-inline" method="post" action="/YIDWebDemo/elec">
            <fieldset>
                <legend>電費計算</legend>
                <p>伏特(V):
                <select id="volt" name="volt">
                    <option value="110">110V</option>
                    <option value="220">220V</option>
                    <option value="330">330V</option>
                </select></p>
                <p>安培(A):
                    <input type="number" id="ampere" name="ampere" value="${ampere}" style="text-align: center">
                </p>
                <p>每天使用時數:
                    <input type="number" id="use_hourse" name="use_hours" value="${use_hours}" style="text-align: center">
                </p>
                <p>每度電價:
                    <input type="number" id="price" name="price" value="${price}" style="text-align: center">
                </p>
                <br>
                <button type="submit">計算電器每月電費</button>
            </fieldset>
        </form>
        <br>
        <p>預估月電費: $${ ans }</p>
        <footer>
            <p>©元創智動股份有限公司 All Rights Reserved</p>
        </footer>
    </body>
</html>

