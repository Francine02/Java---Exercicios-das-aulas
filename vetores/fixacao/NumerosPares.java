package fixacao;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai digitar?");

        int n = sc.nextInt();

        int[] vetor = new int[n];

        int pares = 0;

        for(int i = 0; i< vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0 ) {
                pares ++; //Contador com quantas vezes apareceu números pares
            }
        }

        System.out.println("Números pares: ");
        for(int i = 0; i< n; i++) { //Para mostrar os números pares
            if (vetor[i] % 2 == 0 ) {
                System.out.print(vetor[i] + " ");
            }
        }

        System.out.println("\nNúmeros pares: " + pares);
        sc.close();

    }
}
