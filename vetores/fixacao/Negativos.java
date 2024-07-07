package vetores.fixacao;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int quantidadeNumeros = sc.nextInt(); //Recebe a quantidade de números que vão ser inseridps

        int[] vetor = new int[quantidadeNumeros]; //Vetor com tamanho referente a quantidade digitada pelo usuário
        int maximo = 10; //Controlador para comparar

        if (quantidadeNumeros > maximo) { //Verificando a quantidade de números que o usuário quer inserir e se é maior que a permitida
            System.out.println("A quantidade de números possíveis para serem inseridos é 10!!");
        } else { //Inserindo no vetor os números
            for(int i = 0; i < vetor.length; i++){
                System.out.print("Digite um número: ");
                vetor[i] = sc.nextInt();
            }
        }

        System.out.println("NÚMEROS NEGATIVOS:");
        for(int i = 0; i < vetor.length; i++) { //Percorrendo o vetor e o if para verificar os números negativos para mostrar ao usuário
            if(vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }
        sc.close();
    }
}
