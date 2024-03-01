import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		VetorObjeto vetor = new VetorObjeto(5);
		Ui ui = new Ui();
		
		boolean rodar = true;
		do {
			JOptionPane.showInputDialog(null,"");
		} while (rodar);
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, ui.menu, ui.titulo, ui.icone));
		
		
		switch (opcao) {
		case 1:
			//Falta entrada
			//vetor.adiciona();
			break;
		
		case 2:
			//Falta entrada
			//vetor.remove();
			break;
		case 3:
			//Falta entrada
			vetor.tamanho();
			break;
		case 4:
			rodar = false;
			break;
		}	
	}

}
