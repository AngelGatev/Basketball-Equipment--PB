package PbJavaNovember.src.FirstStepsInCoding.Excercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearTax = Integer.parseInt(scanner.nextLine());
        double priceShoes = yearTax * 0.60;
        double priceSuit = priceShoes * 0.80;
        double priceBall = priceSuit * 0.25;
        double priceAcc = priceBall * 0.20;
        double totalSum = yearTax + priceShoes + priceSuit + priceBall + priceAcc;
        System.out.println(totalSum);
    }
}
