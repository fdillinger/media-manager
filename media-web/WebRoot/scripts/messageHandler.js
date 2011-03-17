/* display an message on top on the page.

the message can be of type:
-ok (green ticked icon)
-error (red cross icon)
*/

function showMessage(messageText,messageType) {
	msg="<div id='infoZone' class='" + messageType + "'>" + messageText + "</div>";
	$("#infoZone").remove();
	$("BODY").prepend(msg);
}

function removeMessage(){
	$("#infoZone").remove();
}