$(document).ready(function() {
	
	$('#thebutton').load("/webjars/thebutton/html/thebutton.html", function() {
		$('#thebutton a.btn').click(function() {
			$.ajax({
				url : "/thebutton/click/count"
			}).then(function(data) {
				$('#thebutton-message').html(data.message);
			});
		});
	});

});