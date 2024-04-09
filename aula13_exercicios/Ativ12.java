package aula13_exercicios;

import java.util.Scanner;

public class Ativ12 {

    /*12. Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58 */
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira sua altura: ");
        float valorAltura = scan.nextFloat();
        double resultado = 72.7 * valorAltura - 58;
        System.out.println("Seu peso ideal é: " + resultado );
        
        
        scan.close();


    }
}
