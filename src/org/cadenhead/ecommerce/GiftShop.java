package org.cadenhead.ecommerce;

public class GiftShop {
    public static void main(String[] args) {
        Storefront store = new Storefront();
        store.addItem("C01", "Mug", "9.99", "150");
        store.addItem("C02", "LG Mug", "12.99", "82");
        store.addItem("C03", "Mousepad", "10.49", "800");
        store.addItem("D01", "T-Shirt", "16.99", "90");
        store.sort();

        int size = store.getSize();

        for (int i=0; i<size; i++){
            Item show = store.getItem(i);
            System.out.println(
                    "Item ID " + show.getId() + "\n" +
                    "Name: " + show.getName() + "\n" +
                    "Price: " + show.getPrice() + "\n" +
                    "Retail price: " + show.getRetail() + "\n" +
                    "Quantity: " + show.getQuantity() + "\n" +
                    "----------------------------------------"
            );
        }

    }
}
