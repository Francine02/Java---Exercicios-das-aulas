package fixacao;

import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serâo digitadas? ");
        int n = sc.nextInt();

        String[] vetorNome = new String[n]; //Vetores que iram receber as informações
        int[] vetorIdade = new int[n];
        double[] vetorAltura = new double[n];

        double sum = 0;
        int menores = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nDados da " + (i + 1) + " pessoa:");
            System.out.print("Nome: ");
            vetorNome[i] = sc.next();

            System.out.print("Idade: ");
            vetorIdade[i] = sc.nextInt();

            System.out.print("Altura: ");
            vetorAltura[i] = sc.nextDouble();

            sum += vetorAltura[i];

            if (vetorIdade[i] < 16) { //Contando quantas pessoas tem idade menor que 16
                menores ++;
            }
        }

        System.out.printf("\nAltura média: %.2f\n", (sum / n));
        System.out.println("Nome das pessoas com menos de 16 anos:");
        double porcentagem = ((double)menores / n) * 100; //Realizando a porcentagem

        for(int i =0; i < n; i++){ //Percorrendo o vetor e um if com base na idade para mostra as pessoas menores que 1
            if (vetorIdade[i] < 16) {
                System.out.println(vetorNome[i]);
            }
        }
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");

        sc.close();
    }
}
