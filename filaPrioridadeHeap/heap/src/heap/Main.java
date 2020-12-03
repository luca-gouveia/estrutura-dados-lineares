package heap;

/**
 *
 * @author luca
 */
public class Main {
    public static void main(String[] args) {
        Heap heap1 = new Heap(8);
        
        heap1.insert(40);
        heap1.insert(90);
        heap1.insert(20);
        heap1.insert(10);
        heap1.insert(50);
        heap1.insert(70);
        heap1.insert(80);


        heap1.print();
        
                System.out.println(heap1.min());

        
        heap1.remove();
   

        heap1.print();
        
        
        

    }
}
