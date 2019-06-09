
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddData {
public static void main(String args[]){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver Loaded");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib", "root", "root");
    System.out.println("Connected");
    String qr="insert into student values(1,'AAA',55)";
    Statement stmt=con.createStatement();
    stmt.executeUpdate(qr);
    System.out.println("Record Added");
        con.close();
    }catch(Exception e){
        
    }    
}    
}
