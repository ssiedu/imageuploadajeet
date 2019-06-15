<html>
    <body>
        <h1>Online Shopping!</h1>
        <hr>
        <form action="VerifyUser">
            <pre>
            Userid      <input type="text" name="userid"/>
            Password    <input type="password" name="password"/>
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
