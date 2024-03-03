public class Livro {
	
	private String titulo;
	private String autor;
	private String dataLancamento;


public Livro() {

	}		
		
public Livro(String titulo, String autor, String dataLancamento) {
	titulo = this.titulo;
	autor = this.autor;
	dataLancamento = this.dataLancamento;
	
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}


public String getdataLancamento() {
	return dataLancamento;
}

public void setdataLancamento(String dataLancamento) {
	this.dataLancamento = dataLancamento;
}

}