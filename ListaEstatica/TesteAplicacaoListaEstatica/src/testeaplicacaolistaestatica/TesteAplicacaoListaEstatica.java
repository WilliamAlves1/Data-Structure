package testeaplicacaolistaestatica;
import listaestatica.*;

public class TesteAplicacaoListaEstatica {
    public static void main(String[] args) {

        ListaEstatica le = new ListaEstatica(5);

        le.debugInsere(9,le.tamanhoLista());
        le.debugInsere(3,0);
        le.debugInsere(13,1);
        le.debugInsere(17,2);
        le.debugInsere(20,3);

        System.out.println("REMOÇÃO: ");
        le.debugRemove(4);

    }
}