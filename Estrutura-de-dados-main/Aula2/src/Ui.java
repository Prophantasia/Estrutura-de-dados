import javax.swing.JOptionPane;

public class Ui {
	String menu = "Menu\n1. Adicionar livro\n2. Remover livro\n3. Listar livro\n4. Sair";
	String titulo = "Biblioteca System";
	int icone = -1;


	public String entrada (String mensagem, String titulo, int icone) {
		return JOptionPane.showInputDialog(null, mensagem, titulo, icone);
	}
	public void saida (String mensagem, String titulo, int icone) {
		JOptionPane.showMessageDialog(null, mensagem, titulo, icone);
	}
}
