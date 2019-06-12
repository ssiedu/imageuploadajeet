
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
    PrintWriter out=response.getWriter();
    out.println("Welcome to get Method");
}
public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
    PrintWriter out=response.getWriter();
    out.println("Welcome to post Method");
}

}
