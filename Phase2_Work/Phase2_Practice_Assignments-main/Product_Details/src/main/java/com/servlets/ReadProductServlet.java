package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.EProduct;
import com.util.Util;

/**
 * Servlet implementation class ReadProductServlet
 */
@WebServlet("/read-product")
public class ReadProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		SessionFactory sf = Util.buildSessionFactory();
		
		Session session = sf.openSession();
		
		List<EProduct> products = session.createQuery(" from EProduct").list();
		
		//Show data on HTML
		
		out.print("<h1> Product List :- </h1>");
		out.print("<style> table,td,th { border:2px solid red; padding: 10px; }</style>" );
		out.print("<table>");
		out.print("<tr>");
		out.print("<th> Product Id </th>");
		out.print("<th> Product Name </th>");
		out.print("<th> Product Price </th>");
		out.print("</tr>");
		
		for(EProduct p : products) {
			
			out.print("<tr>");
			out.print("<td>"+p.getId()+"</td>");
			out.print("<td>"+p.getName()+"</td>");
			out.print("<td>"+p.getPrice()+"</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		
		session.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
