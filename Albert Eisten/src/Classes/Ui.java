package Classes;

import javax.swing.JOptionPane;

public class Ui {

  String menu = "Escolha sua opção: \n\n1. Adicionar na fila\n2. Chamar próximo\n3. Listar fila\n4. Sair";
  String titulo = "Albert Einstem";
  int icone = -1;

  public String entrada(String mensagem, String titulo, int icone) {
    return JOptionPane.showInputDialog(null, mensagem, titulo, icone);
  }

  public void saida(String mensagem, String titulo, int icone) {
    JOptionPane.showMessageDialog(null, mensagem, titulo, icone);
  }

  public String getMenu() {
    return menu;
  }

  public String getTitulo() {
    return titulo;
  }

  public int getIcone() {
    return icone;
  }

}
