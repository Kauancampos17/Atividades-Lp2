package Estudo;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N1, N2, Total, TotalMais, TotalMenos;
        System.out.println("Digite o primeiro nuemero: ");
        N1 = sc.nextInt();
        System.out.println("Digite o segundo nuemero: ");
        N2 = sc.nextInt();
        Total = N1 + N2;
        if(Total >= 10){
            TotalMais = Total + 5;
            System.out.println("Seu valor foi somado +5: " + TotalMais);
        }
        else{
            TotalMenos = Total - 7;
            System.out.println("Seu valor foi subtraido por -7" + TotalMenos);
        }

    }
}