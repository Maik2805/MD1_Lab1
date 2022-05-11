package lab1.exercises;

import lab1.exercises.exercise1.Company;
import lab1.exercises.exercise1.Sale;

import java.util.ArrayList;
import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) {
        Company corporacion = new Company("Corporacion S.A");
        loadData(corporacion);

        ArrayList<Sale> forecast = corporacion.calculateForecast();

        System.out.println("=RESULTS=============================================");
        System.out.println("Year" + "|\t Sales Amount");
        for (Sale sale: forecast) {
            System.out.println(sale.getYear() + " \t \t " + sale.getAmount());
        }
    }

    public static void loadData(Company company) {

        Scanner input = new Scanner(System.in);

        System.out.println("== Company S.A ==");
        System.out.println("= Forecast System =");
        System.out.println("Write the sales' amount for the las 5 years... \nRecommendation use (,) don't use (.)");
        System.out.println("------------------------------------");

        for (int sale = 0; sale < 5; sale++) {
            System.out.println("Year: " + (sale+1));
            System.out.print("Write the sales' amount \n->");
            double amount = input.nextFloat();

            Sale newSale = new Sale(amount, (sale+1));
            company.addToSalesHistory(newSale);
        }
    }
}
