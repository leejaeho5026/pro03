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
  


    <div class="container">
      <h1 class="title">공지사항 상세보기</h1>
		<table class="table">
		   <tbody>
		    <tr>
		      <th>번호</th>
		      <td>${notice.no }</td>
		    </tr>
		    <tr>
		      <th>제목</th>
		      <td>${notice.title }</td>
		    </tr>
		    <tr>
		      <th>내용</th>
		      <td><p>${notice.content }</p></td>
		    </tr>
		    <tr> 
		      <th>작성일</th>
		      <td>
		      	<fmt:parseDate value="${regDate }" var="regdate" pattern="yyyy-MM-dd HH:mm:ss" />
		      	<fmt:formatDate value="${regdate }" pattern="yyyy-MM-dd" />
		      </td>
		    </tr>
		    <tr>
		      <th>읽은 횟수</th>
		      <td><p>${notice.visited }</p></td>
		    </tr>
		  </tbody>
		</table>
		<div class="buttons">
		  <a href="${path1 }/NoticeList.do" class="button is-info">목록</a>
		  <c:if test='${sid.equals("admin") }'>
			  <a href="${path1 }/DelNotice.do?no=${dto.no }" class="button is-danger">글 삭제</a>
			  <a href="${path1 }/NoticeUpdatePro.do?no=${dto.no }" class="button is-warning">글 수정</a>
		  </c:if>
		</div>
    </div>
</body>
</html>