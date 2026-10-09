
package testcart;
import cart.CartBeanLocal;
import cart.CartBeanLocal;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet(name = "CartTestServlet", urlPatterns = {"/CartTestServlet"})
public class CartTestServlet extends HttpServlet {
 CartBeanLocal cartBean = lookupCartBeanLocal();
 @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 response.setContentType("text/html;charset=UTF-8");
 try{
 cartBean.initialize("ABC", "123");
 }catch(Exception e){}
 cartBean.addBook("Java 8 Cookbook");
 cartBean.addBook("Enterprise Java 7 ");
 cartBean.addBook("Java for Dummies");
 cartBean.addBook("Learn Java 8");
 try (PrintWriter out = response.getWriter()) {
try{
 List<String> books = cartBean.getContents();
 for( String s : books)
 out.println(s +"<br />");
 }catch(Exception e){}
 }
 }
 private CartBeanLocal lookupCartBeanLocal() {
 try {
 Context c = new InitialContext();
 return (CartBeanLocal) c.lookup("java:global/Practical6-c/Practical6-c-ejb/CartBean!cart.CartBeanLocal");
 } catch (NamingException ne) {
 Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
 throw new RuntimeException(ne);
 }
 }
}

