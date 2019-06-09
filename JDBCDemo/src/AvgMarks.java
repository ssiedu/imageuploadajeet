
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class AvgMarks {
    public static void main(String args[]){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib", "root", "root");
    String qr="select sname,marks from student where marks<(select avg(marks) from student)";
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery(qr);
    while(rs.next()){
     System.out.println(rs.getString(1)+","+rs.getString(2));
    }
    
        con.close();
    }catch(Exception e){
        
    }    
}    
}
