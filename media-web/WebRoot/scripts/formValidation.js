/*
jquery validation code.
Submit the form, get back the list of errors for this step,
populate the errors result back to the form
*/


function validateForm() { 
	
  
	
	/*
	 * if the form was saved, as soon as it is changed
	 * we remove the top message.
	 */
	if ( formSaved ) {
		removeMessage();
		formSaved = false;
	}
	
	
 	//we submit the form to the server
	$.post($.jqURL.url(), $("form.standardForm").serialize(),  function(data){
	     // after submit (data contain the ajax result)
	 	 $("form.standardForm p span.error,span.warning,span.info").remove(); //remove all previous errors
	 	 $("form.standardForm p label span").removeClass("required"); //remove all previous missing fields
	 	 $("form.standardForm p label span.dynamic").remove(); //remove dynamic required fields
	 	 
	 	 //$("form p span.alert").remove(); //remove all error markers
	 	 
	 	 /*
 		 we hook to a start method when we want to initialise the layout
 		 before any other change is made
	 	  */
	 	 if (window.startHook) {
	 	 	startHook($(this));
 	 	 }	 	 
	 	 
		 $(data).find("span").each(function() { // for each errors found in ajax result
			
			isRequired = false;
			if ( $(this).attr('title') == 'error.required') {
				isRequired = true;
			}
				
			//we get the ID of the element containing an error
		 	myid = $(this).attr('id')
		 		.replace(".errors","") //remove spring .error in id name (in case of the <form:error tag )
		 		.replace(/\./g,"\\.")  //escape the . which is considered as a class marker
		 		.replace(/\[/g,"\\[")  //escape [ 
		 		.replace(/\]/g,"\\]"); //and ]
		 		
		 	msgLevel = $(this).attr('class');
		 	
		 	if ( window.validateHook ) {
			 	validateHook($(this));
		 	}
		 	
		 	if (! isRequired ) {
			    
			    //autopopup on/off button
			    if ($.cookie('error_autopopup') == 'true') {
				    popupButton = "<strong class='autoError'>"+ autopopup + "</strong>";
			    } else {
				    popupButton = "<strong class='autoError'>"+ autopopup + "</strong>";
			    }
			    
			 	msg = "<strong class='errorMsg'>" + $(this).text()+ "</strong>" ; // create help msg to append to the help box
			 	if ( $("#"+myid + " span.error strong.errorMsg").size() > 0 ) {
			 		//we already have an error msg, so we just append this msg to the other one
				 	$("#"+myid + " span.error strong.errorMsg").append('<br>'+$(this).text()); //add the msg into the help box
			 		
			 	} else {

					//seenCounter var is defined in awardedContracWith/Without steps.jsp file
					/*
					 * we show the error message if :
					 * 		- error auto popup is on
					 * 	    - the page has been seen more than one time
					 *      - this is a loaded contract (contract id > 0)
					 */
					
					if ($.cookie('error_autopopup') == 'true' || seenCounter > 1 || contractId >0) {	     
				 		if ( msgLevel == 'ERROR') {
					 		msgWithSpan = '<span class="error">' + popupButton + msg  +'</span>';
						 	$("#"+myid ).append(msgWithSpan); //add the msg into the help box
				 		} else if ( msgLevel == 'WARNING') {
					 		msgWithSpan = '<span class="warning">' +popupButton + msg + '</span>';
						 	$("#"+myid ).append(msgWithSpan); //add the msg into the help box
				 		} 
				 		
				 		//now bind action on the autopoup button
					    $('form.standardForm span strong.autoError').bind('click', function () {
					    	ErrorAutoPopup();
					    });		
					}	 		
					// infos level always displayed
					if ( msgLevel == 'INFO') {
						msgWithSpan = '<span class="info">' + msg + '</span>';
					 	$("#"+myid ).append(msgWithSpan); //add the msg into the help box
				 	}					
			 		
			 	}
		 	} else {
		 		// this is a required field, we don't display the error below,
		 		// but we just mark the field as mandatory and missing
		 		
		 		//if the star is not there, we add it
		 		if ( $("#"+myid + " label span").length == 0 ) {
		 			msg='<span class="dynamic"> *</span>';
		 			$("#"+myid + " label").append(msg);
		 		}
		 		
		 		$("#"+myid + " label span").addClass("required");		 	
		 		
		 			
		 	}
   		});
	});
};

// Waiting the browser to be ready to run jS code
$(document).ready(function(){
	
  //error cookie initialisation autopup initialisation
    if ($.cookie('error_autopopup') == null) {
    	$.cookie('error_autopopup','true', { expires: 365 });
    }
	
	$("form.standardForm input,select,textarea,option").bind("change", validateForm );	
	validateForm();
	
 });
 
 
function ErrorAutoPopup(){
	//autopopup is true
	if ($.cookie('error_autopopup') == 'true') {
		$.cookie('error_autopopup', 'false' , { expires: 365 }) ;
        $('form.standardForm span.error,span.warning').fadeOut(1000);
		
	} else {
		$.cookie('error_autopopup', 'true' , { expires: 365 }) ;		
		$('form.standardForm span strong.autoError').each(function () {
			$(this).text('Auto popup : on');
		});
	}
}

String.prototype.trim = function(){
	return this.replace(/(?:^\s+|\s+$)/g, "");
}

//to prevent a submit action
$( function () {
	$("input").keypress( function(key) {
		if (key.which == 13) {
			return false;
		}
	});;

});

	
 