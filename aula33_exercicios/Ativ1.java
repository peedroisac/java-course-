package aula33_exercicios;

public class Ativ1 {

    public static void main(String[] args) {
        
        Lampada lampada = new Lampada(null, null, 0, null, null, 0, args, false, false);

        lampada.ligar();

        lampada.mostrarEstado();

        lampada.desligar();

        lampada.mostrarEstado();
        
        lampada.mudarEstado();
   
        lampada.mostrarEstado();
    
    }
}