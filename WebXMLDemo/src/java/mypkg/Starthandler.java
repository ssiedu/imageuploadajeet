package mypkg;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Starthandler implements ServletContextListener {
    Connection con;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "root");
            ServletContext context=sce.getServletContext();
            context.setAttribute("datacon", con);
        }catch(Exception e){
            
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try{
         con.close();
        }catch(Exception e){
            
        }
    }
}
