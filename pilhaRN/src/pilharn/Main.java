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
        
            
        System.out.println(p.isFull()+""+p.topoR+""+p.topoN);
        System.out.println(p.topoN+" "+p.topoR);

            
        for(int i = 0; i < p.size(); i ++) {
            System.out.println(p.elementos[i]);
        }
    }
    
}
