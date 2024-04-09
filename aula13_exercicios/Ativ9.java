package aula13_exercicios;

import java.util.Scanner;

public class Ativ9 {

    /*9. Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.
o C = (5 * (F-32) / 9). */

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor em Farenheit: ");
        float valorFaren = scan.nextFloat();
        System.out.println("O valor transformado é o de: " + (5 * (valorFaren - 32) / 9));
        
        
        scan.close();


    }
}
