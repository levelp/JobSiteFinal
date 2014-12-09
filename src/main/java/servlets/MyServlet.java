package servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 *
 */
public class MyServlet extends javax.servlet.http.HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    /**
     * Ответ на GET-запрос
     *
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws IOException
     */
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("Protocol: " + request.getProtocol());

        response.setCharacterEncoding("UTF-8");
        ServletOutputStream out = response.getOutputStream();

        Map<String, String[]> map = request.getParameterMap();
        if (map.size() == 2) {
            double a = Double.parseDouble(map.get("a")[0]);
            double b = Double.parseDouble(map.get("b")[0]);
            out.println("Sum: " + a + " + " + b + " = " + (a + b));
        }

        out.println("Protocol: " + request.getProtocol());
        out.println("URI: " + request.getRequestURI());
    }
}
