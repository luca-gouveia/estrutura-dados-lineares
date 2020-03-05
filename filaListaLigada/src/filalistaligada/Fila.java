package filalistaligada;

import java.util.Arrays;
import java.util.NoSuchElementException;
/**
 *
 * @author luca
 */
public class Fila {
    private No primeiro;
    private No ultimo;
    private int total;
    
    public Fila() {
        primeiro  = null;
        ultimo = null;
        total = 0;
    }
    //add - enqueue
    public void add(Object elemento) {
        No novoNo = new No(elemento);
        if(isEmpty()) {
            ultimo = novoNo;
            primeiro = novoNo;
        }else {
            ultimo.setProximo(novoNo);
            ultimo = novoNo;
            total++;
        }
    }
    //NoSuchElementException - remove - dequeue
    public Object remove() {
        Object elemento;
        if(isEmpty()) {
            throw new RuntimeException("Fila Vazia");
        }
        No no = primeiro;
        primeiro = primeiro.getProximo();
        return no;
    }
    
    public Object front(){
        return primeiro.getElemento();   
    }
 
    public int size() {
        return total;
    }
        
    public boolean isEmpty() {
       return primeiro == null;
    }
    
    public String exibir() {
        String saida = "";
 
        if(isEmpty()) {
            throw new RuntimeException("Fila Vazia");
        } else {
            No atual = primeiro;
            while( atual != null ) {
                if(atual.getProximo() != null) {
                    saida += atual.getElemento()+ " << ";
                } else {
                    saida += atual.getElemento();
                }
                atual = atual.getProximo();
            }
        }
        return saida;
        
    }
    
}
