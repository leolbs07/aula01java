import java.util.Scanner;

public class Atividade02 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o valor do primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o valor do segundo número: ");
        double n2 = sc.nextDouble();

        double soma=n1+n2;
        double media = soma/2;

        System.err.println(media);
        sc.close();
    }
}
