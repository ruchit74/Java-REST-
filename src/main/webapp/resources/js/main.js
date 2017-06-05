


$(function() {
	
	$("input[type=hidden]").val('');
	$("#carddigits").val('');
	$("#cardname").val('');
	
	$('#select').on('change', function() {
		if (this.value == '0')

		{
			$("#option1").show();
		} else {
			$("#option1").hide();
		}
		if (this.value == '1')

		{
			$("#option2").show();
		} else {
			$("#option2").hide();
		}
		
	});
});


$(document).on('click', 'button[id="submit"]', function(e) {
	
	
	if($("#carddigits").val().length>0){
		$("input[type=hidden]").val($("#carddigits").val());
		
		
	}
	if($("#cardname").val().length>0){
		$("input[type=hidden]").val($("#cardname").val());
	}
	});


