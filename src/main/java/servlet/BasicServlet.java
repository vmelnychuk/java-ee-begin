package servlet;

import org.apache.log4j.Logger;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class BasicServlet extends GenericServlet {
    final static Logger logger = Logger.getLogger(BasicServlet.class);
    @Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {
        logger.info("call service()");
        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();
        out.println("Hello there");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        logger.info("call init(ServletConfig config)");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        logger.info("call init()");
    }
}
