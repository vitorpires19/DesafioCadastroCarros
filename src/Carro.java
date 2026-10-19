
public class Carro {

    private String nome;
    private String marca;
    private double preco;

    // Construtor
    public Carro(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    // Metodos getters
    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }
}
