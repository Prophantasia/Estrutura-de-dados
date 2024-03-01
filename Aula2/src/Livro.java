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

public String gettitulo() {
	return titulo;
}

public void settitulo(String titulo) {
	this.titulo = titulo;
}

public String getautor() {
	return autor;
}

public void setautor(String autor) {
	this.autor = autor;
}


public String getdataLancamento() {
	return dataLancamento;
}

public void setdataLancamento(String dataLancamento) {
	this.dataLancamento = dataLancamento;
}

}