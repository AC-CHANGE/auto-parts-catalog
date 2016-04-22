<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>

    <title><tiles:getAsString name="title"/></title>

</head>
<body>
    <tiles:insertAttribute name="body"/>

<br><br>
<center>
    <tiles:insertAttribute name="footer"/>
</center>

</body>
</html>
