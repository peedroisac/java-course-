package aula24_exercicios;

//public class Ativ1 {
/* 1. Escreva uma classe para representar uma lâmpada que está à venda em
um supermercado.*/

    public class Lampada{

        String tensao;
        String modelo;
        int potencia;
    
    public static void main(String[] args) {
        
    
    Lampada lamp = new Lampada();
    lamp.tensao = "Bivolt";
    lamp.modelo = "Led";
    lamp.potencia = 120;

    System.out.println(lamp.modelo);

   }
}
