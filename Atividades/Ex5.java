package Estudo;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1,n2;

        System.out.println("Digite o numero 1");
        n1 = sc.nextInt();
        System.out.println("Digite o numero 2");
        n2 = sc.nextInt();

        if(n1>n2){
            System.out.println("numero 1 maior que o numero 2");
        }
        else if (n2>n1) {
            System.out.println("numero 2 maior que o numero 1");
        }
        else{
            System.out.println("os numeros sao iguais");
        }
    }
}
