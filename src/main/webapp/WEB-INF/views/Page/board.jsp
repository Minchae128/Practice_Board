<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시판</title>
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
            color: #808080; font-size: 11px;
        }

        footer nav {
            text-align: center;
        }

        footer a:visited {
            color: #808080;
        }

        footer p {
            margin-top: 0; margin-bottom: 0;
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
<div class="container">
    <header class="d-flex justify-content-center py-3">
        <ul class="nav nav-pills">
            <li class="nav-item"><a href="/" class="nav-link" aria-current="page">Home</a></li>
            <li class="nav-item"><a href="/board" class="nav-link active">게시판</a></li>
            <li class="nav-item"><a href="/member_list" class="nav-link">회원 목록</a></li>
            <li class="nav-item"><a href="/about" class="nav-link">About</a></li>
        </ul>

        <div class="col-md-3 text-end">
            <button type="button" class="btn btn-outline-primary me-2" onclick="location.href='/login'">Login</button>
            <button type="button" class="btn btn-primary" onclick="location.href='/member_join'">Sign-up</button>
        </div>
    </header>
</div>

<div class="container text-center" style="margin-top: 100px">

    <hr width="100%" color="black" noshade/>

    <div class="row justify-content-center">

        <div class="col-1">
            NO
        </div>
        <div class="col-5">
            제목
        </div>
        <div class="col-2">
            작성자
        </div>
        <div class="col-2">
            작성일
        </div>
        <div class="col-1">
            조회수
        </div>
        <div class="col-1">
            댓글수
        </div>

    </div>

    <hr width="100%" color="black" noshade/>

</div>

<%--footer 위치--%>
<%@include file="/WEB-INF/views/etc/footer.jsp" %>

</body>
</html>