<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script>
$(document).ready(function(){
	
$("#includeHeader").load("../views/bbs.jsp")
});</script>

</head>

<body>
<div class="container">
<%@ include file="header.jsp" %>
 <h1><font color="red">HI</font></h1>
 <div id="includeHeader"></div>
<%-- <%@ include file="leftAside.jsp" %> --%>
<!--   <section class="content"> -->
<!--     <h2>테니스장 소개</h2>     -->
<!--      <article> -->
<!--        <h3>1번 코트</h3> -->
<!--        <img src="resources/gun.bmp"> -->
<!--      </article> -->
<!--   </section> -->

<%-- <%@ include file="rightAside.jsp" %> --%>
<%-- <%@ include file="footer.jsp" %> --%>
</div>  
</body>
</html>