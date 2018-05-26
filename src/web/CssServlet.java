package web;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CssServlet
 */
@WebServlet("/style.css")
public class CssServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int nu = LocalTime.now().getSecond();
		String kleur = Integer.toHexString(0xffffff-nu*(0xffffff/60));
		request.setAttribute("kleur", kleur);
		request.getRequestDispatcher(
			    "/WEB-INF/CssMaker.jsp"
			    ).forward(request, response);
	}


}
