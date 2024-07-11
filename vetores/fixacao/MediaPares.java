package fixacao;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos o vetor vai ter? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        int sum = 0;
        int quantidadePares = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Digite o número: ");
            vetor[i] = sc.nextInt();

            if (vetor[i] % 2 == 0) { //Verifica quais números o resto da divisão é zero
                sum += vetor[i]; //Soma os vetores
                quantidadePares ++; //Soma a quantidade de vezes que acha
            }
        }

        if (sum > 0) { //Verifica se existe números na soma dos pares
            System.out.println("Média dos pares: " + (sum/quantidadePares));
        } else {
            System.out.println("Nenhum número par!");
        }
        
        sc.close();
    }
}
