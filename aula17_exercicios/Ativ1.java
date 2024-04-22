package aula17_exercicios;

import java.util.Scanner;

public class Ativ1 {
/*1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /*System.out.println("Digite um numero (1-10): ");
        int numero = scan.nextInt();

        if (numero <= 10){
            System.out.println("O valor é valido");
        }
        else {
            System.out.println("O valor é inválido");
        }*/

        double nota;
        do {
            System.out.println("Digite um numero (1-10): ");
            nota = scan.nextDouble();
        
        if (nota < 0 || nota > 10){
            System.out.println("Valor inválido! A nota deve estar entre zero e 10");
        }
        
        } while (nota < 0 || nota > 10);
        System.out.println("Nota válida: " + nota);
              


        scan.close();
        }
    }


