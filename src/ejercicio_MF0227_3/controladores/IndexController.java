package ejercicio_MF0227_3.controladores;

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
 * Servlet implementation class IndexController
 */
@WebServlet("/index")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Dao<Libro> dao = LibroDaoTreeMap.getInstancia();
		Iterable<Libro> libros = dao.listarTodos();
		request.setAttribute("libros", libros);
		request.getRequestDispatcher("/WEB-INF/vistas/portada.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
