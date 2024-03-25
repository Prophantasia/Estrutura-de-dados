public class Main {

  public static void main(String[] args) {
    Ui ui = new Ui();
    Fila fila = new Fila(5);
    boolean rodar = true;

    while (!rodar) {
      int opcao = Integer.parseInt(ui.entrada(ui.menu, ui.titulo, ui.icone));

      switch (opcao) {
        case 1:
          int opcAdi = Integer.parseInt(
            ui.entrada("1. Comum \n2. Preferencial", null, opcao)
          );
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
      }
    }
  }
}
