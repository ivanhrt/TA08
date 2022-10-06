package Ex4;

public class Serie {
	
	private static String tituloDefault="";
	private static int nTemporadasDefault=3;
	private static boolean entregadoDefault=false;
	private static String generoDefault="";
	private static String creadorDefault="";
	
	
	private String titulo;
	private int nTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	public Serie() {
		this.titulo=tituloDefault;
		this.nTemporadas=nTemporadasDefault;
		this.entregado=entregadoDefault;
		this.genero=generoDefault;
		this.creador=creadorDefault;
	}
	
	public Serie(String titulo,String creador) {
		this.titulo=titulo;
		this.nTemporadas=nTemporadasDefault;
		this.entregado=entregadoDefault;
		this.genero=generoDefault;
		this.creador=creador;
	}

	public Serie(String titulo, int nTemporadas, boolean entregado, String genero, String creador) {
		this.titulo = titulo;
		this.nTemporadas = nTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}

	
	
	
	public String toString() {
		return "Serie [titulo=" + titulo + ", nTemporadas=" + nTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getnTemporadas() {
		return nTemporadas;
	}

	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
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

}
