/*
Handle the ajax search economic operator

* 
* Global variable to memorize the search criteria
*/
eoName = '';
eoTitle = '';
eoReference = '';
oldeoName = '';
oldeoTitle = '';
oldeoReference = '';

searchCount =0;

function searchEconomicOperator() {
	eoName = $("#iName").val();
	eoTitle = $("#iTitle").val();
	eoReference = $("#iReference").val();
	
	/*
	we do the search 500ms after the last keystroke
	only if one of the text input has changed
	*/

	if ( eoName != oldeoName || eoTitle != oldeoTitle || eoReference != oldeoReference ) {
		searchCount++;
		setTimeout(function(){
			searchCount--;
			if ( searchCount == 0 ) {
				search();			
			}
		},500);

		/* 
		memorize the last search so we do not make twice the same search
		*/
		oldeoName = eoName;
		oldeoTitle= eoTitle;
		oldeoReference = eoReference;
	}
}

function search() {
	/*
	do the ajax search. searchEconomicOperatorResult is called
	when the search is done.
	*/
	lurl = "SearchEconomicOperator.do?";
	lurl += "name="+eoName;
	lurl += "&title="+eoTitle;
	lurl += "&reference="+eoReference;
	lurl += "&lotIndex="+lotIndex; //lotIndex created in the main jsp header

	 
	$.ajax({
		  url: lurl,
		  async: true,
		  datatype: "html",
		  success: searchEconomicOperatorResult
	 });
}

function searchEconomicOperatorResult(XMLHttpRequest, textStatus) {
	/*
	Delete the result of the previous search if any.
	*/
 	$("#searchResult").empty();
 	
	/*
	inject the search result inside DIV id=searchResult
	*/
	$("#searchResult").append(XMLHttpRequest);	

	doSearch = false;		
}