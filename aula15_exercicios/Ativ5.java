package aula15_exercicios;

import java.util.Scanner;

public class Ativ5 {

        /*5. Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a
dez. */

 public static void main(String[] args){

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("insira sua 1ª nota");
        float valor1 = scan.nextFloat();

        System.out.println("insira sua 2ª nota");
        Float valor2 = scan.nextFloat();

        float media = (valor1 + valor2) / 2; 
        
        
              
        if (media >= 10 ){
            System.out.println("Aprovado com Distinção: " + media);
        }else if (media >= 7) {
            System.out.println("Aprovado: " + media);      
        } else {
            System.out.println("Reprovado: " + media);
        }
        






 }
}
