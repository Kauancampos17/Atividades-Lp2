package Estudo;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N1, N2, Total;

        System.out.println("Digite o primeiro nuemero: ");
        N1 = sc.nextInt();
        System.out.println("Digite o segundo nuemero: ");
        N2 = sc.nextInt();
        Total = N1 + N2;

        if(Total >= 10){
            System.out.println("Seu valor é " + Total);
        }

    }
}
