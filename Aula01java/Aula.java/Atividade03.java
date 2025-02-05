import java.util.Scanner;

public class Atividade03 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo  valor: ");
        double n2 = sc.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        double n3 = sc.nextDouble();
        System.err.println("\n ");

        double soma = n1+n2+n3;
        double media = soma/3;

        System.out.println("Resultado: "+media);
        sc.close();

    }
    
}
