package aula15_exercicios;

import java.util.Scanner;

public class Ativ2 {
    /*2. Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo. */
    public static void main(String[] args){

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        double valor = scan.nextDouble();

        if (valor > 0 ){
            System.out.println("Este valor é positivo");
        } else if (valor < 0){
            System.out.println("Esse valor é negativo");
        } else {
            System.out.println("O valor inserido é zero");
        }

        
        
    
    
    }
}
