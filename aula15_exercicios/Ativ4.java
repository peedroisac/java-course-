package aula15_exercicios;

import java.util.Scanner;

public class Ativ4 {

    /*4. Faça um Programa que verifique se uma letra digitada é vogal ou
consoante. */

     public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String input = scan.next();

        //verifica foi digitado apenas 1 caractere 
        if (input.length() == 1){
            char letra = input.charAt(0);
        
            //verifica se o caractere é uma vogal
            if (isVogal(letra)) {
                System.out.println("A letra digitada é uma vogal.");
            } else {
                System.out.println("A letra digitada é uma consoante");
            }
        } else {
            System.out.println("Por favor, digite apenas uma letra.");
        }

     }

     public static boolean isVogal(char letra) {
        letra = Character.toUpperCase(letra); //Conveertendo para maiúscula para simplificar a comparação
        return letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U';
    }

}
