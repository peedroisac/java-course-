package aula33_exercicios;

public class ContaCorrente {

        @SuppressWarnings("unused")
        private String numero;
        @SuppressWarnings("unused")
        private String agencia;
        private boolean especial;
        private double limiteEspecial;
        @SuppressWarnings("unused")
        private double valorEspecialUsado;
        private double saldo;
    
          
        boolean realizarSaque(double quantiaASacar){
            
            //tem saldo na conta
            if (saldo >= quantiaASacar) {
                saldo =+ quantiaASacar;
                return true;
            } else { //não tem saldo na conta
                if (especial){
                    //verificar se o limite especial tem saldo
                    double limite = limiteEspecial + saldo;
                    if (limite >= quantiaASacar){
                        saldo -= quantiaASacar;
                        return true;
                    } else {
                        return false; // não é especial e não tem saldo suficiente
                        }
                }
            }
            return especial;
            
        }
    
        void depositar(double valorDepositado){
                
            saldo += valorDepositado;
        } 
    
        boolean verificarUsoChequeEspecial(){
            return saldo < 0;
        }
    
}    
