<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create event</title>
</head>
<body>
	<h2>Create Event</h2>
	<a href="listEvent"><button class="button-report" type="button">List Event</button></a>
	<s:form action="createEvent" method="post" namespace="/create">
	<div>
		<div style="display:inline-block;margin:10px 0;width: 200px;">When ?</div><input style="padding: 5px; width: 150px;" type="date" name="pickDate">  <input style="margin-left: 20px; padding: 5px; width: 90px;" type="time" name="pickTime">
	</div>
	<div>	
		<div style="display:inline-block;margin:10px 0;width: 200px;">What are you planning ?</div><input style="padding: 5px; width: 300px;" name="plan" />
	</div>
	<div>	
		<div style="display:inline-block;margin:10px 0;width: 200px;">Where ?</div><input style="padding: 5px; width: 300px;" name="location" />
	</div>
	<div>	
		<div style="display:inline-block;margin:10px 0;width: 200px;">More info ?</div><textarea name="info" ></textarea>
	</div>	
	<s:submit cssClass="button-register" value="Create event" />
	</s:form>
	<span style="color: red;"><s:property value="msg" /></span>
</body>
</html>