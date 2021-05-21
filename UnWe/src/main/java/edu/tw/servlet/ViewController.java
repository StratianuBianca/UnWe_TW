package edu.tw.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

@WebServlet(name = "ViewServlet", value = "api/view/")
public class ViewController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
       Enumeration<String> attributes= request.getAttributeNames();
       while (attributes.hasMoreElements()){
           System.out.println(attributes.nextElement());
       }
    }

}
