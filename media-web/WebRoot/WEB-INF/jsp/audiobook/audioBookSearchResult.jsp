<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
	<%@ include file="/WEB-INF/jsp/includes/includes.jsp" %>
	<%@ include file="/WEB-INF/jsp/includes/layoutImport.jsp" %>
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
           <div class="tab2Large">AUDIO BOOK SEARCH RESULT</div>
           <div class="tab3"></div>
           <div class="content"><!-- Start Contend Div -->
             <div class="scrollbarForMain">    
                <div class="headPanel">
                 <ul>  
                    <label>Suchergebnis für: Carsten Sebastion Henn</label>
                </ul>
               </div>
              <table class="standardTableLarge sortable">
	           <thead>
	              <tr>
	               <label></label> </th>
	              </tr>
	                <tr>
	                  <td><img src="./images/root_2.gif" border="0" class="icon" ></td>
	                  <td>Name</td>
	                  <td>Autor</td>
	                  <td>Sprecher</td>
	                  <td>Bewertung</td>
	                </tr>
	           </thead>
	           <tbody>
	                 <%--	NEW BOOK--%>
	                 <tr class="alt">
	                    <td>
	                       <img src="./images/in_dubio_prov_vino75x75.jpg" border="0" class="icon" >
	                    </td>
	                    <td>
	                        In Vino Veriats
	                       <img src="./images/table_go.gif" width="16" height="16" border="0" class="icon" > <br />
	                       <a href="http://www.amazon.de/Dubio-pro-Vino-kulinarischer-Kriminalroman/dp/3897055473/ref=sr_1_2?ie=UTF8&s=books&qid=1218658115&sr=1-2" class="snap_shots">Info</a>
	                    </td>
	                    <td>
	                       <a href="singleSearchBook.do?writer=henn">Carsten Sebastian Henn</a><br />
	                       <a href="http://de.wikipedia.org/wiki/Carsten_Henn"class="snap_shots">Info</a>
	                    </td>
	                    <td>
	                       <a href="#">Jürgen von der Lippe</a>
                           <a href="http://de.wikipedia.org/wiki/J%C3%BCrgen_von_der_Lippe"class="snap_shots">Info</a>                       
                        </td> 
	                    <td>
	                        <img src="./images/5stars.png"  border="0">
	                    </td> 
                      </tr>
                      <tr>
	                    <td>
	                       <img src="./images/in dubio pro vino.jpg" border="0" class="icon" >
	                    </td>
	                    <td>
	                        In Dubio pro vino
	                       <img src="./images/table_go.gif" width="16" height="16" border="0" class="icon" > <br />
	                       <a href="http://www.amazon.de/Dubio-pro-Vino-kulinarischer-Kriminalroman/dp/3897055473/ref=sr_1_2?ie=UTF8&s=books&qid=1218658115&sr=1-2" class="snap_shots">Info</a>
	                    </td>
	                    <td>
	                       <a href="singleSearchBook.do?writer=henn">Carsten Sebastian Henn</a><br />
	                       <a href="http://de.wikipedia.org/wiki/Carsten_Henn"class="snap_shots">Info</a>
	                    </td>
	                    <td>
	                       <a href="#">Jürgen von der Lippe</a>
                           <a href="http://de.wikipedia.org/wiki/J%C3%BCrgen_von_der_Lippe"class="snap_shots">Info</a>                       
                        </td> 
	                    <td>
	                        <img src="./images/5stars.png"  border="0">
	                    </td> 
                    </tr>
                    <tr class="alt">
	                    <td>
	                       <img src="./images/vinum_mysterum_75x75.jpg" border="0" class="icon" >
	                    </td>
	                    <td>
	                        In Dubio pro vino
	                       <img src="./images/table_go.gif" width="16" height="16" border="0" class="icon" > <br />
	                       <a href="http://www.amazon.de/Dubio-pro-Vino-kulinarischer-Kriminalroman/dp/3897055473/ref=sr_1_2?ie=UTF8&s=books&qid=1218658115&sr=1-2" class="snap_shots">Info</a>
	                    </td>
	                    <td>
	                       <a href="singleSearchBook.do?writer=henn">Carsten Sebastian Henn</a><br />
	                       <a href="http://de.wikipedia.org/wiki/Carsten_Henn"class="snap_shots">Info</a>
	                    </td>
	                    <td>
	                       <a href="#">Jürgen von der Lippe</a>
                           <a href="http://de.wikipedia.org/wiki/J%C3%BCrgen_von_der_Lippe"class="snap_shots">Info</a>                       
                        </td> 
	                    <td>
	                        <img src="./images/5stars.png"  border="0">
	                    </td> 
                    </tr>
	           </tbody>
	           <tfoot>
                 <tr>
                   <td><a href="#">Vollständige Liste</a></td>
                   <td>&nbsp;</td>
                   <td>&nbsp;</td>
                   <td>&nbsp;</td>
                 </tr>
               </tfoot>
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
