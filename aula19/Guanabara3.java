package aula19;

import java.util.Arrays;

public class Guanabara3 {


    public static void main(String[] args) {
        
        int[] vet = {3, 7, 6, 1, 9, 4, 2};
        for(int v:vet){
            System.err.println(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 8);
        System.out.println("Encontrei o valor na posição " + p);
    }
}
