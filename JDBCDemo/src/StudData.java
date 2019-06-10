
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudData {
public static void main(String args[]){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib", "root", "root");
    Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
    ResultSet rs=stmt.executeQuery("select * from student");
    while(rs.next()){
     System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
    }
    rs.absolute(2);
    System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
        con.close();
    }catch(Exception e){
        
    }    
}        
}
