package polimorfismo.produto;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import polimorfismo.produto.entities.Product;
import polimorfismo.produto.entities.UsedProduct;
import polimorfismo.produto.entities.ImportedProduct;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Entre com o numero de produtos: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do produto #" + i + ":");
            System.out.print("Comum, usado, importado (c/u/i)? ");
            char type = sc.next().toLowerCase().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();  // Consome a nova linha
            String name = sc.nextLine();
            System.out.print("Preco: ");
            double price = sc.nextDouble();

            if (type == 'c') {
                products.add(new Product(name, price));
            } else if (type == 'u') {
                System.out.print("Data de fabricacao (DD/MM/YYYY): ");
                try {
                    LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    products.add(new UsedProduct(name, price, date));
                } catch (DateTimeParseException e) {
                    System.out.println("Data de fabricacao invalida. Tente novamente.");
                    i--; // Para repetir a entrada deste produto
                    sc.nextLine();  // Limpa o buffer
                }
            } else if (type == 'i') {
                System.out.print("Taxa de importacao: ");
                double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            } else {
                System.out.println("Tipo de produto invalido. Tente novamente.");
                i--; // Para repetir a entrada deste produto
            }
        }

        System.out.println();
        System.out.println("ETIQUETAS DE PRECO:");
        for (Product prod : products) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
