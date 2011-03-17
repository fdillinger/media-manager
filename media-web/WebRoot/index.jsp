<%@ include file="/WEB-INF/jsp/includes/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
	<head>
		<title>MEDIA MANAGER</title>
		<link rel="stylesheet" type="text/css" href="./styles/login.css">
		<script src="./scripts/jquery-1.2.3.js"></script>
	</head>
	<body>
		<table class="generalTableLayout">
			<tr>
				<td class="header">
					<div class="images"><img src="images/bienchen.gif" width="40" height="50" align="right"></div>
					<div class="firstitem"></div>
					<div class="lastItem">
					</div>
				</td>
			</tr>
			<tr>
				<td class="loginMain">
					<img src="./images/help_faq_logo_ger.gif" width="335"
							height="91" border="0" style="width: 303px; height: 216px">
					</br>
					<div class="contentWrapper">						
						<div class="tab1"></div>
						
						<div class="tab2Large">MEDIA MANAGER LOGIN PAGE</div>
						<div class="tab3"></div>
						<div class="content">
                            
                            
                            
                            <form action="<c:url value="/loginAction.do"/>" method="foo">
								<%-- this form-login-page form is also used as the form-error-page to ask for a login again. --%>
			                    <p>
									<label>Benutzername:</label>
								    <input type="text" name="username" id="username">
								</p>
								<p>
									<label>Passwort:</label>
									<input name="password" type="password"  id="j_password">
								</p>
								<input type="submit" id="login" name="login" value="Login" class="btn">
							</form>
						</div>
					</div>
<%--					<img src="./images/login_buttom_3.gif" width="598"--%>
<%--							height="93" border="0">--%>
					
					
				</td>
			</tr>
			<tr>
				<%@ include file="/WEB-INF/jsp/includes/footer.jsp"%>
			</tr>
		</table>
     </body>
</html>	