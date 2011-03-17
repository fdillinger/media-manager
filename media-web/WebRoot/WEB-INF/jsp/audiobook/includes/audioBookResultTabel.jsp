<%@ include file="/WEB-INF/jsp/includes/includes.jsp" %>
<%--
@author fdillinger
list of audiobooks for ajax dropdown
--%>

<%--            < table id="audioBookTabel" class="standardTableLarge sortable">--%>
	            <thead>
	               <tr>  
	                  <td>Name</td>
	                  <td>Autor</td>
	                  <td>Sprecher</td>
	                  <td>Genre</td>
	                  <td>Bewertung</td>
	                </tr>
	           </thead>
	           <tbody>
	             <% int k = 0 ; %> <%-- counter to manage alternative colors rows --%>
				 <c:forEach var="audiobook" items="${audioBooks}">
					 <tr <%= k % 2 == 1 ? "class=alt" : ""  %> ><%  k++; %>
	                    <td><img src="./images/table_go.gif" width="16" height="16" border="0" class="icon" >${audiobook.name}</td>
	                    <td><a href="singleSearchBook.do?writer=foo">${audiobook.autor}</a></td>
	                    <td><a href="#">${audiobook.reader}</a></td>
	                    <td><a href="#">Roman</a></td>
	                    <td><img src="./images/5stars.png"  border="0"></td>
	             </c:forEach>
	           </tbody>
<%--	         </table>--%>