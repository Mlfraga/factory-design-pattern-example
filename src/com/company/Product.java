package com.company;

import com.company.Calculations.Calculation;

public class Product {
    private String name;
    private double price;
    private double finalPrice;
    private Calculation calculation;

    public Product(String name, double price, Calculation calculation) {
        this.name = name;
        this.price = price;
        this.calculation = calculation;
    }

    public void calculateFinalPrice(){
        this.finalPrice = this.calculation.gainCalculation(this.price);
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + name + ", preco=" + price + ", precoFinal=" + finalPrice + ", estrategiaDeCalculo=" + calculation + '}';
    }

}
