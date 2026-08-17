import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet; // 1. Imported WebServlet annotation
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Nirmal
 */
// 2. Added annotation to route URL requests here and prevent 405 error
@WebServlet(name = "NonBlockingServlet", urlPatterns = {"/NonBlockingServlet"})
public class NonBlockingServlet extends HttpServlet {

    // 3. Overrode doGet to catch standard browser requests
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    // 4. Overrode doPost to catch form submissions if any
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<h1>File Reader</h1>");
            String filename = "/WEB-INF/booklist.txt";
            ServletContext c = getServletContext();
            InputStream in = c.getResourceAsStream(filename);
            String path = "http://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/ReadingNonBlockingServlet";
            URL url = new URL(path);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setChunkedStreamingMode(2);
            conn.setDoOutput(true);
            conn.connect();
            
            if (in != null) {
                InputStreamReader inr = new InputStreamReader(in);
                BufferedReader br = new BufferedReader(inr);
                String text = "";
                System.out.println("Reading Started...");
                
                // Open network output stream to the reading servlet
                try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()))) {
                    while ((text = br.readLine()) != null) {
                        out.print(text + "<br>"); // Prints to browser window
                        
                        // 5. CRITICAL FIX: Write line to the network stream 
                        bw.write(text + "\n"); 
                        
                        try {
                            Thread.sleep(1000);
                            out.flush();
                        } catch (InterruptedException ex) {
                            out.print("reading completed....");
                        }
                    }
                    bw.flush(); // Ensure last bits of data leave buffer
                }
                out.print("reading completed....");
            } else {
                out.print("Error: booklist.txt not found in WEB-INF.");
            }
            
            // 6. CRITICAL FIX: Forces connection to execute and stream data 
            conn.getResponseCode(); 
        }
    }
}