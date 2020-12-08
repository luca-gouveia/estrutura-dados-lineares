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
    private No raiz;
    private ArvBinPesq esquerda;
    private ArvBinPesq direita;
    private int tamanho;
   

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
    
    public int findDepth(ArvBinPesq no) { 
        if (no == null){
            return 0; 
        } 
        else { 
            int esqDepth = findDepth(no.getEsquerda()); 
            int dirDepth = findDepth(no.getDireita()); 
   
            if (esqDepth > dirDepth) {
                return (esqDepth + 1); 
            }
             else {
                return (dirDepth + 1);
            }
        } 
    }
    
//    public int depth(int no){
//        System.out.println("\nprofundidade: "+findDepth(no));
//        return findHeight(no);
//    }
    
    
    
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

