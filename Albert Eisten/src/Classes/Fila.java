package Classes;

public class Fila<T> extends EstruturaEstatica<T> {
	private int contPref = 0;

	public Fila() {
		super();
	}

	public Fila(int capacidade) {
		super(capacidade);
	}

	public void enfileira(T elemento) {
		this.adiciona(elemento);
	}

	public T espiar() {
		if (this.estaVazia()) {
			return null;
		}
		return this.elementos[0];
	}

	public T desenfileira() {
		if (this.estaVazia()) {
			return null;
		}

		if (this.contPref == 3) {
			T elementoASerRemovido = this.elementos[2];
			this.remove(1);
			contPref = 0;
			return elementoASerRemovido;
		}

		else {

			final int POS = 0;
						
			Pessoa p = new Pessoa();
			p =  (Pessoa) this.elementos[POS];
			if (p.isPreferencial())
				contPref++;
			else
				this.contPref = 0;
			
			T elementoASerRemovido = this.elementos[POS];
				this.remove(POS);
			return elementoASerRemovido;
		}
		
	}

	public void listar() {
		Ui ui = new Ui();
		String lista = "Tamanho: " + tamanho() + "\n\n";
		int pos = 1;

		
		for (int i = 0; i < this.tamanho; i++) {
			Pessoa p = new Pessoa();
			if (elementos[i] != null) {
				p = (Pessoa) elementos[i];
				lista += "Nome: " + p.getNome() + "\nIdade: " + p.getIdade() + "\nPreferencial: " + p.isPreferencial()
						+ "\nPosicao: " + pos + "\n\n";
				pos++;
			}
		}
		if (this.tamanho != 0)
			ui.saida(lista, ui.getTitulo(), ui.icone);
		else
			ui.saida("Ninguém na fila", ui.getTitulo(), 1);

	}

	public void ordenar() {
		for (int i = 0; i < tamanho(); i++) {
			Pessoa atualPessoa = (Pessoa) elementos[i];
			if (atualPessoa.isPreferencial()) {
				int j = i;
				while (j > 0 && !((Pessoa) elementos[j - 1]).isPreferencial()) {
					T temp = elementos[j];
					elementos[j] = elementos[j - 1];
					elementos[j - 1] = temp;
					j--;
				}
			}
		}
	}

}