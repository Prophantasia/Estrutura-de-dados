import java.util.HashMap;
import java.util.Map;


public class ResultadoDijkstra<TIPO> {
    private Map<Vertice<TIPO>, Double> distancias;
    private Map<Vertice<TIPO>, Vertice<TIPO>> predecessores;

    public ResultadoDijkstra() {
        distancias = new HashMap<>();
        predecessores = new HashMap<>();
    }

    public Map<Vertice<TIPO>, Double> getDistancias() {
        return distancias;
    }

    public Map<Vertice<TIPO>, Vertice<TIPO>> getPredecessores() {
        return predecessores;
    }
}