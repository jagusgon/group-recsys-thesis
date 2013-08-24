package edu.ub.tfc.recommender.domain;

/**
 * Clase para objetos Film
 * @author David Gil De Arce
 */
public class Film {
	
	private int filmId;
	private String name;
	private String filmGenre;

	public Film() {
		super();
	}
	/**
	 * @param filmId
	 * @param name
	 * @param filmGenre
	 */
	public Film(final int filmId, final String name, final String filmGenre) {
		super();
		this.filmId = filmId;
		this.name = name;
		this.filmGenre = filmGenre;
	}
	/**
	 * Obtiene el ID de una pel�cula
	 * @return ID de la pel�cula
	 */
	public int getFilmId() {
		return this.filmId;
	}
	/**
	 * Guarda el ID de una pel�cula
	 * @param filmId ID de la pel�cula
	 */
	public void setFilmId(final int filmId) {
		this.filmId = filmId;
	}
	/**
	 * Obtiene el nombre de una pel�cula
	 * @return El nombre de la pel�cula
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Guarda el nombre de una pel�cula
	 * @param name Nombre de la pel�cula
	 */
	public void setName(final String name) {
		this.name = name;
	}
	/**
	 * Obtiene el g�nero de una pel�cula
	 * @return El g�nero de la pel�cula
	 */
	public String getFilmGenre() {
		return this.filmGenre;
	}
	/**
	 * Guarda el g�nero de una pel�cula
	 * @param filmGenre El g�nero de la pel�cula
	 */
	public void setFilmGenre(final String filmGenre) {
		this.filmGenre = filmGenre;
	}


}
