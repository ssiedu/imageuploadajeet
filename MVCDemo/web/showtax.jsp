<jsp:useBean id="taxbean" class="mypkg.TaxBean" scope="request"/>
<html>
    <body>
        <h1>Taxation Details!</h1>
        <hr>
        <pre>
            Income <jsp:getProperty name="taxbean" property="income"/>
            Age    <jsp:getProperty name="taxbean" property="age"/>
            Tax    <jsp:getProperty name="taxbean" property="tax"/>
        </pre>
        <hr>
    </body>
</html>
