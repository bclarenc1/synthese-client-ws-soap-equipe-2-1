package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.wssoap.ProduitSOAPService;
import com.infotel.wssoap.ProduitSOAPServiceProxy;

/**
 * Servlet implementation class GestionPerissables
 */
@WebServlet("/GestionPerissables")
public class GestionPerissables extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public GestionPerissables() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		// getAttribute des params du perissable
//		Perissable pe = service.addPerissable();
//		request.setAttribute("perissables", pe);
//		System.out.println(pe);
//		request.getRequestDispatcher("index.jsp").forward(request, response);
//	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}