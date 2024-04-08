package aula13_exercicios;

import java.util.Scanner;

public class Ativ5 {

    //5. Faça um Programa que converta metros para centímetros.
        public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do metro a ser convertido: ");
        float valorMetro = scan.nextFloat();
        System.out.println("Valor desejado em centímitro é igual a: " + (valorMetro / 100));
     
        scan.close();
        
    }

    
}
