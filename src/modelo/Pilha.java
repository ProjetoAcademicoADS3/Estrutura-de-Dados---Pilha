/*
- ESTRUTURA DE DADOS PILHA  -
É uma estrutura de dados do tipo LIFO (last in first out)
Esta estrutura permite o acesso apenas a um item ou elemento de dados que
está no topo, ou seja, o último inserido
Link explicativo com prof. Isidro -> https://www.youtube.com/watch?v=2V91Re1czwA
*/

package modelo;

/**
 *
 * @author roger
 */
public class Pilha {

    private int elementos[];
    private int tamanho = 10;
    private int topo = -1;

    public Pilha() {
        elementos = new int[tamanho];
        topo = -1;
    }

    public void push(int e) {
        if (isfull()) {
            throw new RuntimeException("Pilha cheia!");
        }
        topo++;
        elementos[topo] = e;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia");
        }
        int e;
        e = elementos[topo];
        topo--;
        return e;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isfull() {
        return topo == (elementos.length - 1);
    }
    
    public int consultar() {
        return elementos[topo];
    }

    public int quantElementos() {
        return topo + 1;
    }


    public void esvaziarPilha() {
        topo = -1;
    }
}
