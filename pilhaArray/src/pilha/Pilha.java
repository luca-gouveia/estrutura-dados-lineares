package pilha;

/**
 *
 * @author luca
 */
public class Pilha {
    
    protected Object elementos[];
    /** Índice que pega o último elemento armazenado */
    protected int topo; 
    
    public Pilha(int tamanho) {
        elementos = new Object[tamanho]; //Tamanho passado como parametro do construtor
        topo = -1; // posição invalida do vetor 
    }
    
    /** Adiciona um elemento ao topo da pilha */
    public void push(int elemento) {
        Object novoArrayElementos[];
        int size;
        
        if(isFull()) {
            size = elementos.length;
            size = size * 2;
            novoArrayElementos = new Object[size];
            
            for(int i = 0; i < elementos.length; i++) {
                novoArrayElementos[i] = elementos[i];
            }
            elementos = novoArrayElementos;
        }
        topo++;
        elementos[topo] = elemento;
    }
    
    /** Remove o elemento do topo da pilha */
    public Object pop() {
        if(isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        Object elemento;
        elemento = elementos[topo];
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
}
