// when the classification is changed, we update the category			
$(function() { 
	$("#autor").bind("change" , function() {
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