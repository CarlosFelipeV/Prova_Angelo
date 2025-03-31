package Prova;

public class Produto {
    String nameProduct;
    double priceProdcut;
    int quantityInStock;
    int quantityInSale;

    Produto(String name, double price, int quantity) {
        this.nameProduct = name;
        this.priceProdcut = price;
        this.quantityInStock = quantity;
    }

    protected void saleProduct(int quantity) {
        if (quantity > quantityInStock) {
            System.out.println("Items insufficient");
        } else {
            this.quantityInStock -= quantity;
            this.quantityInSale += quantity;
        }
    }
}