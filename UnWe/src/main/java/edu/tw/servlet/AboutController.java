package edu.tw.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet(name = "AboutServlet", value = "/about/*")
public class AboutController extends HttpServlet {
}
