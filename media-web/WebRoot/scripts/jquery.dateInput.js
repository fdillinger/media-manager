/**
 * <p>Title: BDMS Web Contracts: Make the date typing easier</p>
 * <p>Description:  To be able to enter the date with dots : 21.10.08
 * as soon as a dot is inserted in the input, we replace it by a slash.
 * 
 * </p>
 * <p>Copyright: Copyright (c) 2008</p>
 * <p>Company: Intrasoft International</p>
 * @author Francois Talleu
 * @version $Id: jquery.dateInput.js,v 1.1 2010/04/08 10:35:20 fdillinger Exp $
 * <pre>
 * Changes
 * =======
 * Date          Author     Modification
 * 23/11/08      FTA        Creation
 * </pre>
 */
(function($){  
  $.fn.dateInput = function(options) {  
   
     return this.each(function() {  

     	 $(this).keypress( function(key) {
			if (key.which == 46) { //46 is the keycode for the dot : . 
				$(this).val($(this).val()+'/');
				return false;
			};
		 });
     });  
  };  
})(jQuery);  