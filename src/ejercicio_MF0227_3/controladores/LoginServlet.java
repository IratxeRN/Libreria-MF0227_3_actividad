package ejercicio_MF0227_3.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/vistas/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		final String ADMIN_NAME = "administrador";
		final String ADMIN_PASS = "123456";
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");

		if (ADMIN_NAME.equals(usuario) && ADMIN_PASS.equals(password)) {

			HttpSession session = request.getSession();
			session.setAttribute("usuario", usuario);
			request.getRequestDispatcher("admin/gestion").forward(request, response);

		} else {
			request.getRequestDispatcher("/WEB-INF/vistas/login.jsp").forward(request, response);
		}

	}

}
