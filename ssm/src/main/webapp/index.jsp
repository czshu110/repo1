<%--
  Created by IntelliJ IDEA.
  User: CZS
  Date: 2018/10/30
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.3.1.js"></script>
</head>
<body>
<h1>一点寒芒先至</h1>
<a href="bookController/a">点啊</a><br/>
<input type="button" id="btn" value="测试">
<br/><br/>
<form method="post" action="bookController/findAll">
    <input type="submit"  value="测试findAll">
</form>
</body>
</html>

<script>
    $("#btn").click(function () {
        alert(111);
        $.ajax({
            url:"bookController/test",
            type:"post",
            data:{"bookName":"哈萨k","author":"俊杰儿子"},
            dataType:"json",
            success:function (data) {
                alert(data.bookName);
                alert(data.author);
            }
        });
    });
</script>
