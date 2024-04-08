package aula13_exercicios;

import java.util.Scanner;

public class Ativ4 {
    public static void main(String [] args){

        //4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota do 1º bimestre: ");
        float valor1 = scan.nextFloat();
        System.out.println("Digite a nota do 2º bimestre: ");
        float valor2 = scan.nextFloat();
        System.out.println("Digite a nota do 3º bimestre: ");
        float valor3 = scan.nextFloat();
        System.out.println("Digite a nota do 4º bimestre: ");
        float valor4 = scan.nextFloat();
        System.out.println("A média final é: " + (valor1 + valor2 + valor3 + valor4) /4 );
        scan.close();
    }
}