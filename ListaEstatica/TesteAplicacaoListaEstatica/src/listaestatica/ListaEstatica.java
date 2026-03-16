package listaestatica;

public class ListaEstatica {

    private int tamanhoMaximo;
    private double[] vetor;
    private int qtd;

    public ListaEstatica(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.qtd = 0;
        this.vetor = new double[tamanhoMaximo];

    }

    public String printVetor() {
        String temp = "";
        for (double d : this.vetor) {
            temp += Double.toString(d) + " - ";
        }
        return temp;
    }

    public String printLista() {
        String temp = "";
        for (int i = 0; i < tamanhoLista(); i++) {
            temp += Double.toString(this.vetor[i]) + " - ";

        }
        return temp;

    }

    public int tamanhoLista() {
        return this.qtd;

    }

    public boolean listaCheia() {
        return (tamanhoLista() > (this.tamanhoMaximo - 1));

    }

    public boolean listaVazia() {
        return (tamanhoLista() == 0);

    }

    private void insereListaVazia(double valor) {
        this.vetor[0] = valor;
        this.qtd = 1;

    }

    private void insereFimLista(double valor) {
        this.vetor[this.qtd] = valor;
        this.qtd++;

    }

    private void insereInicioLista(double valor) {
        for (int i = this.qtd; i > 0; i--) {
            this.vetor[i] = this.vetor[i - 1];
        }

        this.vetor[0] = valor;
        this.qtd++;
    }

    private void insereMeioLista(double valor, int pos) {
        for (int i = this.qtd; i > pos; i--) {
            this.vetor[i] = this.vetor[i - 1];
        }
        this.vetor[pos] = valor;
        this.qtd++;
    }

    public boolean insere(double valor) {
        if (listaCheia()) {
            return false;
        }

        if (listaVazia()) {
            insereListaVazia(valor);
        } else {
            insereFimLista(valor);

        }
        return true;

    }

    public boolean insere(double valor, int pos) {
        if (listaCheia()) {
            return false;
        }

        if (listaVazia() && pos == 0) {
            insereListaVazia(valor);
            return true;
        }

        if (listaVazia() && pos > 0) {
            return false;
        }

        if (pos < 0) {
            return false;

        }

        if (pos == tamanhoLista()) {
            insereFimLista(valor);
            return true;

        }

        if (pos == 0) {
            insereInicioLista(valor);
            return true;
        }

        if (pos > 0 && pos < tamanhoLista()) {
            insereMeioLista(valor, pos);
            return true;
        }
        return false;
    }

    private void removeInicioLista() {
        for (int i = 0; i < this.qtd - 1; i++) {
            this.vetor[i] = this.vetor[i+1];
        }
        this.qtd--;
        this.vetor[this.qtd] = 0.0;
    }

    private void removeMeioLista(int pos) {
        for (int i = pos; i < this.qtd - 1; i++) {
            this.vetor[i] = this.vetor[i+1];
        }
        this.qtd--;
        this.vetor[this.qtd] = 0.0;
    }

    private void removeFimLista() {
        this.qtd--;
        this.vetor[this.qtd] = 0.0;
    }

    public boolean remove(int pos) {
        if (listaVazia()) { return false; }
        if (pos < 0 || pos >= tamanhoLista()) { return false; }
        if (pos == 0) {
            removeInicioLista();
            return true;
        }

        if (pos == tamanhoLista() - 1) {
            removeFimLista();
            return true;
        }

        removeMeioLista(pos);
        return true;
    }

    public void debugInsere(double valor){
        System.out.println("Conseguiu inserir? " + insere(valor));
        System.out.println(printVetor());
        System.out.println(printLista());
    }



    public void debugInsere(double valor, int pos){
        System.out.println("Conseguiu inserir? " + insere(valor, pos));
        System.out.println(printVetor());
        System.out.println(printLista());
    }


    public void debugRemove(int pos){
        System.out.println(" ");
        System.out.println("Conseguiu remover da posicao " + pos + "? " + remove(pos));
        System.out.println("Vetor: " + printVetor());
        System.out.println("Lista: " + printLista());
    }
}