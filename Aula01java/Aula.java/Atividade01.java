import java.util.Scanner;
public class Atividade01 {
    

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double n2 = sc.nextDouble();
        System.err.println("\n");

        double soma=n1+n2;
        double sub=n1-n2;
        double mult=n1*n2;
        double div=n1/n2;


        System.err.println(soma);
        System.err.println(sub);
        System.err.println(mult);
        System.err.println(div);
        sc.close();
        

    }
}
