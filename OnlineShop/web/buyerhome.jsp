<%
    int n=session.getMaxInactiveInterval();
    long val=session.getCreationTime();
    java.util.Date dt=new java.util.Date(val);
Cookie ck[]=request.getCookies();
String userChoice="All";
String userName=(String)session.getAttribute("username");
if(userName==null){
    response.sendRedirect("index.jsp");
}
for(Cookie c:ck){
    String name=c.getName();
    if(name.equals("choice")){
        userChoice=c.getValue();
    }
}


%>
<html>
    <body>
        <h1>Buyer-Page!</h1>
        <h2>Welcome <%=userName%></h2>
        <h3>You are on this site since <%=dt.toString()%></h3>
        <h3>If you are idle for <%=n%> sec your session will expire</h3>
        <hr>
        <pre>
        <a href="ShowCategories">Explore-Store</a>    
        <a href="">Search-A-Product</a>    
        <a href="DisplayCart">View-Cart</a>    
        <a href="">Logout</a>    
        </pre>
        <hr>
    <marquee>Attractive Discount on <%=userChoice%> Product</marquee>
    </body>
</html>
