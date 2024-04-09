package aula13_exercicios;

import java.util.Scanner;

public class Ativ11 {

    /*11. Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo. */

   public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o 1º valor inteiro: ");
        int valor1 = scan.nextInt();
        System.out.println("Insira o 2º valor inteiro: ");
        float valor2 = scan.nextFloat();
        float resultado = (valor1 * 2) * (valor2 / 2) ; 
        System.out.println("para a questão letra A: " + resultado);
        
        System.out.println("Insira o 3º valor inteiro: ");
        float valor3 = scan.nextFloat();
        float resultadoB = (valor1 * 3 + valor3);
        System.out.println("para a questão B: " + resultadoB);

        System.out.println(Math.pow(valor3,3));
       

        scan.close();


    }

}
