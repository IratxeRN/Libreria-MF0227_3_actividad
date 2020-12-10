
import java.math.BigDecimal;
import java.util.Scanner;

import ejercicio_MF0227_3.accesodatos.Dao;
import ejercicio_MF0227_3.accesodatos.LibroDaoTreeMap;
import ejercicio_MF0227_3.modelo.Libro;

public class LibrosMenu {

	static final String OP_LISTAR = "1";
	static final String OP_CREAR = "2";
	static final String OP_BORRAR = "3";
	static final String OP_SALIR = "S";
	static final String URL_IMG = "img/libros/";
	static final String FILE_IMG = "imagen_defecto.jpg";

	static Scanner sc = null;
	static String opcion = "";

	static Dao<Libro> dao = LibroDaoTreeMap.getInstancia();

	public static void main(String[] args) {

		Boolean isMenu = true;

		sc = new Scanner(System.in);
		do {
			menuPrincipal();

			switch (opcion) {
			case OP_LISTAR: {
				listar();
				break;
			}
			case OP_CREAR: {
				crear();
				break;
			}
			case OP_BORRAR: {
				borrar();
				break;
			}
			case OP_SALIR: {
				isMenu = false;
				break;
			}
			default:
				System.out.println("Opción no válida. Debe introducir 1, 2, 3 o S \n");
				break;
			}
		} while (isMenu);

		System.out.println("\nFin del programa.");
	}// main

	public static void listar() {

		Iterable<Libro> libros = dao.listarTodos();

		System.out.println("--- Opc 1 - LISTAR TODOS LOS LIBROS ---- \n");
		for (Libro libro : libros) {
			System.out.printf("Id: %2s, Titulo: %-60s [Precio: %.2f€ %s] - Autor: %s - Imagen: %s \n", +libro.getId(),
					libro.getNombre(), libro.getPrecio(),
					(libro.getDescuento() > 0 ? "- Descuento %:" + libro.getDescuento() : ""),
					(libro.getAutor().isEmpty() ? "Anónimo" : libro.getAutor()),
					(libro.getUrlImagen().isEmpty() ? "" : libro.getUrlImagen()));
		}
		System.out.println("\n");

	}// END listar

	private static void crear() {

		Boolean isError = true;
		String nombre, autor, urlImg;
		BigDecimal precio = new BigDecimal(0);
		Integer descuento = 0;

		System.out.println("--- Opc 2 - AÑADIR NUEVO LIBRO  ---- \n");
		Integer id = -1;

		do {// pedimos hasta que la respuesta sera correcta
			System.out.println("Introducir Nombre:  \n");
			nombre = sc.nextLine();

			// Controlamos el nombre tenga mas de 3 y menos de 150 caracteres
			if (nombre.trim().length() < 3 || nombre.trim().length() > 150) {
				System.out.println("Debe tener mas de 3 letras y menos de 150  \n");
				isError = true;
			} else {
				isError = false;
			}

		} while (isError);

		do {
			try {
				System.out.println("Introducir Precio:  \n");
				precio = new BigDecimal(sc.nextLine());
				isError = false;
			} catch (NumberFormatException e) {
				System.out.println("Debe introducir un numero");
				isError = true;
			} catch (Exception e) {
				System.out.println("Ha ocurrido un ERROR");
				isError = true;
			}
		} while (isError);

		do {
			try {
				System.out.println("Introducir Descuento:  \n");
				descuento = Integer.parseInt(sc.nextLine());
				isError = false;
			} catch (NumberFormatException e) {
				System.out.println("Debe introducir cifras");
				isError = true;
			} catch (Exception e) {
				System.out.println("Ha ocurrido un ERROR");
				isError = true;
			}
		} while (isError);

		System.out.println("Introducir Autor (por defecto Anónimo):  \n");
		autor = sc.nextLine();
		if (autor.isEmpty()) {
			autor = "Anónimo";
		}

		System.out.println("Introducir url de la imagen(por defecto sin_imagen.jpg):  \n");
		urlImg = sc.nextLine();
		if (urlImg.isEmpty()) {
			urlImg = URL_IMG + FILE_IMG;
		} else {
			urlImg = URL_IMG + urlImg;
		}

		Libro libro = new Libro(id, nombre, precio, descuento, autor, urlImg);
		dao.crear(libro);
		listar();

	}// END Crear

	private static void borrar() {

		Boolean isError = true;

		System.out.println("--- Opc 3 - DAR DE BAJA UN LIBRO  ---- \n");
		listar();
		do {

			System.out.println("\nPor favor, introduzca el identificador del libro a borrar:");
			try {
				Integer id = Integer.parseInt(sc.nextLine());

				if (dao.buscar(id) == null) {
					System.out.println("Identificador de libro no encontrado.");
				} else {
					dao.borrar(id);
					System.out.println("Libro eliminado con exito.");
					isError = false;
				}
			} catch (NumberFormatException e) {
				System.out.println("Debe introducir un numero");

			} catch (Exception e) {
				System.out.println("Ha ocurrido un ERROR");
			}
		} while (isError);
		listar();
	}// END borrar

	public static void menuPrincipal() {

		System.out.println("**** MENU PRINCIPAL *******************");
		System.out.println(" " + OP_LISTAR + ".- Listar todos los libros");
		System.out.println(" " + OP_CREAR + ".- Añadir un libro nuevo");
		System.out.println(" " + OP_BORRAR + ".- Dar de baja un libro");
		System.out.println(" ");
		System.out.println(" " + OP_SALIR + " - Salir");
		System.out.println("************************************");
		System.out.println("Por favor, elige una opcion:");
		opcion = sc.nextLine();

	}

}
