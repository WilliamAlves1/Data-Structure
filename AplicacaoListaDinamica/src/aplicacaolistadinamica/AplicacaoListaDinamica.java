package aplicacaolistadinamica;
import listasimplesdinamica.*;

public class AplicacaoListaDinamica {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaSimplesDinamica ls = new ListaSimplesDinamica();
        /*ls.insereListaVazia(50);
        ls.insereFimLista(30);
        ls.insereInicioLista(-99);
        ls.insereMeioLista(456, 1);
        ls.insereMeioLista(986544, 2);
*/
        System.out.println("Conseguiu inserir? " + ls.insere(50));
        System.out.println("Conseguiu inserir? " + ls.insere(60));
        System.out.println("Conseguiu inserir? " + ls.insere(4,0));
        System.out.println("Conseguiu inserir? " + ls.insere(14,3));
        System.out.println("Conseguiu inserir? " + ls.insere(34,5));
        
        ls.printLista();

        System.out.println("Conseguiu remover o primeiro? " + ls.remove(0));
        System.out.println("Conseguiu remover o último? " + ls.remove(ls.tamanhoLista() - 1));
        System.out.println("Conseguiu remover a posição 1? " + ls.remove(1));

        ls.printLista();
    }
    
}
