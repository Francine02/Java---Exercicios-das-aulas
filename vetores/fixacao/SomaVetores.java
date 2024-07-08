package vetores.fixacao;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor?");
        int n = sc.nextInt();

        int[] vetorA = new int[n]; //Vetores criados
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < n; i++){ //Para inserir os valores do vetor A
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i < n; i++){//Para inserir os valores do vetor B
            vetorB[i] = sc.nextInt();
        }

        System.out.println("Aqui está a soma dos dois vetores:");
        for(int i = 0; i < n; i++){ //Para somar os dois vetores e mostrar
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }

        sc.close();
    }
}
