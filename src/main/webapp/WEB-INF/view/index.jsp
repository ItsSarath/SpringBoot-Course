<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<head>
<title>Spring Boot</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $("#submit").click(function(e){
        $("#selectLable").html("Clicked");
        event.preventDefault();
        var formData = {serviceName : $("#service option:selected").val()};
        $.ajax({
        	contentType : "application/json",
        	type : "POST",
        	url : window.location + "api/process",
        	data : JSON.stringify(formData),
        	dataType : 'json',
        	success : function(result){
        		alert("SUCCESS");
        		$("#selectLable").html(result.serviceName);
        	},
        	error : function(e){
        		alert("Error");
        	}
        });
    });
});
</script>
</head>
<html lang="en">
<body>
    <div>
        <div>
        <form id="serviceForm">
            <h2>Hello ${message}</h2>
             
            Click on this <strong><a href="next">link</a></strong> to visit another page.
            <p> Ajax example</p>
            <label for="serviceName">Service Name:</label><select id="service">
            <option value="Service1">Service1</option>
            <option value="Service2">Service2</option>
            </select>
            <button type="submit" value="Submit" id="submit">Submit</button>
            <label id="selectLable"></label>
            </form>
        </div>
    </div>
</body>
</html>