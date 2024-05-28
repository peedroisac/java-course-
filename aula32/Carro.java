package aula32;

public class Carro {

    private String marca;
    private String modelo;
    private int numPassageiros;
    @SuppressWarnings("unused")
    private double capCombustivel;
    @SuppressWarnings("unused")
    private double consumoCombustivel; 

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String GetModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getNumPassageiros(){
        return this.numPassageiros;
    }
    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros = numPassageiros;
    } 



}
