/**
 * <p>Title: BDMS Web Contracts: Select To Autocomplete</p>
 * <p>Description:  Transform a <SELECT> tag into a searchable input text </p>
 * <p>Copyright: Copyright (c) 2008</p>
 * <p>Company: Intrasoft International</p>
 * @author Francois Talleu
 * @version $Id: jquery.selectToAutocomplete.js,v 1.1 2010/04/08 10:35:19 fdillinger Exp $
 * <pre>
 * Changes
 * =======
 * Date          Author     Modification
 * 09/10/08      FTA        Creation
 * </pre>
 */
(function($){  
  $.fn.selectToAutocomplete = function(options) {  
   
	var defaults = {  
	  size: 10 ,
	  maxlength : 10,
	  change : null

	 };  
	   
	 var options = $.extend(defaults, options);  
     return this.each(function() {  
     	 searchArray = new Array();
     	 selectId = $(this).attr('id');
     	 selectName = $(this).attr('name');
     	 onChange = options.change;
     	 selectedValue = $(this).val();
     	 $(this).find("option").each(function () {
     	 	searchArray.push($(this).val());
     	 });
     	 newInput = "<input type='text' " ;
		 newInput += "id='"+selectId+"' " ;
		 newInput += "name='"+selectName+"' " ;
		 newInput += "size='"+options.size+"' ";
		 newInput += "maxlength='"+options.maxlength+ "' ";
		 newInput += "value='"+selectedValue+ "' ";
     	 newInput += " />";
     	 $("#"+selectId).replaceWith(newInput);
     	 $("#"+selectId).autocomplete( { data : searchArray });
     	 $("#"+selectId).autocomplete("result", validateForm);

//     	 $("#"+selectId).bind('change',options.change);
     	 $("#"+selectId).focus( function () {
     	 	$(this).select();
     	 });
     	 

     });  
  };  
})(jQuery);  