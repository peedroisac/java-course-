package aula13_exercicios;

import java.util.Scanner;

public class Ativ3 {
       public static void main(String [] args){

        //3. Faça um Programa que peça dois números e imprima a soma.
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int valor1 = scan.nextInt();
        System.out.println("Digite outro número: ");
        int valor2 = scan.nextInt();
        System.out.println("A soma dos valores é igual a: " + (valor1 + valor2));
        scan.close();

    }
}