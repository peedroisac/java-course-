package aula19;

import java.util.Arrays;

public class Guanabara2 {
// aplicando FOR IT, que usa o : ao invés de ; e usa duas classes ao invés de 3

    public static void main(String[] args) {
        
        double[] v = {3.5, 2.75, 9, -4.5};
        Arrays.sort(v);
        
        for (double valor: v) {
            System.out.println(valor + " ");
        }


    }
}
