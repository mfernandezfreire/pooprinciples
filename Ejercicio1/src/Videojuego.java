
public class Videojuego implements Entregable, Comparable<Videojuego> {
	private String titulo;
	private int horasEstimadas;
	private Boolean entregado;
	private String compañia;
	
	public Videojuego() {
		horasEstimadas = 10;
		entregado = false;
	}
	
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}
	
	public Videojuego(String titulo, int horasEstimadas, Boolean entregado, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = entregado;
		this.compañia = compañia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	public String toString() {
		return titulo + " " + horasEstimadas + " " + entregado + " " + compañia;
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
	public int compareTo(Videojuego videojuego) {
		return this.horasEstimadas > videojuego.horasEstimadas ? 1 : this.horasEstimadas < videojuego.horasEstimadas ? -1 : 0;
	}
}
