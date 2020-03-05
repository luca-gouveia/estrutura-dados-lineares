package pilhalistaligada;

import java.util.Arrays;
/**
 *
 * @author luca
 */
public class Pilha {
    private int tamanho;
    private No topo; // Índice que pega o último elemento armazenado
    
    public Pilha() {
        tamanho = 0;
        topo = null; // posição invalida do vetor 
    }
    
    /** Adiciona um elemento ao topo da pilha */
    public void push(Object elemento) {
        No novoNo = new No(elemento);
        novoNo.setProximo(this.topo);
        topo = novoNo;
        tamanho++;
    }
    
    /** Remove o elemento do topo da pilha */
    public Object pop() {
        if(isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        
        Object elemento = topo.getElemento();
        topo = topo.getProximo();
        
        return elemento;
    }

    /** Verifica se a pilha está vazia */
    public boolean isEmpty() {
       return (topo == null);
    }
    
    /** Retorna o elemento no topo (último adicionado) da pilha */
    public Object top(){
        if(isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return topo.getElemento();
    }

   public void exibir() {
        String saida = "";
        
        if(isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        } else {
            No atual = topo;
            
            while( atual != null ) {
                if(atual.getProximo() != null) {
                    saida += atual.getElemento()+ " >> ";
                }else {
                    saida += atual.getElemento();
                }
                atual = atual.getProximo();
            }
        }
        
        System.out.println(saida);
    }

    
}