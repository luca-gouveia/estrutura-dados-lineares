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
        p.pushR();
        p.pushR();
        p.pushR();
        p.pushN();
        p.pushN();
        p.pushN();
        
        p.popN();
        p.popN();
        p.popN();
        p.popN();
        p.popN();
        
        p.pushR();
        p.pushN();
        p.pushN();
        p.pushN();
        p.pushN();
        p.popN();
        p.pushR();

        System.out.println(p.topoR);
        System.out.println(p.topoN);
        System.out.println(p);
        
        p.pushR();
        
        System.out.println(p);
        
       
    }
    
}
