package aula45;

public class Teste2 {

    public static void main(String[] args) {

        Object obj1 = obterString();
        String s1 = (String) obj1;

        Object obj2 = "Minha String";
        String s2 = (String) obj2;

        Object obj3 = new Object();
        //String s3 = (String) obj3;

        Object obj4 = obterinteiro();
        String s4 = (String) obj4;
    }

    private static Object obterinteiro() {
        return null;
    }

    private static Object obterString() {
        return null;
    }

    public static String obeterString(){
        return "minha String";
    }

    public static int obeterinteiro(){
        return 1;
    }
}
