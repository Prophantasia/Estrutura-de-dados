import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();

        // Adicionando vértices
        grafo.adicionarVertice("Rua 1");
        grafo.adicionarVertice("Rua 2");
        grafo.adicionarVertice("Rua 3");
        grafo.adicionarVertice("Rua 4");
        grafo.adicionarVertice("Rua 5");
        grafo.adicionarVertice("Rua 6");

        // Adicionando arestas
        grafo.adicionarAresta(5.0, "Rua 1", "Rua 2");
        grafo.adicionarAresta(3.0, "Rua 2", "Rua 3");
        grafo.adicionarAresta(2.0, "Rua 3", "Rua 4");
        grafo.adicionarAresta(7.0, "Rua 4", "Rua 5");
        grafo.adicionarAresta(1.0, "Rua 5", "Rua 6");
        grafo.adicionarAresta(4.0, "Rua 1", "Rua 5");

        // Calcular menor distância entre dois vértices
        String origem = "Rua 1";
        String destino = "Rua 4";
        ResultadoDijkstra<String> resultado = grafo.calcularMenorDistancia(origem);
        Map<Vertice<String>, Double> distancias = resultado.getDistancias();
        Map<Vertice<String>, Vertice<String>> predecessores = resultado.getPredecessores();

        double distanciaParaDestino = distancias.get(grafo.getVertice(destino));
        System.out.println("Menor distância de " + origem + " para " + destino + " é " + distanciaParaDestino);

        // Imprimir o caminho até o destino
        List<Vertice<String>> caminho = new ArrayList<>();
        Vertice<String> atual = grafo.getVertice(destino);
        while (atual != null) {
            caminho.add(atual);
            atual = predecessores.get(atual);
        }
        Collections.reverse(caminho);

        System.out.print("Caminho: ");
        for (Vertice<String> vertice : caminho) {
            System.out.print(vertice.getDado() + " ");
        }
    }
}