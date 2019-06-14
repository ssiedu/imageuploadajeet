<html>
    <body>
        <h1>Income Tax Dept!</h1>
        <h3>Detail Submission Form</h3>
        <form action="TaxProcessor">
            <pre>
            Income  <input type="text" name="t1"/>
            Age     <input type="text" name="t2"/>
            Occup   Service <input type="radio" name="r1" value="service" checked="checked"/> Business <input type="radio" name="r1" value="business"/>
            NRI     <input type="checkbox" name="c1" value="yes"/>
            Assets  <select name="t3" size="3" multiple="multiple">
                    <option>Plot</option>
                    <option>Flat</option>
                    <option>Car</option>
                    <option>Shares</option>
                    <option>Gold</option>
                    </select>
                    <input type="submit" value="Find-Tax"/>
            </pre>
        </form>
    </body>
</html>
