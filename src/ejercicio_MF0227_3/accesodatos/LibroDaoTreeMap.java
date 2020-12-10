package ejercicio_MF0227_3.accesodatos;

import java.math.BigDecimal;
import java.util.TreeMap;

import ejercicio_MF0227_3.modelo.Libro;

public class LibroDaoTreeMap implements Dao<Libro> {

	private static TreeMap<Integer, Libro> libros = new TreeMap<>();

	static {

		libros.put(1, new Libro(1, "Los Futbolisimos. El misterio del jugador número 13", new BigDecimal(16.50), 0,
				"Roberto Santiago", "img/libros/fut1.jpg"));
		libros.put(2, new Libro(2, "Los Futbolisimos. El misterio del obelisto mágico", new BigDecimal(11.95), 20,
				"Roberto Santiago", "img/libros/fut2.jpg"));
		libros.put(3, new Libro(3, "Los Futbolisimos. El misterio del Dia de los Inocentes", new BigDecimal(11.50), 0,
				"Roberto Santiago", "img/libros/fut3.jpg"));
		libros.put(4, new Libro(4, "El Símbolo Perdido. Serie Robert Landon 3", new BigDecimal(16.50), 10, "Dan Brown",
				"img/libros/simbolo.jpg"));
		libros.put(5, new Libro(5, "El Código DaVinci. Serie Robert Landon 2", new BigDecimal(12), 0, "Dan Brown",
				"img/libros/dan2.jpg"));
		libros.put(6, new Libro(6, "Ängeles y Demonios. Serie Robert Landon 1", new BigDecimal(16.50), 10, "Dan Brown",
				"img/libros/dan1.jpg"));
	}

	private LibroDaoTreeMap() {
	}

	public static LibroDaoTreeMap INSTANCIA = new LibroDaoTreeMap();

	public static LibroDaoTreeMap getInstancia() {
		return INSTANCIA;
	}

	@Override
	public Iterable<Libro> listarTodos() {
		return libros.values();
	}

	@Override
	public void crear(Libro libro) {
		Integer id = libros.size() == 0 ? 1 : libros.lastKey() + 1;
		libro.setId(id);
		libros.put(id, libro);
	}

	@Override
	public void borrar(int id) {
		libros.remove(id);

	}

	@Override
	public void modificar(Libro libro) {
		libros.put(libro.getId(), libro);
	}

	@Override
	public Libro buscar(int id) {
		return libros.get(id);
	}

}
