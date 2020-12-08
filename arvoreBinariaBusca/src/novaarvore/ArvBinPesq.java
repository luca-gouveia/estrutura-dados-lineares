package novaarvore;

/**
 *
 * @author luca
 */
class No {
    private int valor;

    public No(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }    
}
public class ArvBinPesq {
    No raiz;
    ArvBinPesq esquerda;
    ArvBinPesq direita;
    int tamanho;
   

    public ArvBinPesq(No raiz) {
        this.raiz = raiz;
        this.esquerda = null;
        this.direita = null;
    }
    
    public ArvBinPesq() {
        this.raiz = null;
        this.esquerda = null;
        this.direita = null;
    }

    /**Verifica se a arvore esta vazia*/
    public boolean isEmpty(){
        return this.raiz == null;
    }
    
    /**Retorna a quantidade de itens da arvore*/
    public int size(){
        System.out.println("\ntamanho: "+this.tamanho);
        return this.tamanho;
    }  
    
    public void insert(int valorNovoNo) {
        No novoNo = new No(valorNovoNo);
        if(isEmpty()) {
            this.raiz = novoNo;
        } else {
            ArvBinPesq novaArvore = new ArvBinPesq(novoNo);
            if(novoNo.getValor() < this.raiz.getValor()) { // inserir na esquerda
                if(this.getEsquerda() == null) {
                    this.setEsquerda(novaArvore);
                } else {
                    this.getEsquerda().insert(valorNovoNo); // passa a responsabilidade para a subarvore esquerda
                }
            } else if(novoNo.getValor() > this.raiz.getValor()) { // inserir na direita
                if(this.getDireita() == null) {
                    this.setDireita(novaArvore);
                } else {
                    this.getDireita().insert(valorNovoNo);
                }
            }
        }
        
        tamanho++;
    }
    
    public boolean comparaArvBinPesq(ArvBinPesq a, ArvBinPesq b) {
        if (a == null && b == null) {
            return true;
        }else if (a != null && b != null)  {
            return (
                    comparaArvBinPesq(a.getEsquerda(), b.getEsquerda()) && 
                    comparaArvBinPesq(a.getDireita(), b.getDireita())
                    );
        }
        return false;
    }
    
    public void mostrarArvore(ArvBinPesq arvore, int space) {  
        if (arvore == null) {
          return;   
        } 
        
        space += 10;  
        mostrarArvore(arvore.getDireita(), space);  
        System.out.println("");  
        
        for (int i = 10; i < space; i++){
            System.out.print(" ");  
        }  
        
        System.out.print(arvore.raiz.getValor() + "\n ");  
        mostrarArvore(arvore.getEsquerda(), space);  
    }  

    public void mostrar(ArvBinPesq raiz){  
        mostrarArvore(raiz, 0);  
    } 
      
    public int heightMax(int a, int b){
        return a >= b ? a : b;
    }

    private int findHeight(ArvBinPesq raiz){
        if (raiz == null) {
            return -1;
        }

        int esq = findHeight(raiz.getEsquerda());
        int dir = findHeight(raiz.getDireita());

        if (esq > dir) {
            return esq + 1;
        } else {
            return dir + 1;
        }
    }
    
    public int height(){
        System.out.println("\naltura maxima: "+findHeight(this));
        return findHeight(this);
    }
    
    public void findDepth(ArvBinPesq no, int profundidade) { 
        if(no == null){
            return;
        } 
      
       if(profundidade != 0) { 
            findDepth(no.getEsquerda(), profundidade - 1); 
            findDepth(no.getDireita(), profundidade - 1); 
            System.out.println(profundidade); 

        } 
    }
    
    public void depth(int valor){
        ArvBinPesq no = findValueSearch(valor);
        findDepth(no, 4);
    }
    
    public ArvBinPesq findValueSearch(int valor) {
        ArvBinPesq no = this;
        if(no == null) {
           return null;
        }
        if(no.getRaiz().getValor() == valor){
            return no;
        } else {
            if(valor < this.raiz.getValor()){
                if(this.getEsquerda() == null) {
                    return null;
                } else {
                    return this.getEsquerda().findValueSearch(valor); // Responsabilidade passada para a subarvore esquerda
                } 
            } else if(valor > this.raiz.getValor()) {
                if(this.getDireita() == null) {
                    return null;
                } else {
                    return this.getDireita().findValueSearch(valor); // Responsabilidade passada para a subarvore esquerda
                } 
            }
            return null;
        }
    }
    public boolean search(int valor) {
        return findValueSearch(valor) != null ? true : false;
    }
    
    public int root(){
        System.out.println("\nroot: "+this.raiz.getValor());
        return this.raiz.getValor();
    }
    
    public int remover(int valor) {
        No no = findValueSearch(valor).getRaiz();
        remover(no);
        return valor;
    }
    
    public ArvBinPesq remover(No elem){
        if (this.raiz.getValor() == elem.getValor()){
            if (this.direita == null && this.esquerda == null){
                return null;
            }
            else{
                if (this.esquerda != null && this.direita == null){
                    return this.esquerda;    
                }
                else if (this.direita != null && this.esquerda == null){
                    return this.direita;
                }
                else{
                    ArvBinPesq aux = this.esquerda;
                    while (aux.direita != null){ // enquanto houver filhos à direita
                        aux = aux.direita;
                    }
                    this.raiz = aux.getRaiz();  
                                                   // o maior dentre os menores
                    aux.setRaiz(elem);         
                    this.esquerda = esquerda.remover(elem);
                }
            }
        }
        else if (elem.getValor() < this.raiz.getValor()){
            // delegar a responsabilidade à sub-arvore da esquerda
            this.esquerda = this.esquerda.remover(elem);
        }
        else if (elem.getValor() > this.raiz.getValor()){
            // delegar a responsabilidade à sub-arvore da direita
            this.direita = this.direita.remover(elem);
        }
        return this;
    }
    
    
    
    //----------------------------------------------------------- GETS - SETS
    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No no) {
        this.raiz = no;
    }

    public ArvBinPesq getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(ArvBinPesq esquerda) {
        this.esquerda = esquerda;
    }

    public ArvBinPesq getDireita() {
        return direita;
    }

    public void setDireita(ArvBinPesq direita) {
        this.direita = direita;
    }
   
}

