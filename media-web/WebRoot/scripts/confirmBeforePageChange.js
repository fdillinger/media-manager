/*
 * When this script is included on a page,
 * it disable all the navigation. mainly used for a wizard when
 * we dont want the user to loss any data by clicking a navigation link
 */


// when the contract is saved, this var should be set to true, then
// the confirmation message will not appear anymore
// this var is put to false when a change event is detected on any input
// in the form. (onchange event binded in formValidation.js)
var formSaved = false;

$(document).ready(function(){

	$("#navigation a, .header a").each(function() {
		url = $(this).attr("href");
		if (! $(this).is(".excludeChangePageConfirm") && (url != "#" )) {
			newurl = "javascript:changePageConfirm('"+url+"')";
			$(this).attr("href",newurl);
		}
	})
	
	// map the event to the exit button
	$("#exitWizard").bind("click", exitPageConfirm );
	

});

function changePageConfirm(destinationUrl){
	if (! formSaved ) {
		if (confirm(awardedContract_notSavedConfirmMessage)) {
			window.location=destinationUrl;
		}
	} else {
		window.location=destinationUrl;
	}
}

function exitPageConfirm()
{
    if (confirm(awardedContract_notSavedConfirmMessage)) {
		 window.location='AwardedContractList.do';
	}
}
