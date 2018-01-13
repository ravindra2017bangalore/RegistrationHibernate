  
<%@page import="com.rv.mypack.UserDao"%>
<jsp:useBean id="obj" class="com.rv.mypack.User">  
</jsp:useBean>  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
int i=UserDao.register(obj);  
if(i>0)  
out.print("You are successfully registered");  
  
%>  
</body>
</html>