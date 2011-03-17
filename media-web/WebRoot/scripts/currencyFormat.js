function formatCurrency(num,precision) {
	// handling a default value for precision(2)
	var precision = ( precision == null ) ? 2 : precision;
	var precisionMultiplier = Math.pow(10,precision);
	var num = new String(num);
	num = num.toString().replace(/\$|\,/g,'');
	
	isNotNumber = false;

	if (num == '' ) {
		isNotNumber = true;	
	}
	
	if(isNaN(num)) {
		num = "0";
		isNotNumber = true;
	}
	
	sign = (num == (num = Math.abs(num)));
	num = Math.floor(num*precisionMultiplier+0.50000000001);
	cents = num%precisionMultiplier;
	num = Math.floor(num/precisionMultiplier).toString();
	if(cents<10) cents = "0" + cents;
	
	for (var i = 0; i < Math.floor((num.length-(1+i))/3); i++)

	num = num.substring(0,num.length-(4*i+3))+' '+
	num.substring(num.length-(4*i+3));
	
	if ( isNotNumber ) {
		return '0.00';
	} else {
		return (((sign)?'':'-')  + num + '.' + cents);
	}
}

function formatExchangeRate(num) {
	return num.toFixed(5);
	/*var num = new String(num);
	num = num.toString().replace(/\$|\,/g,'');
	isNotNumber = false;

	if (num == '' ) {
		isNotNumber = true;	
	}
	
	if(isNaN(num)) {
		num = "0";
		isNotNumber = true;
	}
	
	pos = num.lastIndexOf('.');
	if( pos != -1)
	{
		num_dec = num.substr(pos+1,5);
		num_prec = num.substr(pos+1+5,1);
		num_prec = parseInt(num_prec);
		if( num_prec > 5 )
		{
			num_dec = parseInt(num_dec);
			num_dec = num_dec + 1;
		}
		num = num.substr(0,pos);
		return num + "." + num_dec;
	}
		return num + ".00000";*/
}

function unFormatCurrency(num)
{
	var rebuildNum = "";
	var num = new String(num);
	num = num.toString().replace(/\$|\,/g,'');
	
	if (num == '' ) {
		return rebuildNum;
	}
	
	for( indice = 0; indice < num.length; indice++)
	{
		if( num.charAt(indice) != " " )
		{
			rebuildNum += num.charAt(indice);
		}
	}

	if(isNaN(rebuildNum)) {
		return '';
	}
	
	//throw new Exception("pol");
	return rebuildNum;
}
