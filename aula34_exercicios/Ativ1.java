package aula34_exercicios;

public class Ativ1 {

    static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        imprimirValor();
        
        Contador.incrementar();

        imprimirValor();

        Contador.zerar();

        imprimirValor();

        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();

        imprimirValor();

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();


        imprimirValor();
    }
}
