
package filedownloadapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletOutputStream;
import java.io.InputStream;
import jakarta.servlet.ServletContext;




public class DownloadServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/octet-stream");
        
        String filename = request.getParameter("filename");
        ServletContext context = getServletContext();
            InputStream is = context.getResourceAsStream("/WEB-INF/"+filename);
            ServletOutputStream out = response.getOutputStream();
            //PrintWriter out=response.getWriter();
            response.setHeader("Content-Disposition","attachment; filename=\""+filename+"\"");
            
            int i;
            
                    while ((i=is.read()) != -1){
                        out.write(i);
                    }
                    is.close();
                    out.close();
    }

}
