
package listasimplesdinamica;


public class ListaSimplesDinamica {
    
    private No inicio;
    
    public ListaSimplesDinamica(){
        this.inicio = null;
    }
    
    public boolean listaVazia(){
        return (this.inicio == null);
    }

    private void insereListaVazia(double valor){
        No aux = new No(valor);
        //localizar - inicio
        aux.setProx(null);
        this.inicio = aux;
    }
    
    private void insereFimLista(double valor){
        No aux = new No(valor);
        
        No temp = this.inicio;
        while(temp.getProx() != null){
            temp = temp.getProx();
        }
        
        aux.setProx(null);
        temp.setProx(aux);
    }
    
    private void insereMeioLista(double valor, int pos){
        No aux = new No(valor);
        int i = 1;
        
        No temp = this.inicio;
        while(i < pos){
            temp = temp.getProx();
            i++;
        }
        aux.setProx(temp.getProx());
        temp.setProx(aux);
    }
    
    
    private void insereInicioLista(double valor){
       No aux = new No(valor);
       aux.setProx(this.inicio);
       this.inicio = aux;
    }
        
    public void printLista(){
        No temp = this.inicio;
        while(temp != null){
            System.out.println(temp.getValor());
            temp = temp.getProx();
        }
    }
    
    public int tamanhoLista(){
        if (listaVazia()) { return 0;}
        
        No temp = this.inicio;
        int tamanho = 0;
        while(temp != null){
            tamanho++;
            temp = temp.getProx();
        }
        return tamanho;
    }
    
    public boolean insere(double valor){
        if(listaVazia()){ insereListaVazia(valor);} 
        else { insereFimLista(valor); }
        return true;
    }
    
    public boolean insere(double valor, int pos){
        
        if(listaVazia() && pos == 0){
            insereListaVazia(valor);
            return true;
        }
        if (listaVazia() && pos > 0){ return false;}
        if (pos < 0){  return false;}
        if (pos == tamanhoLista()){
            insereFimLista(valor);
            return true;
        }
        if (pos == 0){
            insereInicioLista(valor);
            return true;
        }
        if (pos > 0 && pos < tamanhoLista()){
            insereMeioLista(valor, pos);
            return true;
        }
        return false;
    }
    
}





