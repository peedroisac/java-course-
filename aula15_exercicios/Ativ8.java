package aula15_exercicios;

import java.util.Scanner;

public class Ativ8 {

     /*8. Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato. */


    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Insira o primeiro preço: ");
    double preco1 = scan.nextDouble();
    
    System.out.println("Insira o segundo preço: ");
    double preco2 = scan.nextDouble();
    
    System.out.println("Insira o terceiro preço: ");
    double preco3 = scan.nextDouble();
    
    /*double maisBarato = preco1;

    if (preco2 < maisBarato){
        maisBarato = preco2;
    }
    if (preco3 < maisBarato){
        maisBarato = preco3;
    }

    System.out.println("o produto mais em conta para você comprar é o queijo de " + maisBarato);*/

    //modelo loiane
    if (preco1 <= preco2 && preco1 <=preco3){
        System.err.println("Compre o produto 1");
    } else if (preco2 <= preco1 && preco2 <= preco3){
        System.out.println("Compre o produto 2");
    } else if (preco3 <= preco1 && preco3 <= preco2) {
        System.out.println("Compre o produto 3");;
    }

    scan.close();
    }
}
