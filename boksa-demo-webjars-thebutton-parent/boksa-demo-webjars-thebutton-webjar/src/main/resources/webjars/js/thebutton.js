$(document).ready(function() {
	
	$('#thebutton').load("/webjars/thebutton/html/thebutton.html");
	
	$('#thebutton').click(function() {
		$.ajax({
			url : "/thebutton/click/count"
		}).then(function(data) {
			$('#thebutton-message').html(data.message);
		});
	});
});