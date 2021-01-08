
public class Serie implements Entregable, Comparable<Serie>{
	private String titulo;
	private int numeroTemporadas;
	private Boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		numeroTemporadas = 3;
		entregado = false;
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie(String titulo, int numeroTemporadas, Boolean entregado, String genero, String creador ) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public String toString() {
		return titulo + " " + numeroTemporadas + " " + entregado  + " " + genero + " " + creador + "."; 
	}

	@Override
	public void entregar() {
		this.entregado = !this.entregado;
	}

	@Override
	public void devolver() {
		this.entregado = !this.entregado;
	}

	@Override
	public Boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public int compareTo(Serie serie) {
		return this.numeroTemporadas > serie.numeroTemporadas ? 1 : this.numeroTemporadas < serie.numeroTemporadas ? 1 : 0;
	}


}
