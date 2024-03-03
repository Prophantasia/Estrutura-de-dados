
public class VetorObjeto {

	private Livro[] elementos;
    private int tamanho;
    
    public VetorObjeto (int capacidade){
        this.elementos = new Livro[capacidade];
        this.tamanho = 0;
    }
    public void adiciona(Livro elemento)throws Exception{
      this.aumentaCapacidade();
      if (this.tamanho < this.elementos.length){
          this.elementos[this.tamanho] = elemento;
          this.tamanho++;
      } 
    }
          
    public int tamanho(){
        return this.tamanho;
    }

    public String listar(){
        String lista = "Lista de livros\n\n";

       for (Livro livro : elementos) {
        lista += "Titulo: "+livro.getTitulo()+"\nAutor: "+livro.getAutor()+"\nData de lançamento: "+livro.getdataLancamento();
        
    }
        
    return lista;
}

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        
        for(int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        
        if(this.tamanho> 0){
            s.append(this.elementos[this.tamanho-1]);
        }
        
        s.append("]");
                	
        return s.toString();
    }
    
    public Object busca(int posicao)throws Exception{
        if(posicao >=0 && posicao < tamanho){
            return elementos[posicao];
        } else {
            throw new Exception("Posição Inválida");
        }  
    }
    
    public boolean adicionaInicio(int posicao, Livro elemento) throws Exception {
        this.aumentaCapacidade();
        if (posicao >=0 && posicao < tamanho){
        for (int i=this.tamanho-1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        
        } else {
             throw new Exception("Posição Inválida");
        }
            return true;
    }
    
    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            Livro[] elementosNovos = new Livro[this.elementos.length * 2];
            for (int i=0; i < this.elementos.length;i++){
                elementosNovos[i] = (Livro) this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
    public void remove(int posicao) throws Exception{
        if(posicao >= 0 && posicao < tamanho){
            for (int i = posicao; i < this.tamanho-1; i++){
                this.elementos[i] = this.elementos[i+1];
            }
            this.tamanho--;
        } else {
            throw new Exception("Posição Inválida");
        }
    }

}
