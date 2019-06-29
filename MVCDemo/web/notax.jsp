<jsp:useBean id="taxbean" class="mypkg.TaxBean" scope="request"/>
<html>
    <body>
        <h1>Taxation Details!</h1>
        <hr>
        <pre>
            No tax for You because your Income is this <jsp:getProperty name="taxbean" property="income"/> 
            </pre>
        <hr>
    </body>
</html>
