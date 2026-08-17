import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
*
* @author Beena
*/
@WebServlet (name = "ReadingNonBlockingServlet", urlPatterns =
{"/ReadingNonBlockingServlet"},asyncSupported = true )
public class ReadingNonBlockingServlet extends HttpServlet {
@Override
 protected void service(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 response.setContentType("text/html");
 AsyncContext ac = request.startAsync();
 ServletInputStream in=request.getInputStream();
 in.setReadListener(new ReadingListener(in,ac));
 }
}