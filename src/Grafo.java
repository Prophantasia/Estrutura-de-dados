import java.util.ArrayList;
import java.util.Map;
import java.util.PriorityQueue;

public class Grafo<TIPO> {
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;

    public Grafo() {
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
    }

    public void adicionarVertice(TIPO dado) {
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
        this.vertices.add(novoVertice);
    }

    public void adicionarAresta(double peso, TIPO dadoInicio, TIPO dadoFim) {
        Vertice<TIPO> inicio = this.getVertice(dadoInicio);
        Vertice<TIPO> fim = this.getVertice(dadoFim);
        Aresta<TIPO> aresta = new Aresta<TIPO>(peso, inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaSaida(aresta);
        this.arestas.add(aresta);
    }

    public Vertice<TIPO> getVertice(TIPO dado) {
        Vertice<TIPO> vertice = null;
        for (Vertice<TIPO> v : this.vertices) {
            if (v.getDado().equals(dado)) {
                vertice = v;
                break;
            }
        }
        return vertice;
    }

    public ResultadoDijkstra<TIPO> calcularMenorDistancia(TIPO origem) {
        ResultadoDijkstra<TIPO> resultado = new ResultadoDijkstra<>();
        Map<Vertice<TIPO>, Double> distancias = resultado.getDistancias();
        Map<Vertice<TIPO>, Vertice<TIPO>> predecessores = resultado.getPredecessores();

        PriorityQueue<Vertice<TIPO>> fila = new PriorityQueue<>((v1, v2) -> Double.compare(distancias.get(v1), distancias.get(v2)));
        Vertice<TIPO> verticeOrigem = getVertice(origem);

        for (Vertice<TIPO> v : vertices) {
            distancias.put(v, Double.POSITIVE_INFINITY);
            predecessores.put(v, null);
        }
        distancias.put(verticeOrigem, 0.0);

        fila.add(verticeOrigem);

        while (!fila.isEmpty()) {
            Vertice<TIPO> u = fila.poll();
            for (Aresta<TIPO> aresta : u.getArestaSaida()) {
                Vertice<TIPO> v = aresta.getFim();
                double peso = aresta.getDistancia();
                double distanciaAteV = distancias.get(u) + peso;
                if (distanciaAteV < distancias.get(v)) {
                    fila.remove(v);
                    distancias.put(v, distanciaAteV);
                    predecessores.put(v, u);
                    fila.add(v);
                }
            }
        }

        return resultado;
    }
}