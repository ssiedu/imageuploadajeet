<%
String s1=request.getParameter("t1");
String s2=request.getParameter("t2");
int amount=Integer.parseInt(s1);
int time=Integer.parseInt(s2);
int interest=0;
if(time>=5){
    interest=amount*10/100;
}else{
    interest=amount*5/100;
}
int total=amount+interest;

%>
<html>
    <body>
        <h1>Interest Details!</h1>
        <table border="2">
            <tr>
                <td>Amount</td>  
                <td><%out.println(amount);%></td>  
            </tr>
            <tr>
                <td>Time</td>  
                <td><%out.println(time);%></td>  
            </tr>
            <tr>
                <td>Interest</td>  
                <td><%out.println(interest);%></td>  
            </tr>
            <tr>
                <td>Total</td>  
                <td><%out.println(total);%></td>  
            </tr>
        </table>
    </body>
</html>
