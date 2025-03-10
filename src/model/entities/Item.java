package model.entities;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String nome, double price, int quantity) {
        this.name = nome;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product name: "
                + getName()
                + ", Price: $ "
                + String.format("%.2f", getPrice())
                + ", Quantity x "
                + getQuantity();
    }
}
