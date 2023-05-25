<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="path1" value="<%=request.getContextPath() %>" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>공지사항 상세보기</title>

    <jsp:include page="/head.jsp" />
</head>
<body>
  <jsp:include page="/header.jsp" />
  
  <h1 class="title">공지사항 상세보기</h1>
		<table class="table" id="tb1">
		  <thead>
		    <tr>
		      <th>No</th>
		      <th>제목</th>
		      <th>내용</th>
		      <th>가입일</th>
		      <th>방문횟수</th>
		      <th>파일</th>
		    </tr>
		  </thead>
  	</table>
</body>
</html>