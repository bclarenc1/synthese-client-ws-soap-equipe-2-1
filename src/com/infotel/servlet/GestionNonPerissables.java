package com.infotel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.wssoap.Perissable;
import com.infotel.wssoap.ProduitSOAPService;
import com.infotel.wssoap.ProduitSOAPServiceProxy;

/**
 * Servlet implementation class GestionNonPerissables
 */
@WebServlet("/GestionNonPerissables")
public class GestionNonPerissables extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GestionNonPerissables() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		// getAttribute des params du nonperissable
//		NonPerissable np = service.addNonPerissable();
//		request.setAttribute("nonperissable", np);
//		System.out.println(np);
//		request.getRequestDispatcher("index.jsp").forward(request, response);
//	 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}