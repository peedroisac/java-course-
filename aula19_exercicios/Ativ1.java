package aula19_exercicios;

import java.util.Scanner;

public class Ativ1 {
/* 1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i]. */
      
    // cod by chatGPT 
    /*public static class Main {
        public static void main(String[] args) {
            // Criando o vetor A com 5 elementos inteiros
            int[] A = {1, 2, 3, 4, 5};
    
            // Construindo o vetor B com os mesmos elementos do vetor A
            int[] B = new int[A.length];
            for (int i = 0; i < A.length; i++) {
                B[i] = A[i];
            }
    
            // Imprimindo os vetores A e B para verificar se B possui os mesmos elementos de A
            System.out.println("Vetor A:");
            imprimirVetor(A);
            System.out.println("Vetor B (cópia de A):");
            imprimirVetor(B);
        }
    
        // Método auxiliar para imprimir os elementos de um vetor
        public static void imprimirVetor(int[] vetor) {
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();
        }
    }*/
    
    //cod by loiane
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int [5];
        int[] vetorB = new int [vetorA.length];

        for (int i=0; i<vetorA.length; i++){

            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i];
        }
                  
        /*for (int i=0; i<vetorA.length; i++){
          vetorB[i] = vetorA[i];
        }*/

        System.out.println("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.println(vetorB[i] + " ");
        }
        System.out.println();

    }






}