package aula13_exercicios;

import java.util.Scanner;

public class Ativ6 {

    //6. Faça um Programa que peça o raio de um círculo, calcule e mostre a sua area
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do raio em centímetros: ");
        float valorRaio = scan.nextFloat();
        System.out.println("Valor desejado em centímitro é igual a: " + (valorRaio * valorRaio * 3));
        
        
        scan.close();
        

    }
}
