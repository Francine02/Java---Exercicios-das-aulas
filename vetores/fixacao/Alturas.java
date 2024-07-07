package vetores.fixacao;

import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serâo digitadas?");
        int n = sc.nextInt();

        String[] vetorNome = new String[n];
        int[] vetorIdade = new int[n];
        double[] vetorAltura = new double[n];

        int sum = 0;
        double media = sum / n;

        for(int i = 0; i < n; i++) {
            System.out.println("Dados da " + i + " pessoa:");
            System.out.print("Nome: ");
            vetorNome[i] = sc.next();

            System.out.print("Idade: ");
            vetorIdade[i] = sc.nextInt();

            System.out.print("Altura: ");
            vetorAltura[i] = sc.nextDouble();

            sum += vetorAltura[i];
        }

        System.out.println("Altura média: " + media);

        int sumMedia = 0;
        int porcentagem;
        String nomeMenores;

        for(int i = 0; i < n; i++) {

            if (vetorIdade[i] < 16) {
                sumMedia += vetorIdade[i];
                porcentagem = sumMedia / 100;
                nomeMenores = vetorNome[i];
            }
        }


    }
}
