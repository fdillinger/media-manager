<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
	<%@ include file="/WEB-INF/jsp/includes/includes.jsp" %>
	<%@ include file="/WEB-INF/jsp/includes/layoutImport.jsp" %>
    <link rel="stylesheet" href="./styles/jquery.autocomplete.css" type="text/css"/>

    <script src="./scripts/jquery.selectToAutocomplete.js"></script>
	<script src="./scripts/jquery-ui-personalized-1.6rc2.js"></script>
	<script src="./scripts/jquery-1.2.6.js"></script>
	<script src="./scripts/jquery.jqURL.js"></script>
	<script src="./scripts/jquery.cookie.js"></script>
	<script src="./scripts/jquery.tooltip.js"></script>	
    <script src="./scripts/jquery.autocomplete.js" type="text/javascript" ></script>	
    <script src="./scripts/messageHandler.js"></script>	
	<script src="./scripts/audiobook/audioBookAjaxAction.js"></script>
	<script src="./scripts/audiobook/books.js"></script>
	<script src="./scripts/audiobook/autors.js"></script>
	<script src="./scripts/audiobook/lectures.js"></script>		 	
    <script src="./scripts/referenceList.js"></script>
    <script>
     
     
     
    $(function() { 
	  $("#genre").bind("change" , function() {
		$.ajax({
			url: 'bookSearchAction.do?genreCode='+this.value,
		    beforeSend: function(){
		      showMessage("Load books","loader");
		    },
		    error: function(){
		      showMessage("An error occured.","error");
		    },
		    success: function(html){
			    $("#audioBookTabel").empty().append(html);
		      	removeMessage();
		    }
		 });
	  });     
   });
     
     
     
     
     
     
     
     
     $( function () {
		//activate reference autocomplete function
		var data = bookList.split('---');
		$("#name").autocomplete(data, {
			minChars: 0,
			max: 30,
			autoFill: true,
			mustMatch: false,
			matchContains: true,
			scrollHeight: 220
			});
	});
	
	$( function () {
		//activate reference autocomplete function
		var data = autorList.split('---');
		$("#autor").autocomplete(data, {
			minChars: 0,
			max: 30,
			autoFill: true,
			mustMatch: false,
			matchContains: true,
			scrollHeight: 220
			});
	});
	
	
	$( function () {
		//activate reference autocomplete function
		var data = lectures.split('---');
		$("#reader").autocomplete(data, {
			minChars: 0,
			max: 30,
			autoFill: true,
			mustMatch: false,
			matchContains: true,
			scrollHeight: 220
			});
	});
	
	
	$( function ()
	 {
		$("#autor").bind("change", function()
		{ 
		    label = $(this).val();
		    if(label.length > 0) {
		       $("#name").val('');
		       $("#reader").val('');
		    }
		});
		
		$("#name").bind("change", function()
		{ 
		    label = $(this).val();
		    if(label.length > 0) {
		       $("#autor").val('');
		       $("#reader").val('');
		    }
		});
		
		$("#reader").bind("change", function()
		{ 
		    label = $(this).val();
		    if(label.length > 0) {
		       $("#autor").val('');
		       $("#name").val('');
		    }
		});
	});

	
	</script>
    <title><fmt:message key="mediamanager.main.label"/></title>
</head>
<body>
<table class="generalTableLayout">
  <tr>
    <%@ include file="/WEB-INF/jsp/includes/header.jsp" %>
  </tr>
  <tr>
    <!-- 900 nowrap is here to prevent the main content 
	div to wrap around the navigation when the browser is in a small size.
	ie6 does not support TD nowrap attribute by CSS.
	-->
    <%-- --%>
    <td class="main"  nowrap>
      <div class="navigationAndContentWrapper">
        <%@ include file="/WEB-INF/jsp/includes/navbar.jsp" %>
        <div id="contentWrapper">
           <div class="tab1"></div>
           <div class="tab2Large">AUDIO BOOK SEARCH</div>
           <div class="tab3"></div>
           <div class="content"><!-- Start Contend Div -->
              <%-- start Search Panel --%>
              <div class="headPanel">
                <form:form modelAttribute="audioBookSearchCriteria" cssClass="">
                    <div class="firstItem">
                      <label>Höerbuch - Name (1076) Demo</label>
                      <form:input id="name" path="audioBookName" size="30" maxlength="30"/>
                    </div>
                    <div class="Item">
                      <label>Autor (499)</label>
                      <form:input id="autor" path="writer" size="30" maxlength="30"/>
                    </div>
                    <div class="Item">
                      <label>Sprecher / Lektor (11)</label>
                      <form:input id="reader" path="reader" size="30" maxlength="30"/>
                    </div>
                     <div class="Item">
                      <br>
		                 <button name="submitSearch" type="submit"/>suchen</button>
	                 </div>
                    <div class="Item">
                      <br>
                        <label>Genre</label>
                          <select name="genre" id="genre" >
                            <option>Roman</option>
                            <option>Komödie</option>
                            <option>Krimi & Thriller</option>
                            <option>Kabarett & Humor</option>
                            <option>Sachbücher</option>
                          </select>
                     </div>
                     <div class="Item">
                      <br>
                        <label>Sprache</label>
                          <select name="sprache" id="sprach" >
                            <option>Deutsch</option>
                            <option>Englisch</option>
                          
                          </select>
                     </div>
                     
               </form:form>    
              </div>
              <%-- end Search Panel --%>
              <%-- start result tabel --%>
             
             <div  class="scrollbarForMain">    
               <table id="audioBookTabel" class="standardTableLarge sortable">
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
	         </table>
	       </div> 
          </div> <!-- End Contend Div -->
         </div>
       </div>
    </td>
  </tr>
  <tr>
    <%@ include file="/WEB-INF/jsp/includes/footer.jsp" %>
  </tr>
</table>
</body>
</html>
