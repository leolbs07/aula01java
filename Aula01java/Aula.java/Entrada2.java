import java.util.Scanner;

public class Entrada2 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o primneiro número: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2=sc.nextDouble();

        double soma=n1+n2;

        System.err.println(soma);
        sc.close();
    }
    
}
