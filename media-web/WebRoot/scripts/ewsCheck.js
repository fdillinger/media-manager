
function ewsAjaxCall(eocid, table, i, j){
	$.ajax({
		url: 'SearchEwsStatusForm.do?eocid=' + eocid  ,
		cache : false,
		error: function(){showMessage("An error occured.","error");},				
		success : function(html){			
		    //sauvegarder dans un champ les eocid et les status				    
		    ewsStatus = "";
		    if (html.indexOf("hasWarning") != -1) {
		    	ewsStatus = "1";
		    } 
		    if (html.indexOf("hasNoWarning") != -1) {
		    	ewsStatus = "0";
		    } 
		    if (html.indexOf("hasFailure") != -1) {
		    	ewsStatus = "-2";
		    }		
		    table.rows[i].cells[j].innerHTML=html;		    
		    //will be used to give to the controller the list of checked economic operator 
		    // so that no new check will be done and so that the economic operator.ewsStatus can be set.
		    if (ewsStatus != "") {				    	
		    	alreadyEwsChecked = document.getElementById("alreadyEwsChecked").value;
		    	alreadyEwsChecked = alreadyEwsChecked + ";" + eocid + ":" + ewsStatus;
		    	document.getElementById("alreadyEwsChecked").value = alreadyEwsChecked;
		    	//alert(alreadyEwsChecked);
		    }			    
		}				
	 });	
}

function ewsCheck(){
	var table = document.getElementById("selectedContractors"); 	
	var rows = table.rows;	
	
	for (var i = 0; i < rows.length; i++) {
	    var cells = rows[i].cells;	   	    
	    for(var j=0; j<cells.length; j++) {
	    	//var content = cells[j].innerHTML;
	    	var content = cells[j].innerHTML;
	    	if (content.indexOf("loader") != -1) { 	
			        var eocid = cells[j-1].innerHTML;
			        //doing the real ajax call :
			        ewsAjaxCall(eocid, table, i, j);
			}
	    }	   	       	    	
	}	
}