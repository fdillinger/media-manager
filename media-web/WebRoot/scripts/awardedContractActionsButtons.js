/*
 * Handle award and lot manipulations on the UI, and also ajax calls.
 * - delete a lot
 * - copy to/from lot/contractors
 * - save contract
 * 
 */

//  jquery events mapping for the copy lot area (copy from,to,lot,contractors)
$(document).ready(function() {
	$("#lotActionButtonPanel").bind("click", visibleLotActionPanel); 
	$("#lotActionButtonPanel,#lotActionPanel").bind("mouseout", bindClick); 
	$("#lotActionButtonPanel,#lotActionPanel").bind("mouseover", unbindClick); 
	
	/* necessary for Internet Explorer 7 */
	$("#copyToLot, #copyFromLot, #copyContractorToLot, #copyContractorFromLot").bind("click", unbindClick); 
	
	//map the delete button
	$("#deleteLot").bind("click" , function() {
		if (confirm(lotManagement_deleteConfirmationMessage)) {
			destinationUrl = "AwardedContractActions.do?action=deleteLot&lotIndex="+lotIndex;
			window.location=destinationUrl;
		}
	});



	//map the save button and handle the ajax request and loader messages
	$("#saveContract,#saveContractAndClose").bind("click" , function() {
		destinationUrl = "#";
		buttonName = $(this).attr("id");
		$.ajax({
			url: "AwardedContractActions.do?action=save",
			
		    beforeSend: function(){
		      showMessage(saveWaitingMessage,"loader");
		      $("#"+buttonName).attr('disabled',true);
		    },
		    error: function(error){
		      if ( error.responseText.match(/ContractReferenceAlreadyExistsException/)) {
			      showMessage("Cannot save the contract : the choosen contract reference already exists","error");
		      } else {
			      showMessage("An error occured while saving the contract","error");
		      }
		    },
		    success: function(data){
		    	//we update the global var located in confirmBeforePageChange.js
		    	//so we do not trigger the confirm before save message anymore
		    	contractId =$(data).text();
		    	formSaved = true;
		    	msg = successfullySaved + "<br/>";
		    	msg += "<a href='AwardedContractSummary.do?contractId="+contractId+"'>" + linkToSummaryPage + "</a>";
		    	if (buttonName == 'saveContract') {
			      	showMessage(msg,"ok"); 
		    	} else {
		    		window.location = 'AwardedContractSummary.do?contractId=' + contractId;
		    	}
		    },
		    complete: function(){
		      // ajax loader end.
		      $("#"+buttonName).attr('disabled',false);
		    }
		 });
		
	});
}); 
	
//function used by the lot management UI

function visibleLotActionPanel() {
	$("#lotActionPanel").attr('class','show');
}

function bindClick() {
    /* alert('bindClick'); */
    $("BODY").bind("click", unvisibleLotActionPanel); 
}

function unbindClick() {
    /* alert('unbindClick'); */
    $("BODY").unbind("click", unvisibleLotActionPanel);
}

function unvisibleLotActionPanel(){
   $("#lotActionPanel").attr('class','hide');
}
