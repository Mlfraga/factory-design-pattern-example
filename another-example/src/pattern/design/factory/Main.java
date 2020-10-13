package pattern.design.factory;

import pattern.design.factory.calculation.CalculationFactory;
import pattern.design.factory.calculation.CalculationType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String name = input.nextLine();

        System.out.print("Digite o preço do produto: ");
        double price = input.nextDouble();

        CalculationType calculationType = CalculationType.FIFTY_PERCENT_DISCOUNT;

        Product newProduct = new Product(name, price, CalculationFactory.getCalculation(calculationType));

        System.out.println(newProduct);
        System.out.printf("\nPreço final do produto: %s%n", newProduct.calculateFinalPrice());
    }
}
