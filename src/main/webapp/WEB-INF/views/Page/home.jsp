<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <!-- Bootstrap core CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

    <style>
        footer {
            width: 100%;
            height: 100px;
            bottom: 0px;
            position: absolute;
            border-top: 1px solid #c4c4c4;
            padding-top: 15px;
            color: #808080;
            font-size: 11px;
        }

        footer a {
            display: inline-block;
            margin: 0 20px 10px 20px;
            color: #808080;
            font-size: 11px;
        }

        footer nav {
            text-align: center;
        }

        footer a:visited {
            color: #808080;
        }

        footer p {
            margin-top: 0;
            margin-bottom: 0;
            text-align: center;
        }

        footer p span {
            display: inline-block;
            margin-left: 20px;
        }
    </style>

</head>

<body>

<%--header 위치--%>
<%@include file="/WEB-INF/views/etc/header.jsp" %>

<div class="px-4 pt-2 my-5 text-center">
    <img src="/img/coding.jpeg" alt="Coding" style="width: 25%;">

    <br>
    <br>

    <h1 class="display-4 fw-bold">Spring Study</h1>

    <br>

    <div class="col-lg-6 mx-auto">
        <p class="lead mb-4">게시판 , 회원가입, 로그인 기능 구현 연습!!</p>
        개발 툴 : 인텔리제이 <br>
        JAVA 버전 : 11 <br>
        DBMS : oracle <br>
        View : Jsp <br>
        Mapper : Mybatis <br>
        Springboot : 2.7.17 <br>
        Grable : gradle-7.3-bin.zip <br>
    </div>

</div>

<%--footer 위치--%>
<%@include file="/WEB-INF/views/etc/footer.jsp" %>

</body>
</html>