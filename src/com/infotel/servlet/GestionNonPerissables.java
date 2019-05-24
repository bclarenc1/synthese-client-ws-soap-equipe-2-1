package com.infotel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.wssoap.Produit;
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

		Produit[] produits = service.getAllProduits();
		request.setAttribute("produits", produits);
		System.out.println("\n\n\n\n\t qzifjmzeijrmsijf;wriaqfj;moirqwfosjfiw;soijvoijr \n\n\n\n");
		System.out.println(produits);
		request.getRequestDispatcher("test.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}