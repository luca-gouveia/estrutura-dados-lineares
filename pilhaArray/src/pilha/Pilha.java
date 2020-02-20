package pilha;

import java.util.Arrays;
/**
 *
 * @author luca
 */
public class Pilha {
    private Object elementos[];
    private int topo; // Índice que pega o último elemento armazenado
    
    public Pilha(int tamanho) {
        elementos = new Object[tamanho]; //Tamanho passado como parametro do construtor
        topo = -1; // posição invalida do vetor 
    }
    
    /** Adiciona um elemento ao topo da pilha */
    public void push(Object elemento) {
        Object novoArrayElementos[];
        int size;
        
        if(isFull()) {
            throw new RuntimeException("Stack Overflow -- Elemento "+elemento+" não adicionado");
        }
        topo++;
        elementos[topo] = elemento;
    }
    
    /** Remove o elemento do topo da pilha */
    public Object pop() {
        if(isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        Object elemento = elementos[topo];
        elementos[topo] = null;
        topo--;
        return elemento;
    }

    /** Verifica se a pilha está vazia */
    public boolean isEmpty() {
       return (topo == -1);
    }
    
    /** Verifica se a pilha está cheia */
    public boolean isFull() {
        return (topo == elementos.length - 1);
    }
    
    /** Retorna o elemento no topo (último adicionado) da pilha */
    public Object top(){
        if(isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return elementos[topo];
    }
    
    /** Retorna o número de elementos armazenados na pilha */
    public int size() {
        return topo+1;
    }
    
    /** Limpa a pilha */
    public void clear() {
       elementos = new Object[elementos.length] ;
       topo = -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos); 
    }
    
}
