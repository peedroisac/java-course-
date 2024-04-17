package aula15_exercicios;

import java.util.Scanner;

public class Ativ1 { 

    /*1. Faça um Programa que peça dois números e imprima o maior deles. */
    public static void main(String[] args){

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        int valor1 = scan.nextInt();

        System.out.println("Insira outro valor: ");
        int valor2 = scan.nextInt();

        if (valor1 > valor2){
            System.out.println("Este é o maior valor: " + valor1);
        } else if (valor1 < valor2){
            System.out.println("Este é que é o maior valor: " + valor2);
        } else {
            System.out.println("Os valores são iguais");
        }


    }

}
