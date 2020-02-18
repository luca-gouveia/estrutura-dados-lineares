package pilharn;

/**
 *
 * @author luca
 */
public class PilhaRN {
      
    protected Object elementos[];
    protected int topoR;   
    protected int topoN; 
 
    public PilhaRN(int tamanho) {
        elementos = new Object[tamanho]; //Tamanho passado como parametro do construtor
        topoR = -1;         
        topoN = tamanho; 
    }
    
    /** Retorna o tamanho da pilha */
    public int size() {
        return elementos.length;
    }
        /** Verifica se a pilha está vazia */
    public boolean isEmpty() {
       return (topoR == -1 && topoN == elementos.length - 1);
    }
    
    /** Verifica se a pilha está cheia */
    public boolean isFull() {
        return (topoR+1 == topoN);
    }
    
    /** Adiciona um elemento ao topo da pilha Rubro (vermelha) - Inicio do array */
    public void pushR() {
        if(isFull()) {
            throw new RuntimeException("Stack Overflow!!! -- Pilha cheia");
        }
        
        topoR++;
        elementos[topoR] = 'R';
    }
    
    /** Adiciona um elemento ao topo da pilha Negra (preta) - fim do array */
    public void pushN() {
        if(isFull()) {
            throw new RuntimeException("Stack Overflow!!! -- Pilha cheia");
        }
        
        topoN--;
        elementos[topoN] = 'N';
    }
    
    /** Remove o elemento do topo da pilha Rubro (vermelha) */
    public Object popR() {
        if(isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        Object elemento;
        elemento = elementos[topoR];
        topoR--;
        return elemento;
    }
       
    /** Retorna o elemento no topo (último adicionado) da pilha Rubro (vermelha) */
    public Object topR(){
        if(isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return elementos[topoR];
    } 
    
    /** Retorna o elemento no topo (último adicionado) da pilha Negra (preta) */
    public Object topN(){
        if(isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return elementos[topoN];
    }
}
