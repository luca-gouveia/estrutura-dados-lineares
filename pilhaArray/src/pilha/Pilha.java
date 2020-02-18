    package pilha;

/**
 *
 * @author luca
 */
public class Pilha {
    
    int elementos[];
    /** Índice que pega o último elemento armazenado */
    int topo; 
    
    public Pilha(int tamanho) {
        elementos = new int[tamanho]; //Tamanho passado como parametro do construtor
        topo = -1; // posição invalida do vetor 
    }
    
    /** Adiciona um elemento ao topo da pilha */
    public void push(int elemento) {
        if(isFull()) {
            throw new RuntimeException("Stack Overflow -- Estouro de pilha");
        }
        topo++;
        elementos[topo] = elemento;
    }
    
    /** Remove o elemento do topo da pilha */
    public int pop() {
        if(isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        int elemento;
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
    public int top(){
        if(isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return elementos[topo];
    }
}
