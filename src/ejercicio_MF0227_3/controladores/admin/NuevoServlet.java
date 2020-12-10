package ejercicio_MF0227_3.controladores.admin;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejercicio_MF0227_3.accesodatos.Dao;
import ejercicio_MF0227_3.accesodatos.LibroDaoTreeMap;
import ejercicio_MF0227_3.modelo.Libro;

/**
 * Servlet implementation class NuevoServlet
 */
@WebServlet("/admin/nuevo")
public class NuevoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/vistas/admin/nuevo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		final String URL_IMG = "img/libros/";
		final String FILE_IMG = "imagen_defecto.jpg";

		Integer id = -1;
		String nombre = request.getParameter("nombre");
		String autor = request.getParameter("autor");
		if (autor.isEmpty()) {
			autor = "Anónimo";
		}
		String urlImg = request.getParameter("urlImagen");
		if (urlImg.isEmpty()) {
			urlImg = URL_IMG + FILE_IMG;
		}
		BigDecimal precio = new BigDecimal(request.getParameter("precio"));
		Integer descuento = Integer.parseInt(request.getParameter("descuento"));

		Libro libro = new Libro(id, nombre, precio, descuento, autor, urlImg);
		Dao<Libro> dao = LibroDaoTreeMap.getInstancia();
		dao.crear(libro);
		request.getRequestDispatcher("/WEB-INF/vistas/admin/gestion.jsp").forward(request, response);
	}

}
