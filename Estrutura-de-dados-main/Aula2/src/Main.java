import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		VetorObjeto vetor = new VetorObjeto(5);
		Ui ui = new Ui();
		
		boolean rodar = true;
		
		do {
			int opcao = Integer.parseInt(ui.entrada(ui.menu, ui.titulo, ui.icone));
			
			switch (opcao) {
				case 1:
				Livro livro = new Livro();

				livro.setTitulo(ui.entrada("Titulo do livro", ui.titulo, ui.icone));
				livro.setAutor(ui.entrada("Autor do livro", ui.titulo, ui.icone));
				livro.setdataLancamento(ui.entrada("Data de lançamento do livro", ui.titulo, ui.icone));

					try {
						vetor.adiciona(livro);
					} catch (Exception e) {
						e.printStackTrace();
					}

					break;
			case 2:
				
					try {
						vetor.remove(Integer.parseInt(ui.entrada("Digite o index para remover: ", ui.titulo, ui.icone)));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			break;
			case 3:
				ui.saida(vetor.listar(), ui.titulo, ui.icone);
					break;
			case 4:
				rodar = false;
				
				break;
			}

	} while (rodar);
}
}

	



