/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novaarvore;

/**
 *
 * @author luca
 */
public class Test { 
    public static void main(String[] args) {
//        ArvBinPesq arv = new ArvBinPesq();
//        
//        arv.insert(10);
//        arv.insert(8);
//        arv.insert(25);
//        arv.insert(4);
//        arv.insert(3);
//        arv.insert(65);
        
        ArvBinPesq arv2 = new ArvBinPesq();
        
        arv2.insert(10);
        arv2.insert(5);
        arv2.insert(2);
        arv2.insert(8);
        arv2.insert(15);
        arv2.insert(22);

        arv2.insert(25);

        
        arv2.mostrar(arv2);
        arv2.size();
        arv2.height();
//        arv2.depth(4)
        
//        System.out.println("RESULTADO = > "+arv.comparaArvBinPesq(arv, arv2));
    }
    
}
