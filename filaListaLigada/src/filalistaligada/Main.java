package filalistaligada;

/**
 *
 * @author 20181014040029
 */
public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        
        fila.add(1);
        fila.add(2);
        fila.add(3);

//        fila.add(4);
//        fila.add(99);
//        fila.remove();
        fila.remove();
        fila.add(66);


        System.out.println(fila.exibir());
        System.out.println(fila.size());
        System.out.println(fila.front());
        
    }
    
}
