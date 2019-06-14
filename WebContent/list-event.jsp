<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>List Event</title>
<style>
table, td, th {border: 1px solid black;}
table {border-collapse: collapse;width: 60%;}
th {height: 30px;}
.button-update {background-color: #008CBA;color: white;}
.button-delete {background-color: red;color: white;}
</style>
</head>
<body>
	<h2>List Event</h2>
	<div style="margin-top: 40px;">
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>Time</th>
						<th>Plan</th>
						<th>Location</th>
						<th>Info</th>
					</tr>
				</thead>
				<s:iterator value="eventList">
					<tr>
						<td><s:property value="time" /></td>
						<td><s:property value="plan" /></td>
						<td><s:property value="location" /></td>
						<td><s:property value="info" /></td>
					</tr>
				</s:iterator>
			</table>
	</div>
</body>
</html>