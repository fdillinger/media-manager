<%@ include file="/WEB-INF/jsp/includes/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<script type="text/javascript" src="http://shots.snap.com/ss/cb4d286d289c0dc4eb48c3aac61a8253/snap_shots.js"></script>

<head>
	<%@ include file="/WEB-INF/jsp/includes/includes.jsp" %>
	<%@ include file="/WEB-INF/jsp/includes/layoutImport.jsp" %>
    <title>Media Manager</title>
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
        <!-- Start Contend Div -->
        <div id="contentWrapper">
           <div class="tab1"></div>
           <div class="tab2Large">AUDIO BOOK MAIN</div>
           <div class="tab3"></div>
           <div class="content">
             <div class="headPanel">
          	    <ul>
                  <li class="new" ><a href="#"><fmt:message key="mediamanager.audibook.create"/></a></li>
                  <li class="new" ><a href="audioBookSearch.do?"><fmt:message key="mediamanager.audibook.search"/></a></li>
                  <li class="new" ><a href="#"><fmt:message key="mediamanager.audibook.update"/></a></li>
               </ul>
            </div>
             <div class="scrollbarForMain">    
              <table class="standardTableLarge sortable">
	           <thead>
	              <tr>
	                <th colspan="5"><img src="./images/icon_mini_buddies.gif" class="icon"><label>Top Hörbücher</label> </th>
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
	                <tr class="alt">
	                  <td><img src="./images/in_dubio_prov_vino75x75.jpg" border="0" class="icon" ></td>
	                  <td>In Vino Veriats
	                     <img src="./images/table_go.gif" width="16" height="16" border="0" class="icon" > <br />
	                     <a href="http://www.amazon.de/Dubio-pro-Vino-kulinarischer-Kriminalroman/dp/3897055473/ref=sr_1_2?ie=UTF8&s=books&qid=1218658115&sr=1-2" class="snap_shots">Info</a>
	                  </td>
	                  <td><a href="singleSearchBook.do?writer=henn">Carsten Sebastian Henn</a><br />
	                      <a href="http://de.wikipedia.org/wiki/Carsten_Henn"class="snap_shots">Info</a>
	                  </td>
	                  <td><a href="#">Jürgen von der Lippe</a>
                         <a href="http://de.wikipedia.org/wiki/J%C3%BCrgen_von_der_Lippe"class="snap_shots">Info</a>                       
                      </td> 
	                  <td><img src="./images/5stars.png"  border="0"></td> 
                       <%--	NEW BOOK--%>
	                </tr>
	                 <tr >
	                  <td><img src="./images/glennkill75x75_.jpg" border="0" class="icon" ></td>
	                  <td>Glennkill <img src="./images/table_go.gif" width="16" height="16" border="0" class="icon" >
	                  </td>
	                  <td><a href="#">Leonie Swan</a>
	                  </td>
	                  <td><a href="#">Andrea Sawatzki</a>                      
                      </td> 
	                  <td><img src="./images/5stars.png"  border="0"></td> 
	                </tr>
	                 <tr class="alt">
	                  <td><img src="./images/Vollidiot75x75.jpg" border="0" class="icon" ></td>
	                  <td>Der Vollidiot <img src="./images/table_go.gif" width="16" height="16" border="0" class="icon" >
	                  </td>
	                  <td><a href="#">Tommy Jaud</a>
	                  </td>
	                  <td><a href="#">Christoph Maria Herbst</a>                      
                      </td> 
	                  <td><img src="./images/5stars.png"  border="0"></td> 
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
    </td>
  </tr>
  <tr>
    <%@ include file="/WEB-INF/jsp/includes/footer.jsp" %>
  </tr>
</table>
</body>
</html>
