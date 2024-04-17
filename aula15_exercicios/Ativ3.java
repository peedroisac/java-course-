package aula15_exercicios;

import java.util.Scanner;

public class Ativ3 {

    /*3. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. */


    public static void main(String[] args){

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o gêneor: F - Feminino / M - Masculino: ");
        String genero = scan.nextLine();

        if (genero.equalsIgnoreCase("F")){
            System.out.println("A letra digitada foi F");
        } else if (genero.equalsIgnoreCase("M")){
            System.out.println("A letra digitada foi M");
        } else {
            System.out.println("Gênero inválido");
        }
            
    }

}
