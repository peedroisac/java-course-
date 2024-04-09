package aula13_exercicios;

import java.util.Scanner;

public class Ativ8 {

/*8. Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês. */

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira quanto você ganha por hora de trabalho: ");
        float valorHora = scan.nextFloat();
        System.out.println("Insira a quantidade de horas trabalhadas no mês: ");
        float valorHmes = scan.nextFloat();
        System.out.println("Seu salário do mês é: " + valorHora * valorHmes);
        
        
        scan.close();


    }
}
