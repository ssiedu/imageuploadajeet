
import java.sql.Connection;
import java.sql.DriverManager;
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
public class UpdateData {
    public static void main(String args[]){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver Loaded");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib", "root", "root");
    System.out.println("Connected");
    String qr="update student set sname='FFF',marks=80 where rollno=3";
    Statement stmt=con.createStatement();
    stmt.executeUpdate(qr);
    System.out.println("Record Updated");
        con.close();
    }catch(Exception e){
        
    }    
}    
}
