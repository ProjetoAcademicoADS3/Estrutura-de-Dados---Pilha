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

    private int tamanho;
    private int array[];
    private int topo = -1;

    public Pilha() {
        this(10);
    }

    public Pilha(int tamanho) {
        if (tamanho <= 0) {
            throw new RuntimeException("Tamanho inválido!");
        }
        this.tamanho = tamanho;
        array = new int[tamanho];
    }

    public void inserir(int elemento) {
        if (estaCheia()) {
            throw new RuntimeException("Pilha cheia!");
        }
        array[topo + 1] = elemento;
    }

    public void retirar() {
        if (estaVazia()) {
            throw new RuntimeException("A pilha está vazia");
        }
        topo--;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == (tamanho - 1);
    }

    public int quantElementos() {
        return topo + 1;
    }

    public int consultar() {
        return array[topo];
    }

    public void esvaziarPilha() {
        topo = -1;
    }
}
