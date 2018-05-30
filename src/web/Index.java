package web;

import java.io.IOException;
import java.util.ArrayList;
import model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bestel.Winkelwagen;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/index.html")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//static public Winkelwagen wagen = new Winkelwagen();
	static ArrayList<Product> voorraad = new ArrayList<>();
	{
		voorraad.add(new DefaultProduct("Koffie"   ,20  ,"koffie.jpg"   ,2));
		voorraad.add(new DefaultProduct("Thee"     ,30  ,"thee.jpg"     ,5));
		voorraad.add(new DefaultProduct("Koek"     ,15  ,"koek.jpg"     ,1));
		voorraad.add(new KwantumKorting("Sojamelk" ,25  ,"sojamelk.jpg" ,3));
		voorraad.add(new DefaultProduct("IJs"      ,5   ,"ijs.jpg"      ,4));
		voorraad.add(new KwantumKorting("Pinda's"  ,20  ,"pindas.png"   ,2));
		voorraad.add(new DefaultProduct("Chips"    ,83  ,"chips.jpg"    ,6));
		voorraad.add(new DefaultProduct("Kopje"    ,20  ,"kopje.jpg"    ,1));
		voorraad.add(new Beperkt       ("Luiers"   ,100 ,"luiers.jpg"   ,3));
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("<html><head><link rel=\"stylesheet\" href=\"style.css\"></head><body>");
		HttpSession session = request.getSession();
		
		if (session.getAttribute("winkelwagen") == null) {
			session.setAttribute("winkelwagen", new Winkelwagen());
		}
		
		
		
		response.getWriter().append("<div class=\"grid-container\">");
		response.getWriter().append("<div class=\"header\"><h1>Welkom in de webshop</h1></div>");
		response.getWriter().append("<div class=\"content\"><table><th>Product</th><th>Prijs</th><th>Per</th>");
		int id=0;
		for (Product p : voorraad) {
			response.getWriter().append("<tr><td><a href=\"product?id=" + id + "\">" + p.getNaam() + "</a></td>");
			response.getWriter().append("<td>" + p.getPrijsPerEenheid() + "</td>");
			response.getWriter().append("<td>" + p.getEenheidNaam() + "</td></tr>");
			id++;
		}
		
		response.getWriter().append("</table></div>");
		response.getWriter().append("<div class=\"picture\">");
		response.getWriter().append("<img src=\"webshop.png\">");
		response.getWriter().append("</div>");
		
		response.getWriter().append("<div class=\"menu\">");
		response.getWriter().append("<a href=\"index.html\"> Index </a>");
		response.getWriter().append("<a href=\"winkelwagen\"> Winkelwagen </a>");
		response.getWriter().append("</div>");
		
		response.getWriter().append("<div class=\"footer\"> <p>Dit is de voettekst van de mooiste webwinkel EVER!! </div>");
		
		response.getWriter().append("</div>");
		response.getWriter().append("</body></html>");
	}
}
