 <%@ include file="/WEB-INF/jsp/includes.jsp"%>
<html>
<head>
<title>Success Page</title>
</head>
<body>
User Details
<hr>
User Name   : ${user.name} 

Gender      : ${user.gender} 

Country     : ${user.country} 

About You   : ${user.aboutYou} 

Community   : ${user.community[0]}  ${user.community[1]} ${user.community[2]}

Mailing List: ${user.mailingList} 
</body>
</html>
