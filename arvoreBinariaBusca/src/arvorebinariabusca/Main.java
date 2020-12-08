package arvorebinariabusca;

/**
 *
 * @author luca
 */
public class Main {    
    public static void main(String[] args) {
        
        ArvoreBinaria arv = new ArvoreBinaria();
        
        arv.insert(10);
        arv.insert(8);
        arv.insert(25);
        arv.insert(4);
        arv.insert(3);
        arv.insert(65);


        
        System.out.println(arv.size());
             
    }
}
