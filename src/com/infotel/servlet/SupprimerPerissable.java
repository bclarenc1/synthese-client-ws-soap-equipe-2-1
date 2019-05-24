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

@WebServlet("/SupprimerPerissable")
public class SupprimerPerissable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SupprimerPerissable() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		
		int idProduit = Integer.parseInt(request.getParameter("idProduit")); // "idPersonne" c'est celui apres le ? dans l'URL
		service.removeProduit(idProduit);
					
		Produit[] produits = service.getAllProduits();
		request.setAttribute("produits", produits);
		request.getRequestDispatcher("perissable.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}