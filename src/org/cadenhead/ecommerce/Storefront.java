package org.cadenhead.ecommerce;

import java.util.*;

public class Storefront {
    private LinkedList catalog = new LinkedList();

    public void addItem(String id, String name, String price, String quant){
        Item it = new Item(id, name, price, quant);
        catalog.add(it);
    }
}
