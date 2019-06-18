<%
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
        <hr>
        <pre>
        <a href="ShowCategories">Explore-Store</a>    
        <a href="">Search-A-Product</a>    
        <a href="">View-Cart</a>    
        <a href="">Logout</a>    
        </pre>
        <hr>
    <marquee>Attractive Discount on <%=userChoice%> Product</marquee>
    </body>
</html>
