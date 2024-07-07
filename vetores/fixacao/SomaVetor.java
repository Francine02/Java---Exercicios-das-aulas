package vetores.fixacao;

import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        int sum = 0;
        int media = 0;

        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número: ");
            vetor[i] = sc.nextInt();

            sum += vetor[i];
            media = sum / n;
        }

        System.out.print("Valores: ");

        for(int i = 0; i<vetor.length; i ++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\nSoma = " + sum + "\nMedia = " + media);
        sc.close();
    }
}
