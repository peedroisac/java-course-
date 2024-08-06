package aula43_exercicios;

public class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public static void setNomeCliente(String nomeCliente) {
    //    this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public static void setNumConta(String numConta) {
      //  this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ContaBancaria{ " +
                "nomeCliente = '" + nomeCliente + '\'' +
                ", numConta = '" + numConta + '\'' +
                ", saldo = " + saldo +
                '}';
    }

    /*@Override
    public String toString(){
        return super.toString();
    }*/

    public void depositar(double valor) {
        saldo += valor;
    }
    public boolean sacar(double valor) {
        if ((saldo-valor) >= 0){
            saldo -= valor;
            return true;
        }
        return false;
    }

}