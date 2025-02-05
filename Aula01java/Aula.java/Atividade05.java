import java.util.Scanner;

public class Atividade05 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite sua força: ");
        double forca=sc.nextDouble();
        
        System.out.println("Digite sua distância: ");
        double distancia=sc.nextDouble();

        double trabalho = forca*distancia;

        System.out.println(trabalho);
        
        
        
        
        
        
        
        sc.close();
    }
}
