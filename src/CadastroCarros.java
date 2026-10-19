
import java.util.Scanner;

public class CadastroCarros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Vetor com capacidade maxima de 50 carros
        Carro[] carros = new Carro[50];

        System.out.println("=== CADASTRO DE CARROS - EBAC ===");

        int quantidade;

        // Validacao do limite de carros
        do {
            System.out.print("\nQuantos carros deseja cadastrar (1 a 50)? ");
            quantidade = scanner.nextInt();
            scanner.nextLine();

            if (quantidade < 1 || quantidade > 50) {
                System.out.println("Quantidade invalida! Informe de 1 a 50.");
            }

        } while (quantidade < 1 || quantidade > 50);

        // Cadastro dos carros
        for (int i = 0; i < quantidade; i++) {

            System.out.println("\n--- Cadastro do carro " + (i + 1) + " ---");

            System.out.print("Nome do modelo: ");
            String nome = scanner.nextLine();

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            double preco;

            do {
                System.out.print("Preco do carro: R$ ");
                preco = scanner.nextDouble();
                scanner.nextLine();

                if (preco < 0) {
                    System.out.println("O preco nao pode ser negativo.");
                }

            } while (preco < 0);

            // Criacao do objeto e armazenamento no vetor
            carros[i] = new Carro(nome, marca, preco);
        }

        // Exibicao e soma dos precos
        double valorTotal = 0;

        System.out.println("\n=== RESUMO DO CADASTRO ===");

        for (int i = 0; i < quantidade; i++) {

            System.out.println(
                    (i + 1) + ". " +
                            carros[i].getMarca() + " " +
                            carros[i].getNome() +
                            " - R$ " +
                            String.format("%.2f", carros[i].getPreco())
            );

            valorTotal += carros[i].getPreco();
        }

        System.out.println("\nQuantidade total de carros: " + quantidade);

        System.out.printf("Soma dos precos: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
