package servlets;

import javax.servlet.ServletOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * Created by darya on 09/12/14.
 */
public class MyServlet extends javax.servlet.http.HttpServlet {
//ответ на post запрос
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
//ответ на get запрос
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        System.out.println("Protocol: " + request.getProtocol());

        ServletOutputStream out = response.getOutputStream();

        Map<String, String[]> map = request.getParameterMap();
        if(map.size() == 2) {
            double a = Double.parseDouble(request.getParameter("a"));
            double b = Double.parseDouble(request.getParameter("b"));
            out.println("Sum:" + a + "+" + b + "=" + (a+b));

        }


        out.println("Protocol: " + request.getProtocol());
        out.println("URL: " + request.getRequestURI());

    }
}
