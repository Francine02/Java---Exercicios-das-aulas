package fixacao;
import java.util.Scanner;

public class AlturaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Lê o tamanho do vetor a partir da entrada do usuário

        double[] vetor = new double[n]; // Cria um vetor de doubles com tamanho n

        double soma = 0; // Variável para acumular a soma dos valores do vetor

        for (int i = 0; i < vetor.length; i++) { // Percorre o vetor do índice 0 até o último índice
            vetor[i] = sc.nextDouble(); // Lê um valor do usuário e armazena no vetor na posição i
            soma += vetor[i]; // Adiciona o valor lido à soma total
        }

        double avg = soma / vetor.length; // Calcula a média dos valores do vetor
        
        System.out.printf("Altura média: %.2f%n", avg); // Imprime a média formatada com duas casas decimais

        sc.close(); // Fecha o Scanner
    }
}
