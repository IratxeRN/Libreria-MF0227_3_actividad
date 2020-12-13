package ejercicio_MF0227_3.controladores.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NuevoServlet
 */
@WebServlet("/admin/nuevo-editar")
public class NuevoEditarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/vistas/admin/nuevo_editar.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("alertaTexto", "Guardado");
		request.setAttribute("alertaNivel", "success");

		request.getRequestDispatcher("/WEB-INF/vistas/admin/gestion.jsp").forward(request, response);
	}

}
