package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title>Hi</title></head>");
        out.println("<body><h1>Hello</h1></body>");
        out.println("</html>");
    }

    @Override
    protected long getLastModified(HttpServletRequest req) {
        return new Date().getTime();
    }

    @Override
    public String getServletInfo() {
        return "Simple Hello World servlet";
    }
}
