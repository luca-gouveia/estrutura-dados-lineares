package pilharn;

import java.util.Arrays;

/**
 *
 * @author luca
 */
public class PilhaRN {
      
     Object elementos[];
     int topoR;   
     int topoN; 
 
    public PilhaRN(int tamanho) {
        elementos = new Object[tamanho]; //Tamanho passado como parametro do construtor
        topoR = -1;         
        topoN = tamanho; 
    }

    /** Retorna o número de elementos das duas pilhas */
    public int size() {
        return -1; //TODO
    }
    
    /** Verifica se a pilha Rubro (vermelho) está vazia */
    public boolean isEmptyR() {
       return (topoR == -1);
    }
    
    /** Verifica se a pilha Negra (preta) está vazia */
    public boolean isEmptyN() {
       return (topoN == elementos.length);
    }
    
    /** Verifica se a pilha está cheia */
    public boolean isFull() {
        return (topoR+1 == topoN);
    }
    
    /** Adiciona um elemento ao topo da pilha Rubro (vermelha) - mais à direita */
    public void pushR() {
        Object novoArrayElementos[];
        int size;
        int size_elementos;
        
        if(isFull()) {
            size = elementos.length;
            size = size * 2;
            size_elementos = elementos.length;
            novoArrayElementos = new Object[size];
            
            // Inserindo os elementos de Rubro (vermelha) no novo array
            for(int i = 0; i <= topoR; i++) {
                novoArrayElementos[i] = elementos[i];
            }
            
            // Inserindo os elementos de Negra (preta) no novo array
            for(int i = size_elementos; i > topoN; i--) {
                novoArrayElementos[(size)-1] = elementos[size_elementos-1];
                size_elementos--;
            }
            
            elementos = novoArrayElementos;
        }
        topoR++;
        elementos[topoR] = 'R';
    }
    
    /** Adiciona um elemento ao topo da pilha Negra (preta) - mais à esquerda */
    public void pushN() {
        if(isFull()) {
            throw new RuntimeException("Stack Overflow!!! -- Pilha cheia");
        }
        topoN--;
        elementos[topoN] = 'N';
    }
    
    /** Remove o elemento do topo da pilha Rubro (vermelha) */
    public Object popR() {
        if(isEmptyR()) {
            throw new RuntimeException("Pilha vazia");
        }
        Object elemento = elementos[topoR];
        elementos[topoR] = null;
        topoR--;
        return elemento;
    }
    
    /** Remove o elemento do topo da pilha Negra (preta) */
    public Object popN() {
        if(isEmptyN()) {
            throw new RuntimeException("Pilha vazia");
        }
        Object elemento = elementos[topoN];
        elementos[topoN] = null;
        topoN++;
        return elemento;
    }
       
    /** Retorna o elemento no topo (último adicionado) da pilha Rubro (vermelha) */
    public Object topR(){
        if(isEmptyR()) {
            throw new RuntimeException("Pilha vazia");
        }
        return elementos[topoR];
    } 
    
    /** Retorna o elemento no topo (último adicionado) da pilha Negra (preta) */
    public Object topN(){
        if(isEmptyN()) {
            throw new RuntimeException("Pilha vazia");
        }
        return elementos[topoN];
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }
    
    
}
