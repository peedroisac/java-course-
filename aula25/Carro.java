package aula25;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel; 

    void exibirAutonomia(){

         System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }
    
    //aula26
    double obterAutonomia() {

        System.out.println("Método obterAutonomia foi chamado.");

        return capCombustivel * consumoCombustivel;
    }
    
    //aula27
    double calcularCombustivel(double km){

        double qtdCombustivel =  km/consumoCombustivel;

        return qtdCombustivel;
    }

}
