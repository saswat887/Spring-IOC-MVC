package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Additon extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int n1=Integer.parseInt(req.getParameter("first"));
		int n2=Integer.parseInt(req.getParameter("second"));
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		pw.print(n1+n2);
	}

}
