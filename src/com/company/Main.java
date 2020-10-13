package com.company;

import com.company.Calculations.Calculation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o nome do produto");
    String name = input.nextLine();

    System.out.println("Digite o preço do produto");
    double price = input.nextDouble();

    String calculationType = "HALF";

    Product newProduct = new Product(name, price, Factory.createCalculation(calculationType));

    newProduct.calculateFinalPrice();
    System.out.println(newProduct);
    }
}
