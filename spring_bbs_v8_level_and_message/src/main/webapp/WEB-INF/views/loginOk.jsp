<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script>


$(document).ready(function(){
	$("#messageBox").on("click",function(){

// 		document.location.href='/bbs/read.message?pageNum=1'
// 		document.location.href='/views/joinMember.jsp'
	});
});

</script>




</head>
<body>
	<div>
	<form action="/bbs/logout.bbs" method="post">
		<center>We welcome ★<font color="green">  ${id}</font>  ★  <br />
		<input data-toggle="modal" data-target="#myModal2"  type="button" style="color:pink ; background-color:black ; font-size:15pt" 
		id="messageBox" value="Message Box">
		
		<button style="color:pink ; background-color:black ; font-size:15pt" id="logout">Logout</button></center>
	</form>
	
		
	</div>
	
	
	
	
	
	
	
			<div class="modal fade" id="myModal2" role="dialog">
				<div class="modal-dialog modal-lg">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">내 쪽지함</h4>
						</div>
						<div class="modal-body">
						<table border="1" width="700" cellpadding= "2" cellspacing="2" align="center">
						<thead>
						<tr>
									<td width="150">보낸이</td>
									<td width="400">내용</td>
									<td width="150">보낸날짜</td>
						</tr>
						</thead>
						<tbody>
						<c:forEach var="message" items="${messageList}" >
							<td width="150">${message.sender}</td>
							<td width="400">${message.messageContent}</td>
							<td width="150">${message.messageDate}</td>
						</c:forEach>
						</tbody>
						</table>
						
						
						
						
						
						
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
						</div>
					</div>
				</div>
			</div>
	
</body>
</html>