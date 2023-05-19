<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>해당 페이지를 찾을 수 없습니다.</title>
<%@ include file="./common.jsp" %>
<style>
.vs { height:40vh; }
 .content { background-image: url("./images/top_career.jpg"); }
 #page1 .page_tit { padding-top: 60px; }
 .table { width:680px; margin:4px auto; padding-top:20px; border-top:2px solid #333; }
 th {  text-align: justify;  line-height: 0; width:180px; padding-top:10px; padding-bottom: 10px;}
 td { padding-top:10px; padding-bottom: 10px; }
 th:after {  content: "";  display: inline-block;  width: 100%; }
 th:before {  content: "";  display: inline-block;  width: 100%; }
 .lb { display:block;  font-size:20px; }
 .indata { display:block; width:400px; height:24px; line-height:24px; padding:10px; }
 .btn { display:inline-block; outline:none; border:none; border-radius:8px; margin:16px;
      text-align: center; padding:10px 20px;  cursor:pointer; }
 .btn-primary { background: -moz-linear-gradient(top, #00b7ea 0%, #009ec3 100%); 
     background: -webkit-linear-gradient(top, #00b7ea 0%,#009ec3 100%); 
     background: linear-gradient(to bottom, #00b7ea 0%,#009ec3 100%); color:#fff; }
 .btn-cancle { background: -moz-linear-gradient(top, #a90329 0%, #8f0222 44%, #6d0019 100%); 
     background: -webkit-linear-gradient(top, #a90329 0%,#8f0222 44%,#6d0019 100%); 
     background: linear-gradient(to bottom, #a90329 0%,#8f0222 44%,#6d0019 100%);
     color:#fff;
 }
 .page_tit { text-align:center; font-size:32px; }
.title { text-align:center; }
#tb1, .msg { width:600px; margin:0 auto; text-align:center; }
.btn { margin-top:20px; }
img { display:inline-block; max-width:100%; }
</style>
</head>
<body>
<%@ include file="./header.jsp" %>
<div class="msg" style="min-height:500px">
	<h1 class="title">요청하신 주소의 페이지를 찾을 수 없습니다.</h1>
	<img src="img/404pages.jpg" alt="찾을 수 없는 페이지">
	<button type="button" class="btn btn-primary" onclick="javascript:history.back()">되돌아가기</button>
</div>
<%@ include file="./footer.jsp" %>
</body>
</html>