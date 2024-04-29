package aula17_exercicios;

import java.util.Scanner;

public class Ativ2 {

    /* 2. Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.*/

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome de Usuário: ");
        String nomeUsuario = scan.nextLine();

        System.out.println("Digite sua senha: ");
        String senhaUsuario = scan.nextLine();

        while (senhaUsuario.equals(nomeUsuario)) {
            System.out.println("ERRO! A senha não pode ser o mesmo nome de usuário");
            
            System.out.println("Insira uma noma senha: ");
            senhaUsuario = scan.nextLine();
        }

        System.out.println("Cadastro realizado com sucesso!");

        scan.close();
    }
}
