<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
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
           <div class="tab2Large">MEDIA Manager Overview</div>
           <div class="tab3"></div>
            <div class="content">
            <div class="scrollbarForMain">    
            
          	 
        </div>
        <!-- End Contend Div -->
      </div>
    </td>
  </tr>
  <tr>
    <%@ include file="/WEB-INF/jsp/includes/footer.jsp" %>
  </tr>
</table>
</body>
</html>
