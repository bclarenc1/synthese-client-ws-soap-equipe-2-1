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

@WebServlet("/AjouterNonPerissable")
public class AjouterNonPerissable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AjouterNonPerissable() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		
		if (request.getParameter("nomProduit") != null) {

			String nomProduit = request.getParameter("nomProduit");
			int stock = Integer.parseInt(request.getParameter("stock"));
			double prix = Double.parseDouble(request.getParameter("prix"));
			String modeDemploi = request.getParameter("modeDemploi");
					
			service.addNPerissable(nomProduit, stock, prix, modeDemploi);
		}
		
		Produit[] produits = service.getAllProduits();
		request.setAttribute("produits", produits);
		request.getRequestDispatcher("nonPerissable.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}