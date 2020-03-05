package filaarray;

import java.util.Arrays;
import java.util.NoSuchElementException;
/**
 *
 * @author luca
 */
public class Fila {
    private Object elementos[];
    private int tamanho;
    private int primeiro;
    private int ultimo;
    private int total;
    
    public Fila(int tamanho) {
        elementos = new Object[tamanho];
        primeiro  = 0;
        ultimo = 0;
        total = 0;
    }
    //add - enqueue
    public boolean add(Object elemento) {
        if(isFull()){
            throw new IllegalStateException("Fila Cheia");
        } else {
            elementos[ultimo]  = elemento;
            ultimo = (ultimo + 1) % elementos.length;
            total++;
        }
        return !isFull();
    }
    
    //NoSuchElementException - remove - dequeue
    public Object remove() {
        Object elemento;
        if(isEmpty()) {
            throw new RuntimeException("Fila Vazia");
        } else {
            elemento = elementos[primeiro];
            elementos[primeiro] = null;
            primeiro = (primeiro + 1) % elementos.length;
            total--;
        }
        return elemento;
    }
    
    public Object front(){
        return isEmpty() ? null : elementos[primeiro];   
    }
 
    public int size() {
        return (elementos.length - primeiro + ultimo) % elementos.length;
    }
        
    public boolean isFull() {
       return total == elementos.length;
    }
   
    public boolean isEmpty() {
       return total == 0;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(elementos); 
    }
    
}
