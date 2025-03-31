package Prova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do produto: ");
        String name = sc.next();
        System.out.print("Preço: ");
        double price = sc.nextDouble();
        System.out.print("Quantidade do produto: ");
        int quantityInStock = sc.nextInt();

        Produto produto = new Produto(name,price,quantityInStock);

        System.out.print("Quantidade de items vendido: ");
        produto.saleProduct(sc.nextInt());

        System.out.printf(
                "Produto: " + name +
                        "\nPreço: R$ " + price +
                        "\nEstoque antes da venda: " + quantityInStock + " unidades" +
                        "\nVenda realizada: " + produto.quantityInSale + " unidades" +
                        "\nQuantidade em estoque: " + produto.quantityInStock + " unidades"
        );

    }
}