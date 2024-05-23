package aula27_exercicios;

public class Ativ2 {

    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 500;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
    
        boolean saqueEfetuado = conta.realizarSaque(10);

        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo atual da conta = " + conta.saldo);
        } else {
            System.out.println("Não foi possivel realizar saque. Saldo insuficiente");
        }
    
        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de 500 reais");
        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            System.out.println("Saldo atual da conta = " + conta.saldo);
        } else {
            System.out.println("Não foi possivel realizar saque. Saldo insuficiente");
        }

        System.out.println("Depósto de 500 reais");
        conta.depositar(500);
        System.out.println("Saldo atual da conta = " + conta.saldo);
    
        if (conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial");
        } else {
        System.out.println("Não está usando cheque especial");
        }

        conta.realizarSaque(600);
        System.out.println("Saldo atual da conta = " + conta.saldo);
        if (conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial");
        } else {
        System.out.println("Não está usando cheque especial");
        }
    }
}

