$(function() { 
//Object should not be in uppercases
	$("#object").bind('keyup focus', function() {
		upchars = $(this).val().replace(/[^A-Z]/g, "").length;
		lowchars = $(this).val().replace(/[^a-z]/g, "").length;
		if ( upchars > 2 && upchars > lowchars) {
			
		 	if ( $("#objectError").size() == 0) {
			 	msgWithSpan = '<span class="warning" id="objectError" style="margin-bottom:0px">' + award_objectNotUppercase + '</span>';
			 	$(this).before(msgWithSpan);
		 	}				
		} else {
			if ( $("#objectError").size() > 0) {
				$("#objectError").remove();
			}
		}
	});
});		
