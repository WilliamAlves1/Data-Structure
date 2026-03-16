package listasimplesdinamica;

public class No {
    
    private double valor;
    private No proximo;
    
    public No(double valor){
        this.valor = valor;
    }
    
    public void setValor(double valor){ this.valor = valor; }
    public double getValor(){ return this.valor; }    
    public void setProx(No prox){this.proximo = prox;}   
    public No getProx(){return this.proximo; }
    
    
}
