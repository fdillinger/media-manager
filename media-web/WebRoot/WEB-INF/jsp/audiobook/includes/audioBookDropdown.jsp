<%@ include file="/WEB-INF/jsp/includes/includes.jsp" %>
<%--
@author fdillinger
list of audiobooks for ajax dropdown
--%>
<c:forEach var="book" items="${books}">
	<option value="${book.value}">${book.label}</option>
</c:forEach>
