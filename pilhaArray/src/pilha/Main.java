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
        p.push("Luca");
        p.push("%");
        p.push(1);
        p.push(10);
        p.push(9);
        
        System.out.println("stack = "+ p);
        System.out.println("len = "+p.size());

        
        System.out.println("Removido ->"+p.pop());
        System.out.println("Removido ->"+p.pop());
        
        System.out.println("stack = "+ p);
        System.out.println("len = "+p.size());
        
        p.push(120);
        
        System.out.println("stack = "+ p);
        System.out.println("len = "+p.size());
        
        p.clear();
        System.out.println("stack = "+ p);

    }
}
