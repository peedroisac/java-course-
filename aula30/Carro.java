package aula30;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel; 
    
    public Carro(String marca, String modelo, int numPassageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parâmetros");
    }
    
    public Carro(String marca, String modelo){
        this("Fiat", "Ducato", 10);
        System.out.println("Chamando o construtor com 2 parâmetros"); 
    }




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
