package aula13_exercicios;

import java.util.Scanner;

public class Ativ2 {

    /*2. Faça um Programa que peça um número e então mostre a
mensagem O número informado foi [número]*/
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);
        scan.close();

    }
}
