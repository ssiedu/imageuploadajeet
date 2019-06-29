<%

    String s1=(String)session.getAttribute("errName");
    String s2=(String)session.getAttribute("errAge");
    if(s1==null){
        s1="";
    }
    if(s2==null){
        s2="";
    }
%>

<html>
    <body>
        <h1>Validation Demo!</h1>
        <hr>
        <form action="StoreData">
            <pre>
            Name <input type="text" name="t1" id="t1"/><%=s1%>
            Age  <input type="text" name="t2" id="t2"/><%=s2%>
                 <input type="submit" value="Save"/>
            </pre>
        </form>
        
        <hr>
    </body>
</html>
