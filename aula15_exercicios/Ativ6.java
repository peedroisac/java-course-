package aula15_exercicios;

import java.util.Scanner;

public class Ativ6 {

    //6. Faça um Programa que leia três números e mostre o maior deles.

    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Insira o 1º valor: ");
    double valor1 = scan.nextDouble();
    
    System.out.println("Insira o 2º valor: ");
    double valor2 = scan.nextDouble();
    
    System.out.println("Insira o 3º valor: ");
    double valor3 = scan.nextDouble();
    
    double maiorValor = valor1;

    if (valor2 > maiorValor){}
        maiorValor = valor2;

    if (valor3 > maiorValor){}
        maiorValor = valor3;

    System.out.println("O maior valor é: " + maiorValor);
    
    }

}
