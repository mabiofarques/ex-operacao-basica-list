package model.application;

import model.entities.Item;
import model.entities.ShoppingCart;

public class Program {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem("Joystick", 99, 2);
        shoppingCart.addItem("Mouse", 50.99, 1);
        shoppingCart.showItems();
        System.out.println(shoppingCart.calculateTotalValue());
        shoppingCart.removeItem("mouse");
        shoppingCart.showItems();
        System.out.println(shoppingCart);

    }
}
