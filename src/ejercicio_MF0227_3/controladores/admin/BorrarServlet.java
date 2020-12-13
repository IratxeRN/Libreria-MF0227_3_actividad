package ejercicio_MF0227_3.controladores.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejercicio_MF0227_3.accesodatos.Dao;
import ejercicio_MF0227_3.accesodatos.LibroDaoTreeMap;
import ejercicio_MF0227_3.modelo.Libro;

/**
 * Servlet implementation class BorrarServlet
 */
@WebServlet("/admin/borrar")
public class BorrarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");

		Dao<Libro> dao = LibroDaoTreeMap.getInstancia();

		dao.borrar(Integer.parseInt(id));

		request.setAttribute("alertaTexto", "Borrado efectuado correctamente");
		request.setAttribute("alertaNivel", "success");

		request.getRequestDispatcher("/admin/gestion").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
