package edu.ub.tfc.recommender.model;

/**
 * Clase para objetos Pelicula
 * @author David Gil De Arce
 */
public class Pelicula {
	
	private int id;
	private String titulo;
	private String genero;
	private String url;
	private int valoracion;

	/**
	 * @param id
	 * @param titulo
	 * @param genero
	 * @param url
	 */
	public Pelicula(final int id, final String titulo, final String genero, final String url) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.url = url;
	}
	/**
	 * Obtiene el ID de una pel�cula
	 * @return ID de la pel�cula
	 */
	public int getId() {
		return this.id;
	}
	/**
	 * Guarda el ID de una pel�cula
	 * @param id ID de la pel�cula
	 */
	public void setId(final int id) {
		this.id = id;
	}
	/**
	 * Obtiene el t�tulo de una pel�cula
	 * @return T�tulo de la pel�cula
	 */
	public String getTitulo() {
		return this.titulo;
	}
	/**
	 * Guarda el t�tulo de una pel�cula
	 * @param titulo T�tula de la pel�cula
	 */
	public void setTitulo(final String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Obtiene el g�nero de una pel�cula
	 * @return G�nero de la pel�cula
	 */
	public String getGenero() {
		return this.genero.replace("|",", ");
	}
	/**
	 * Guarda el g�nero de una pel�cula
	 * @param genero G�nero de la pel�cula
	 */
	public void setGenero(final String genero) {
		this.genero = genero;
	}
	/**
	 * Obtiene la URL de una pel�cula
	 * @return URL de la pel�cula
	 */
	public String getUrl() {
		return this.url;
	}
	/**
	 * Guarda la URL de una pel�cula
	 * @param url URL de la pel�cula
	 */
	public void setUrl(final String url) {
		this.url = url;
	}
	/**
	 * Obtiene la valoraci�n de una pel�cula
	 * @return Valoraci�n de la pel�cula
	 */
	public int getValoracion() {
		return this.valoracion;
	}
	/**
	 * Guarda la valoraci�n de una pel�cula
	 * @param valoracion Valoraci�n de la pel�cula
	 */
	public void setValoracion(final int valoracion) {
		this.valoracion = valoracion;
	}



}
