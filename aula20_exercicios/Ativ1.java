package aula20_exercicios;

import java.util.Random;

public class Ativ1 {
/* 1. Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
9. Após isso determine o maior número da matriz e a sua posição
(linha, coluna).*/

    public static void main(String[] args) {
        
        int[][] numerosListas = new int[4][4];
        
        
        /*/
        numerosListas[0][0] = 8;
        numerosListas[0][1] = 7;
        numerosListas[0][2] = 4;
        numerosListas[0][3] = 5;

        numerosListas[1][0] = 7;
        numerosListas[1][1] = 9;
        numerosListas[1][2] = 3;
        numerosListas[1][3] = 1;

        numerosListas[2][0] = 6;
        numerosListas[2][1] = 7;
        numerosListas[2][2] = 4;
        numerosListas[2][3] = 2;

        numerosListas[3][0] = 5;
        numerosListas[3][1] = 9;
        numerosListas[3][2] = 2;
        numerosListas[3][3] = 3;*/

        Random random = new Random();
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                numerosListas[i][j] = random.nextInt(10);

            }
        }

        System.out.println("Matriz: ");
        for (int i=0; i<4 ; i++){
            for (int j=0; i<4 ; j++){
                System.out.println(numerosListas[i][j] + " ");
            }
            System.out.println();

        }
        int maiorNumero = numerosListas[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if(numerosListas[i][j] > maiorNumero){
                    maiorNumero = numerosListas[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
            
            System.out.println("O maior número da matriz é: " + maiorNumero);
            System.out.println("Ele está na posição: (" + linhaMaior + ", " + colunaMaior + ")");
    }
        }

}

