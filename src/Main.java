public class Main {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();

        grafo.adicionarVertice("Rua 1");
        grafo.adicionarVertice("Rua 2");
        grafo.adicionarVertice("Rua 3");
        grafo.adicionarVertice("Rua 4");
        grafo.adicionarVertice("Rua 5");
        grafo.adicionarVertice("Rua 6");

        grafo.adicionarAresta(20, "Rua 1", "Rua 3");
        grafo.adicionarAresta(50, "Rua 3", "Rua 5");
        grafo.adicionarAresta(100, "Rua 5", "Rua 2");
        grafo.adicionarAresta(10, "Rua 2", "Rua 3");
        grafo.adicionarAresta(10, "Rua 3", "Rua 4");
        grafo.adicionarAresta(50, "Rua 4", "Rua 6");


        grafo.BuscaEmLargura();
    }
}