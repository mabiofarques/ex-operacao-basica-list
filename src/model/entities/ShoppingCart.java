package model.entities;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> myCart;

    public ShoppingCart(){
        this.myCart = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity){
        Item item = new Item(name, price, quantity);
        this.myCart.add(item);
    }

    public void removeItem(String name) {
        List<Item> itemToRemove = new ArrayList<>();
        if (this.myCart.isEmpty()){
            throw new RuntimeException("Theres nothing in the cart");
        }
        for (Item item :myCart){
            if (item.getName().equalsIgnoreCase(name)){
                itemToRemove.add(item);
            }
        }
        myCart.removeAll(itemToRemove);
    }

    public String calculateTotalValue(){
        double totalValue =  0;
        if (!myCart.isEmpty()) {
            for (Item x : myCart) {
                double valueItem = x.getPrice() * x.getQuantity();
                totalValue += valueItem;
            }
            return "Total to pay: $ "+ totalValue;
        }
        else {
            throw new RuntimeException("Theres nothing to calculate!");
        }
    }

    public void showItems(){
        System.out.println(this.myCart);
    }

    @Override
    public String toString() {
        return "ShoppingCart {" + myCart + '}';
    }
}
