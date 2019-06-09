
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SSI STUDENT
 */
public class ShowStud {
    public static void main(String args[]){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib", "root", "root");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from student");
    while(rs.next()){
     System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
    }
    
        con.close();
    }catch(Exception e){
        
    }    
}    
}
