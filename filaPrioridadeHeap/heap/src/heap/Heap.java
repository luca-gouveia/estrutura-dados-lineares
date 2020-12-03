package heap;

import java.util.Arrays;

/**
 *
 * @author luca
 */
public class Heap {
    private int vetor[];
    private int size;
    
    public Heap(int tamanho){
        this.vetor = new int[tamanho];
        this.size = 0;
    }
    
    public void insert(int elemento){
        this.vetor[this.size] = elemento; 
        heapifyUp(size);
        this.size++;

    }
    
    /**
       * Compara o filho com o pai para tentar uma troca de posicao caso seja necessario
     */
    public void heapifyUp(int size){
        int filho = size;
        int pai = filho/2;
        
        if(pai >= 1){
            if (this.vetor[filho] > this.vetor[pai]) {
                int aux = this.vetor[pai];
                this.vetor[pai] = this.vetor[filho];
                this.vetor[filho] = aux;
                heapifyUp(pai);
            }
        }
    }
    
    public void heapifyDown(int size){
        int pai = size;
        
        int filhoEsq = pai*2;
        int filhoDir = (pai*2)+1;
        
        int maior = pai;
        
        if((filhoEsq <= size) && this.vetor[filhoEsq] > this.vetor[maior]) {
            maior = filhoEsq;
        } 
        
        if((filhoDir <= size) && this.vetor[filhoDir] > this.vetor[maior]) {
            maior = filhoDir;
        } 
        
        if(maior != pai) {
            int aux = this.vetor[pai];
            this.vetor[pai] = this.vetor[maior];
            this.vetor[maior] = aux;
            heapifyDown(maior);
        }
    }
    
    public int min() {
        int minValue = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < minValue && vetor[i] != 0) {
                minValue = vetor[i];
            }
        }
        return minValue;
    }
    
    public int getMin() {
        int minValueIndex = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < minValueIndex && vetor[i] != 0) {
                minValueIndex = i;
            }
        }
        return minValueIndex;
    }
    
    public int remove(){
        int removed = this.vetor[1]; // Recebe o elemento de maior prioridade na fila
        this.vetor[1]= this.vetor[size];
        this.size--;
        heapifyDown(1);
        return removed;
    }
    
     public int removeMin(){
        int removed = getMin(); // Recebe o elemento de maior prioridade na fila
        this.vetor[1]= this.vetor[size];
        this.size--;
        heapifyDown(1);
        return removed;
    }
    
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return Arrays.toString(vetor); 
    }
    
}
