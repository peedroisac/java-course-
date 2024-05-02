package aula19;

public class Arrays {

        @SuppressWarnings("unused")
        public static void main(String[] args) {
            
            double temDia001 = 31.3;
            double temDia002 = 32;
            double temDia003 = 33.7;
            double temDia004 = 34;
            double temDia005 = 33.1;
            double temDia006 = 32.8;
            double temDia007 = 30;
            double temDia008 = 29.8;
            double temDia009 = 31.5;


            double[] temperaturas = new double[365];
            temperaturas[0] = 31.3;
            temperaturas[1] = 32;
            temperaturas[2] = 33.7;
            temperaturas[3] = 34;
            temperaturas[4] = 33.1;
        
            System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
        
            System.out.println("O tamanho do array: " + temperaturas.length);

            System.out.println("Valores do array: " /*+ temperaturas)*/);

            for (int i=0; i<temperaturas.length; i++){
                System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
            }
            
            for(double temp : temperaturas){
                System.out.println(temp);
            }
        
        }


}
