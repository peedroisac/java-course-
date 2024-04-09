package aula13_exercicios;

import java.util.Scanner;

public class Ativ10 {

    /*10. Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit. */


    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor em Celsius: ");
        float valorCels = scan.nextFloat();
        System.out.println("O valor transformado para Farenheit é de: " + (valorCels * 1.8 + 32.));
        
        
        scan.close();


    }

}
