package arvorebinariabusca;

/**
 *
 * @author luca
 */
public class ArvoreBinaria {
    No raiz;
    int size;
    
    public void insert(int valorNovoNo) {
        No novoNo = new No(valorNovoNo);
        
        if(isEmpty()){
            this.raiz = novoNo;
        } else {
            addNo(novoNo);
        }
        size++;
    }
    
    public void addNo(No novoNo) {
        No noAtual = this.raiz; // a verificacao sempre vai comecar pelo no raiz a fim de adicionar um novo no a arvore
        No noPai;

        while(true) {
            noPai = noAtual;

            if(novoNo.getValor() < noAtual.getValor()) {
                noAtual = noAtual.getEsquerda(); // Desce um nivel para verificar a possibilidade de insercao

                if(noAtual == null) {
                    noPai.setEsquerda(novoNo);
                    return;
                }
            } else {
                noAtual = noAtual.getDireita();

                if(noAtual == null) {
                    noPai.setDireita(novoNo);
                    return;
                }
            }
        }
    }
    
    /**Verifica se a arvore esta vazia*/
    public boolean isEmpty(){
        return this.raiz == null;
    }
    
    /**Retorna a quantidade de itens da arvore*/
    public int size(){
        return this.size;
    }    
    

}
