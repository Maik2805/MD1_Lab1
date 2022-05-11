package lab1.exercises;

import lab1.exercises.exercise3.Period;
import lab1.exercises.exercise3.ProductionSystem;

import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        ProductionSystem system = loadData();

        system.getProductivityPeriods().forEach(period -> {
            System.out.println("=====================================");
            System.out.println("Period: " + period.getNumberPeriod() +
                    "\n\tTotal Productivity Index: " + period.totalProductivityIndex() +
                    "\n\tLabor Productivity Index: " + period.laborProductivityIndex() +
                    "\n\tRaw Material Productivity Index: " + period.rawMaterialProductivityIndex()
            );
            System.out.println("=====================================");
        });

        System.out.println("=====================================");
        for (int period = 0; period < 3; period++) {
            float variation = system.variationPercentageAgainstPreviousPeriod().get(period);
            System.out.println("Period " + (period + 1 ) +" Against previous period:" + variation + "%");
        }
        System.out.println("=====================================");
    }

    public static ProductionSystem loadData() {
        ProductionSystem system = new ProductionSystem();

        Scanner input = new Scanner(System.in);
        System.out.println("== Clean Company ==");
        System.out.println("= Productivity System =");
        System.out.println("Write the data for each period... \nRecommendation use (,) don't use (.)");
        System.out.println("------------------------------------");

        try {
            for (int periods = 0; periods < 3; periods++) {
                System.out.println("PERIOD " + (periods + 1));

                System.out.print("Write the unit price per sale \n -> ");
                float unitPricePerSale = input.nextFloat();

                System.out.print("Write production level \n -> ");
                float productionLevel = input.nextFloat();

                System.out.print("Write the labor cost per hour \n -> ");
                float laborCostPerHour = input.nextFloat();

                System.out.print("Write the numbers of hours used \n -> ");
                float numberOfHoursUsed = input.nextFloat();

                System.out.print("Write the total raw material cost \n -> ");
                float totalRawMaterialCost= input.nextFloat();

                System.out.print("Write the depreciation \n -> ");
                float depreciation = input.nextFloat();

                System.out.print("Write the bills \n -> ");
                float bills = input.nextFloat();

                Period period = new Period((periods + 1),
                        unitPricePerSale,
                        productionLevel,
                        laborCostPerHour,
                        numberOfHoursUsed,
                        totalRawMaterialCost,
                        depreciation,
                        bills);

                system.addProductivityPeriod(period);
            }
        } catch (Exception e) {
            System.out.println("Invalid data!");
        }

        return system;
    }
}
