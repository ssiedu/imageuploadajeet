<html>
    <script>
        function checkAll(){
            var v1=checkName();
            var v2=checkAge();
            return v1&&v2
        }
        function checkName(){
            var v1=document.getElementById("t1").value;
            if(v1.length==0){
                alert("Name Cann't be Blank");
                return false;
            }else{
                return true;
            }
        }
        function checkAge(){
            var v1=document.getElementById("t2").value;
            if(isNaN(v1)==true){
                alert("Age must be a number");
                return false;
            }else{
                return true;
            }
        }
    </script>
    <body>
        <h1>Validation Demo!</h1>
        <hr>
        <form action="SaveUser" onsubmit="return checkAll()">
            <pre>
            Name <input type="text" name="t1" id="t1"/>
            Age  <input type="text" name="t2" id="t2"/>
                 <input type="submit" value="Save"/>
            </pre>
        </form>
        
        <hr>
    </body>
</html>
