import java.util.Locale;

public class Numeros {

    public static void main (String[] args){

        double a =6;
        double b=5;
        double soma= a+b;

        System.out.println(soma);
        Locale.setDefault(Locale.US);
        System.out.printf("Resultado: %.2f%n", soma);
        
        
    }
}