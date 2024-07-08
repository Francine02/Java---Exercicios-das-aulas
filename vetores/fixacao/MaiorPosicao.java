package vetores.fixacao;

import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai digitar?");
        int n = sc.nextInt();  // Lê a quantidade de números que serão digitados
        int[] vetor = new int[n];  // Cria um vetor para armazenar os números

        int maior = vetor[0];  // Tenta inicializar 'maior' com o primeiro elemento do vetor (o que causa um erro)
        int posicaoMaior = 0;  // Inicializa a posição do maior valor como 0

        for(int i = 0; i < n; i++) {
            System.out.print("Digite o número: ");
            vetor[i] = sc.nextInt();  // Lê um número do usuário e armazena no vetor

            if (vetor[i] > maior) {  // Verifica se o número atual é maior que o maior valor encontrado até agora
                maior = vetor[i];  // Atualiza o maior valor
                posicaoMaior = i;  // Atualiza a posição do maior valor
            }
        }
        System.out.println("\nMaior valor: " + maior + "\nPosição do número maior: " + posicaoMaior + "ª" );  // Exibe o maior valor e sua posição
        sc.close();
    }
}
