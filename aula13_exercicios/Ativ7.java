package aula13_exercicios;

import java.util.Scanner;

public class Ativ7 {

    /*7. Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário. */

public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o lado ou a altura do quadrado em centímetros: ");
        float valorArea = scan.nextFloat();
        System.out.println("Valor desejado em centímitro é igual a: " + valorArea * valorArea);
        
        
        scan.close();

    }
}