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

@WebServlet("/ModifierMagasin")
public class ModifierMagasin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ModifierMagasin() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProduitSOAPService service = new ProduitSOAPServiceProxy();
		
		long idMagasin = Long.parseLong(request.getParameter("idMagasin"));
		Magasin m = service.getMagasin(idMagasin);

		request.setAttribute("nomMagasin", m.getNomMagasin());
		request.setAttribute("codeMagasin", m.getCodeMagasin());
		request.setAttribute("prixLocal", m.getPrixLocal());
		
		Magasin[] magasins = service.getAllMagasins();
		request.setAttribute("magasins", magasins);
		System.out.println(magasins);
		request.getRequestDispatcher("magasin.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}