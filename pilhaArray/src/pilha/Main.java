package pilha;

/**
 *
 * @author luca
 */
public class Main {
    public static void main(String[] args) {
        Pilha p = new Pilha(10);
        
        p.push(5);        
        p.push(4);
        p.push(3);
        p.push(2);
        p.push(1);
        
        System.out.println(p.pop());

    }
}
