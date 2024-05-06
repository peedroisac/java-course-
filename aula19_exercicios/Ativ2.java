package aula19_exercicios;

import java.util.Scanner;

public class Ativ2 {

/* 2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2.*/

    public static void main(String[] arg) {
    Scanner scan = new Scanner(System.in);

        int[] A = {1,2,3,4,5,6,7,8};

        //construindo o vetor B com elementos de A multiplicados por 2
        int [] B = new int[A.length];

        for (int i = 0; i < A.length; i++){
            B[i] = A[i] * 2;
        }
        
        System.out.println("Vetor A: " + A);
        //imprimirVetor(A);
        System.out.println("Vetor B (elementos de A multipliciados por 2" + B);
        //imprimirVetor(B);
    
        scan.close();
    }

   /*  public static void imprimirVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
            }   

            System.out.println();
        }
            */

    


    
}
