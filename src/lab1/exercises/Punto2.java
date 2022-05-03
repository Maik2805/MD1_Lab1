package lab1.exercises;

import lab1.exercises.exercise2.Company;
import lab1.exercises.exercise2.Sale;

import java.util.ArrayList;

public class Punto2 {
    public static void main(String[] args) {
        Company corporacion = new Company("Corporacion S.A");
        loadData(corporacion);

        ArrayList<Sale> forecast = corporacion.calculateForecast();

        System.out.println("Year" + "\t Sales Amount");
        for (Sale sale: forecast) {
            System.out.println(sale.getYear() + " \t \t " + sale.getAmount());
        }
    }

    public static void loadData(Company company) {
        Sale v1 = new Sale(220, 1);
        Sale v2 = new Sale(245, 2);
        Sale v3 = new Sale(250, 3);
        Sale v4 = new Sale(258, 4);
        Sale v5 = new Sale(273.5, 5);

        company.addToSalesHistory(v1);
        company.addToSalesHistory(v2);
        company.addToSalesHistory(v3);
        company.addToSalesHistory(v4);
        company.addToSalesHistory(v5);
    }

}
