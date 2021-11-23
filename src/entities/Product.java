package entities;

import java.util.ArrayList;

public class Product {

    private final String nameP;
    private double priceP;
    //use var
    private ArrayList<Product> list;

    public Product(String nameP, double priceP) {
        this.nameP = nameP;
        this.priceP = priceP;
        list.add(new Product(nameP, priceP));
    }

    public String getNameP() {
        return nameP;
    }

    public double getPriceP() {
        return priceP;
    }

    public void setOnSaleProduct(double newPrice, Product p) {
        p.priceP = newPrice;
    }

    @Override
    public String toString() {
        for (Product p : list) {
            return "Position: " + list.indexOf(p)
                    + "Product name: " + p.nameP
                    + String.format("\nProduct price: %.2f", p.priceP);
        }
        return "\n--------";
    }
}
