package aula27_exercicios;

//import aula27_exercicios.Lampada;

public class Ativ1 {

    public static void main(String[] args) {
        
        Lampada lampada = new Lampada();

        lampada.ligar();

        lampada.mostrarEstado();

        lampada.desligar();

        lampada.mostrarEstado();
        
        lampada.mudarEstado();
   
        lampada.mostrarEstado();
    }
}
