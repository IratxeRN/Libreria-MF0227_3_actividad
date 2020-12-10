package ejercicio_MF0227_3.accesodatos;

public interface Dao<L> {

	Iterable<L> listarTodos();

	void crear(L obj);

	void borrar(int id);

	void modificar(L obj);

	L buscar(int id);

}
