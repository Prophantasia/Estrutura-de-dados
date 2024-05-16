public class Aresta<TIPO> {
    private double distancia;
    private Vertice<TIPO> inicio;
    private Vertice<TIPO> fim;

    public Aresta(double distancia, Vertice<TIPO> inicio, Vertice<TIPO> fim) {
        this.distancia = distancia;
        this.inicio = inicio;
        this.fim = fim;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Vertice<TIPO> getInicio() {
        return inicio;
    }

    public void setInicio(Vertice<TIPO> inicio) {
        this.inicio = inicio;
    }

    public Vertice<TIPO> getFim() {
        return fim;
    }

    public void setFim(Vertice<TIPO> fim) {
        this.fim = fim;
    }
}
