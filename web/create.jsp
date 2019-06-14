<%-- 
    Document   : create
    Created on : Jun 14, 2019, 8:54:46 PM
    Author     : duy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create event</title>
    </head>
    <body>
        <s:form action="saveEvent">
        <s:push value="event">
            
            <s:textfield name="planning" label="planning" />
            <s:textfield name="address" label="address" />
            <s:textfield name="info" label="info" />
            <s:submit />

        </s:push>

    </s:form>
    </body>
</html>
