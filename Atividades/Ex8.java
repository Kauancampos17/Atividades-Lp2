package Estudo;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Raio;
        Float Total;

        System.out.println("qual o valor do raio? ");
        Raio = sc.nextInt();
        Total = (float) (3.14 * Raio * Raio);

        System.out.println("o valor da circuferencia e " + Total);
    }
}
