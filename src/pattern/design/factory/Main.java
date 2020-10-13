package pattern.design.factory;
import pattern.design.factory.car.CarType;
import pattern.design.factory.car.CarsFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o respectivo número da fabricante do carro <1 - Ferrari || 2 - Porsche>: ");
        int manufacturerOption = input.nextInt();

        CarType manufacturer;

        if(manufacturerOption == 1){
            manufacturer = CarType.FERRARI;
        }else{
            manufacturer = CarType.PORSCHE;
        }

        var car1 = CarsFactory.getCar(manufacturer);

        System.out.println(car1.getDescription());
    }
}
