import java.sql.*;
public class Demo {
    public static void main(String args[])
    {
    System.out.println(ResultSet.TYPE_FORWARD_ONLY);    
    System.out.println(ResultSet.TYPE_SCROLL_SENSITIVE);
    System.out.println(ResultSet.CONCUR_READ_ONLY);
    System.out.println(ResultSet.CONCUR_UPDATABLE);
    }
}
