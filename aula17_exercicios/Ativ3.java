package aula17_exercicios;

import java.util.Scanner;

public class Ativ3 {

    /* 3. Faça um programa que leia e valide as seguintes informações:
        a. Nome: maior que 3 caracteres;
        b. Idade: entre 0 e 150;
        c. Salário: maior que zero;
        d. Sexo: 'f' ou 'm';
        e. Estado Civil: 's', 'c', 'v', 'd';*/

        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = scan.nextLine();

            while (nome.length() <= 3){
                System.out.println("ERRO! O nome deve ser maior que 3 caracteres");

                System.out.println("Digite seu nome novamente: ");
                nome = scan.nextLine();
            }

            System.out.println("Digite sua idade: ");
            int idade = scan.nextInt();

            while (idade < 0 || idade > 150){
                System.out.println("ERRO! Digite uma idade válida: ");
                idade = scan.nextInt();
            }


            System.out.println("Digite seu salário: ");
            double salario = scan.nextDouble();

            while (salario < 0 ){
                System.out.println("ERRO! Digite um valor válido: ");
                salario = scan.nextDouble();
            }

            scan.nextLine();

            /*System.out.println("Digite seu sexo (F - Feminino / M - Masculino): ");
            String genero = scan.nextLine().toUpperCase();

            while (!genero.equals("F") && !genero.equals("M")){
                System.out.println("ERRO! Genero inválido. Digite F para Feminino ou M para Masculino: ");
                genero = scan.nextLine().toUpperCase();
            */

            String sexo;
            boolean sexoValido = false;
            while (!sexoValido){
                System.out.println("Digite seu sexo (F - Feminino / M - Masculino): ");
                sexo = scan.nextLine();

                if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")){
                    sexoValido = true;
                } else {
                    System.out.println("ERRO! Digite apenas 'F para feminino ou 'M para masculino: ");
                }

            }
            
           /* System.out.println("Seu nome é: " + nome);
            System.out.println("Sua idade é: " + idade);
            System.out.println("Seu salario é: " + salario);
            System.out.println("Seu gênero é: " + sexo);*/
            
            scan.close();

    }

}