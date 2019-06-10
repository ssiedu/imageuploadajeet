
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MetaDataDemo {
public static void main(String args[]){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib", "root", "root");
    DatabaseMetaData dbmd=con.getMetaData();
    System.out.println("-----------------");
    System.out.println(dbmd.getDatabaseProductName());
    System.out.println(dbmd.getDatabaseProductVersion());
    System.out.println(dbmd.getDriverName());
    System.out.println(dbmd.getDriverVersion());
    System.out.println("-----------------");
    String qr="select * from student";
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery(qr);
    ResultSetMetaData rsmd=rs.getMetaData();
    int n=rsmd.getColumnCount();
    System.out.println("-----------------");
    for(int i=1;i<=n;i++)
    {
        System.out.print(rsmd.getColumnName(i)+"\t");
    }
    System.out.println();
    System.out.println("-----------------");
    while(rs.next()){
        for(int i=1;i<=n;i++)
    {
        System.out.print(rs.getString(i)+"\t");
    }
    System.out.println();
    }
    System.out.println("-----------------");
    
    
    
    con.close();
    }catch(Exception e){
        
    }    
}            
}
