package Estudo;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N1,N2,Trabalho;
        float Total;

        System.out.println("Digite a 1 nota: ");
        N1 = sc.nextInt();
        System.out.println("Digite a 2 nota: ");
        N2 = sc.nextInt();
        System.out.println("Digite a nota do trabalho: ");
        Trabalho = sc.nextInt();

        Total = (N1 + N2 + Trabalho) / 3;

        if(Total >= 7){
            System.out.println("Aprovado!!!");
        }
        else{
            System.out.println("Reprovado!!!");
        }




    }
}
