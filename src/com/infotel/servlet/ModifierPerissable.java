package com.infotel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.wssoap.Perissable;
import com.infotel.wssoap.Produit;
import com.infotel.wssoap.ProduitSOAPService;
import com.infotel.wssoap.ProduitSOAPServiceProxy;

@WebServlet("/ModifierPerissable")
public class ModifierPerissable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ModifierPerissable() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		
		long idProduit = Long.parseLong(request.getParameter("idProduit"));
		Perissable np = (Perissable) service.getProduit(idProduit);
		
		request.setAttribute("idProduit", np.getIdProduit());
		request.setAttribute("stock", np.getStock());
		request.setAttribute("prix", np.getPrix());
		
		Produit[] produits = service.getAllProduits();
		request.setAttribute("produits", produits);
		request.getRequestDispatcher("perissable.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}