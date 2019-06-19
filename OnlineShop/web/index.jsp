<%
    session.setMaxInactiveInterval(150);
String v1="",v2="";
Cookie ck[]=request.getCookies();
if(ck!=null){
  for(int i=0;i<ck.length;i++){
      Cookie c=ck[i];
      String name=c.getName();
      if(name.equals("uid")){
          v1=c.getValue();
      }else if(name.equals("pwd")){
          v2=c.getValue();
      }
  }  
}


%>

<html>
    <body>
        <h1>Online Shopping!</h1>
        <hr>
        <form action="VerifyUser">
            <pre>
            Userid      <input type="text" name="userid" value="<%=v1%>"/>
            Password    <input type="password" name="password" value="<%=v2%>"/>
            Usertype    <select name="usertype">
                        <option>buyer</option>
                        <option>admin</option>
                        </select>
            Save-Password <input type="checkbox" name="save"/>
                        
                        <input type="submit" value="Login"/>
            </pre>
        </form>
        <hr>
        <a href="registration.jsp">New-User</a>
    </body>
</html>
