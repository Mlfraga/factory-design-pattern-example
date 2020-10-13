package pattern.design.factory;

import pattern.design.factory.calculation.Calculation;

public class Product {
    private final String name;
    private final double price;
    private Calculation calculation;

    public Product(String name, double price, Calculation calculation) {
        this.name = name;
        this.price = price;
        this.calculation = calculation;
    }

    public double calculateFinalPrice(){
        return this.calculation.calculate(this.price);
    }

    @Override
    public String toString() {
        return "Produto{" + "name=" + name + ", price=" + price + ", calculation=" + calculation + '}';
    }
}
