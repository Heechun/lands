<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTf-8">
<!-- Bootstrap Core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
 
  
  
  
  
  <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
     <a class="navbar-brand" href="/bbs/list.bbs?pageNum=1">준영랜드</a>
   			<c:if test="${id!=null}">
				<%@include file="loginOk.jsp"%>
			</c:if>
	
			<c:if test="${id==null}">
				<%@include file="login.jsp"%>
			</c:if>
     
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/bbs/">Home</a></li>
      <li><a href="/bbs/list.bbs?pageNum=1">랜드1</a></li>
      <li><a href="/bbs/list.bbs?pageNum=1">랜드2</a></li> 
      <li><a href="/bbs/list.bbs?pageNum=1">랜드3</a></li> 
    </ul>
  </div>
</nav>
</body>
</html>