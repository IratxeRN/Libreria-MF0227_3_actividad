package ejercicio_MF0227_3.modelo;

import java.math.BigDecimal;

public class Libro {

	public static final String AUTOR_DEFECTO = "Anonimo";
	public static final String IMG_DEFECTO = "img/libros/img_defecto.jgp";

	private Integer id;
	private String nombre;// nombre + descripcion/ min 2 max 150
	private BigDecimal precio;// >= 0 y 2 decimales
	private Integer descuento;// de 0 a 100
	private String autor;
	private String urlImagen;

	public Libro() {
		super();
		this.id = 0;
		this.nombre = "Titulo Desconocido";
		this.precio = new BigDecimal(0);
		this.descuento = 0;
		this.autor = AUTOR_DEFECTO;
		this.urlImagen = IMG_DEFECTO;

	}

	public Libro(Integer id, String nombre, BigDecimal precio, Integer descuento, String autor, String urlImagen) {
		this();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.descuento = descuento;
		this.autor = autor;
		this.urlImagen = urlImagen;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Integer getDescuento() {
		return descuento;
	}

	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {

		if (autor != null) {

			if (autor.trim().isEmpty()) {

				autor = AUTOR_DEFECTO;
			}
			this.autor = autor;
		} else {

			this.autor = AUTOR_DEFECTO;
		}

	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		if (urlImagen != null) {

			if (urlImagen.trim().isEmpty()) {

				urlImagen = IMG_DEFECTO;
			}
			this.urlImagen = urlImagen;
		} else {

			this.urlImagen = IMG_DEFECTO;
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((descuento == null) ? 0 : descuento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((precio == null) ? 0 : precio.hashCode());
		result = prime * result + ((urlImagen == null) ? 0 : urlImagen.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (descuento == null) {
			if (other.descuento != null)
				return false;
		} else if (!descuento.equals(other.descuento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (precio == null) {
			if (other.precio != null)
				return false;
		} else if (!precio.equals(other.precio))
			return false;
		if (urlImagen == null) {
			if (other.urlImagen != null)
				return false;
		} else if (!urlImagen.equals(other.urlImagen))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descuento=" + descuento + ", autor="
				+ autor + ", urlImagen=" + urlImagen + "]";
	}

}
