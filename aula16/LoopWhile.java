package aula16;

public class LoopWhile {

     public static void main(String[] args){

        int i = 1; //count ou cont
        int max = 10;

        System.err.println("contando até " + max);

        while (i <= max) {
            System.out.println("Valor de i: " + i);
            i++; // i = i + 1; ou i += 1;
            }
        
            System.out.println(i);
            
            do {
                i++;
                System.out.println("Valor de i: " + i);
            } while (i < 15);

            System.out.println(i);        
        
        }

    

    }