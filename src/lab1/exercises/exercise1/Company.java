package lab1.exercises.exercise1;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
    private String name;
    private final int yearsToForecast = 5;
    private ArrayList<Sale> sales;

    public Company(String name) {
        this.name = name;
        this.sales = new ArrayList<>();
    }

    public boolean addToSalesHistory(Sale sale){
        return sales.add(sale);
    }

    public ArrayList<Sale> calculateForecast() {
        double[] elevatedYears = new double[yearsToForecast];
        double[] elevatedSalesAmount = new double[yearsToForecast];
        double[] yearsPerAmount = new double[yearsToForecast];
        double[] totals = new double[yearsToForecast];
        ArrayList<Sale> results = new ArrayList<>();

        for (int year = 0; year < yearsToForecast; year++) {
            elevatedYears[year] = Math.pow(sales.get(year).getYear(), 2);
            elevatedSalesAmount[year] = Math.pow(sales.get(year).getAmount(), 2);
            yearsPerAmount[year] = sales.get(year).getYear() * sales.get(year).getAmount();
        }

        totals[0] = sales.stream().mapToDouble(Sale::getYear).sum();
        totals[1] = sales.stream().mapToDouble(Sale::getAmount).sum();
        totals[2] = Arrays.stream(elevatedYears).sum();
        totals[3] = Arrays.stream(elevatedSalesAmount).sum();
        totals[4] = Arrays.stream(yearsPerAmount).sum();

        for (int year = 6; year <= yearsToForecast + 5 ; year++) {
            double amount = formulaA(totals) + formulaB(totals) * year;
            Sale newSale = new Sale(amount, year);
            results.add(newSale);
        }

        return results;
    }

    private double formulaA (double[] values) {
        double a = values[1];
        double b = 12 * values[0];
        double c = a - b ;
        return c / 5;
    }

    private double formulaB (double[] values) {
        double a = 5 * values[4];
        double b = 15 * values[1];
        double c = (5 * values[2]);
        double d = Math.pow(values[0], 2);
        double e = a - b;
        double f = c - d;

        return e / f;
    }
}
