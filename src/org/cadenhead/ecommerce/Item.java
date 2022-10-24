package org.cadenhead.ecommerce;

public class Item implements Comparable {
    private String id;
    private String name;
    private double retail;
    private int quantity;
    private double price;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
