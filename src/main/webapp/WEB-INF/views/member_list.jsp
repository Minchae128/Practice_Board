<%--
  Created by IntelliJ IDEA.
  User: shinpardon
  Date: 2023-11-03
  Time: 오후 8:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원목록</title>
    <!-- Bootstrap core CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
    </style>
</head>
<body>
<div class="container">
    <header class="d-flex justify-content-center py-3">
        <ul class="nav nav-pills">
            <li class="nav-item"><a href="/" class="nav-link" aria-current="page">Home</a></li>
            <li class="nav-item"><a href="/board" class="nav-link">게시판</a></li>
            <li class="nav-item"><a href="/member_list" class="nav-link active">회원 목록</a></li>
            <li class="nav-item"><a href="/about" class="nav-link">About</a></li>
        </ul>

        <div class="col-md-3 text-end">
            <button type="button" class="btn btn-outline-primary me-2" onclick="location.href='/login'">Login</button>
            <button type="button" class="btn btn-primary" onclick="location.href='/member_join'">Sign-up</button>
        </div>
    </header>
</div>

<div class="container text-center" style="width:90%; margin-top: 100px">

    <hr width="100%" color="black" noshade/>

    <div class="row justify-content-center">
        <div class="col-1">
            NO
        </div>
        <div class="col-2">
            성명
        </div>
        <div class="col-3">
            주소
        </div>
        <div class="col-2">
            전화번호
        </div>
        <div class="col-2">
            이메일
        </div>
        <div class="col-2">
            가입일자
        </div>
    </div>

    <hr width="100%" color="black" noshade/>

</div>
</body>
</html>