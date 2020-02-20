package pilharn;

/**
 *
 * @author luca
 */
public class Main {
    public static void main(String[] args) {
        PilhaRN p = new PilhaRN(10);
        
        p.pushR();
        p.pushN();
        p.pushR();
        p.pushN();
        
        System.out.println(p);
        
       
    }
    
}
