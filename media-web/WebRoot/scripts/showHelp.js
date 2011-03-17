/* Makes the contextual help works.     Author. ftalleu
  Jquery code to bind the <span class='help'
  with focus and click events to show the help
  when a user click on a field
 */


/*    (function) is here to makes the code run after the complete loading
    of the page.
 */
 

$(function() {
 
    
    //help cookie initialisation
    if ($.cookie('help_autopopup') == null) {
    	$.cookie('help_autopopup','true', { expires: 365 });
    }
    
    /* css selector
     * bind a function on the 'focus' and 'click' event on
     * all inputs (textarea, select) that are in the form
    */
    $('form.standardForm p input:text,input:radio,input:file,textarea,select,options').bind('focus',
        function(e) {
            /* function called after a focus or click on a form field.
             * 'this' keyword contain the current input. from this
input, we go the parent,
             * then we search for a span tag that has a class "help".
             * by default span.help is hidden. to make the help displayed
             * on the screen we call the 'slideDown' jquery effet that makes
             * the help appears in 300 ms
             */
            if ($.cookie('help_autopopup') == 'true') {
	            $('form.standardForm p span.help').slideUp(100);
	            spanContent =
	$(this).parent().find("span.help").text().replace(/\W/g,"");
	            if ( spanContent != '') {
	                //we only show span with no empty content
	                $(this).parent().find("span.help").slideDown(300);
	            }
            }
        }
    );

    /* Here we bind the blur event to a function that makes
     * the help disappear
     */
    $('input.helpButton').bind('click', showHideHelp);
    
    /* we bind the autopup switch button on helps
     */
    if ($.cookie('help_autopopup') == 'true') {
	    popupButton = "<strong class='auto'>" + autopopup + "</strong>";
    } else {
	    popupButton = "<strong class='auto'>" + autopopup + "</strong>";
    }
    $('form.standardForm p span.help').append(popupButton);
    $('form.standardForm p span.help strong.auto').bind('click', function () {
    	helpAutoPopup();
    });
    
    popupButton = "<strong class='close'>Close</strong>";
    $('form.standardForm p span.help').prepend(popupButton);
    $('form.standardForm p span.help strong.close').bind('click', function () {
        $(this).parent().slideUp(50);
    });

});

function showHideHelp(){
    visibility = $(this).parent().find("span.help:visible").size();
    if (visibility == 1 ) {
        $(this).parent().find("span.help").slideUp(50);
    } else {
        $(this).parent().find("span.help").slideDown(100);
    }
}

function helpAutoPopup(){
	//autopopup is true
	if ($.cookie('help_autopopup') == 'true') {
		$.cookie('help_autopopup', 'false' , { expires: 365 }) ;
        $('form.standardForm p span.help').fadeOut(1000);
		$('form.standardForm p span.help strong.auto').each(function () {
			$(this).text('Auto popup : off');
		});
		
	} else {
		$.cookie('help_autopopup', 'true' , { expires: 365 }) ;		
		$('form.standardForm p span.help strong.auto').each(function () {
			$(this).text('Auto popup : on');
		});
	}
}

