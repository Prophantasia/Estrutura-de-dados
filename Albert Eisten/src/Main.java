import Classes.Fila;
import Classes.Pessoa;
import Classes.Ui;

public class Main {

  public static void main(String[] args) {
    boolean rodar = true;
    Fila fila = new Fila();
    Ui ui = new Ui();

    while (rodar) {
      int opcao = Integer.parseInt(
          ui.entrada(ui.getMenu(), ui.getTitulo(), ui.getIcone()));

      switch (opcao) {

        // Adicionar na fila
        case 1:
          int opcAdi = Integer.parseInt(
              ui.entrada(
                  "1. Comum \n2. Preferencial\n3. Voltar",
                  ui.getTitulo(),
                  ui.getIcone()));

          // Adiciona na fila comum
          if (opcAdi == 1) {
            Pessoa p = new Pessoa();
            p.setNome(
                ui.entrada("Digite o nome:", ui.getTitulo(), 1));
            p.setIdade(
                Integer.parseInt(
                    ui.entrada("Digite a idade:", ui.getTitulo(), 1)));
            p.setPreferencial(false);

            fila.enfileira(p);
            fila.ordenar();
            // Adiciona na fila preferencial
          } else if (opcAdi == 2) {
            Pessoa p = new Pessoa();
            p.setNome(
                ui.entrada("Digite o nome:", ui.getTitulo(), 1));
            p.setIdade(
                Integer.parseInt(
                    ui.entrada("Digite a idade:", ui.getTitulo(), 1)));
            p.setPreferencial(true);

            fila.enfileira(p);
            fila.ordenar();
          } else if (opcAdi == 3) {
          } else {
            ui.saida("Valor inválido", ui.getTitulo(), 2);
          }
          break;

        // Chamar o próximo da fila
        case 2:
          if (fila.espiar() != null) {
            Pessoa pView = new Pessoa();
            pView = (Pessoa) fila.desenfileira();
            ui.saida(
                "Nome: " + pView.getNome() + "\nIdade: " + pView.getIdade() + "\nPreferencial: "
                    + pView.isPreferencial(),
                ui.getTitulo(), ui.getIcone());
          } else
            ui.saida("Ninguém na fila", ui.getTitulo(), 1);
          break;

        // Listar a fila
        case 3:
          fila.listar();
          break;
        case 4:
          rodar = false;
          break;
        default:
          ui.saida("Valor inválido", ui.getTitulo(), 2);
          break;
      }
    }
  }
}
