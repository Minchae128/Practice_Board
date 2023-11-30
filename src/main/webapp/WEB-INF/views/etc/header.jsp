<%--헤더 파일--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="container">
    <header class="d-flex justify-content-center py-3">
        <ul class="nav nav-pills">
            <li class="nav-item"><a href="/" class="nav-link active" aria-current="page">Home</a></li>
            <li class="nav-item"><a href="/board" class="nav-link">게시판</a></li>
            <li class="nav-item"><a href="/member_list" class="nav-link">회원 목록</a></li>
            <li class="nav-item"><a href="/about" class="nav-link">About</a></li>
        </ul>

        <div class="col-md-3 text-end">
            <button type="button" class="btn btn-outline-primary me-2" onclick="location.href='/login'">Login</button>
            <button type="button" class="btn btn-primary" onclick="location.href='/member_join'">Sign-up</button>
        </div>
    </header>
</div>