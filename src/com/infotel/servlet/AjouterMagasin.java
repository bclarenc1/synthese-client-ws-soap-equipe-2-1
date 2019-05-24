package com.infotel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.wssoap.Magasin;
import com.infotel.wssoap.ProduitSOAPService;
import com.infotel.wssoap.ProduitSOAPServiceProxy;

@WebServlet("/AjouterMagasin")
public class AjouterMagasin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AjouterMagasin() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		
		if (request.getParameter("nomMagasin") != null) {

			String nomMagasin = request.getParameter("nomMagasin");
			int codeMagasin = Integer.parseInt(request.getParameter("codeMagasin"));
			double prixLocal = Double.parseDouble(request.getParameter("prixLocal"));
					
			service.addMagasin(nomMagasin, codeMagasin, prixLocal);
		}
		
		Magasin[] magasins = service.getAllMagasins();
		request.setAttribute("magasins", magasins);
		System.out.println(magasins);
		request.getRequestDispatcher("magasin.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}





