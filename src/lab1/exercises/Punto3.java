package lab1.exercises;

import lab1.exercises.exercise3.Period;
import lab1.exercises.exercise3.ProductionSystem;

public class Punto3 {
    public static void main(String[] args) {
        ProductionSystem system = loadData();

        system.getProductivityPeriods().forEach(period -> {
            System.out.println("Period: " + period.getNumberPeriod() +
                    "\n\tTotal Productivity Index: " + period.totalProductivityIndex() +
                    "\n\tLabor Productivity Index: " + period.laborProductivityIndex() +
                    "\n\tRaw Material Productivity Index: " + period.rawMaterialProductivityIndex()
            );
        });

        system.variationPercentageAgainstPreviousPeriod().forEach(variationInPercentage -> {
            System.out.println("Period  Against previous period:" + variationInPercentage + "%");
        });

    }

    public static ProductionSystem loadData() {
        ProductionSystem system = new ProductionSystem();
        Period period1 = new Period(1,14.5f,25.2f,10.3f,14,28.6f,2.5f,18.7f);
        Period period2 = new Period(2,14f,24.8f,10.9f,12,20.3f,4.5f,14.3f);
        Period period3 = new Period(3,12.5f,22f,8f,11,38.6f,2.9f,16.5f);

        system.addProductivityPeriod(period1);
        system.addProductivityPeriod(period2);
        system.addProductivityPeriod(period3);

        return system;
    }
}
