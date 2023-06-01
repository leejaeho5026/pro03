<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/head.jsp" />
<title>공지사항 글 쓰기</title>
</head>
<body>
<jsp:include page="/header.jsp" />
 <section class="section">
    <div class="container">
      <h1 class="title">글 등록하기</h1>
      	<form action="${path1 }/NoticeInsertPro.do" method="post">
			<table class="table">
			   <tbody>
			    <tr>
			      <th><label for="title">제목</label></th>
			      <td><input type="text" class="input" maxlength="120" name="title" id="title" placeholder="제목 입력" required /></td>
			    </tr>
			    <tr>
			      <th><label for="content">내용</label></th>
			      <td><textarea rows="8" cols="100" name="content" id="content" class="textarea" required></textarea></td>
			    </tr>
			  </tbody>
			</table>
			<div class="buttons">
			  <button type="submit" class="button is-success">등록</button>
			  <button type="reset" class="button is-warning">취소</button>
			  <a href="${path1 }/NoticeList.do" class="button is-info">목록</a>
			</div>
		</form>
    </div>
  </section>
  <footer class="footer">
  <div class="content has-text-centered">
  	<img src="${path2 }/img/footer_logo.png" alt="강릉시 로고">
    <p>
	[25522] 강원도 강릉시 강릉대로 33 (홍제동) Tel : 033-660-2018<br>
	Copyright ⓒ 2017 Gangneung-si. All Rights Reserved.
    </p>
  </div>
</footer>
</body>
</html>