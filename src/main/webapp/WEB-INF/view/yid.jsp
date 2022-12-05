<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>客戶表單</title>
        <link rel="stylesheet" href="./css/pure-min.css">
    </head>
    <body background="./image/bgimg.png" style="padding: 20px">
        <form class="pure-form" method="post" action="/YIDWebDemo/yid">
            <fieldset>
                <legend>聯絡我們</legend>
                <p><span>公司名稱</span><br /><input name="company" type="text" id="company" value="${company}" /></p>
                <p><span>聯絡姓名</span><br /><input name="name" type="text" id="name" value="${name}" /></p>
                <p><span>聯絡手機</span><br /><input name="tel" type="text" id="tel" value="${tel}" /></p>
                <p><span>市內電話</span><br /><input name="tel2" type="text" id="tel2" value="${tel2}" /></p>
                <p><span>聯絡信箱</span><br /><input name="email" type="text" id="email" value="${email}" /></p>
                <p><span>聯絡內容</span><br /><textarea name="content" id="content" rows="10" valur="${content}"></textarea></p>
                <button type="reset">清除</button>
                <button type="submit">送出</button>
                
            </fieldset>
        </form>  
        <table class="pure-table pure-table-bordered">
            <thead>
                <tr>
                    <td>公司名稱</td><td>聯絡姓名</td><td>聯絡手機</td><td>市內電話</td>
                    <td>聯絡信箱</td><td>聯絡內容</td>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="ctArray" items="${ ctList }">
                    <tr>
                        <c:forEach var="ct" items="${ ctArray }">
                            <td>${ct}</td>
                        </c:forEach>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
