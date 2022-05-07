package lab1.exercises.exercise3;

import java.util.ArrayList;

public class ProductionSystem {
    private ArrayList<Period> productivityPeriods;

    public ProductionSystem() {
        this.productivityPeriods = new ArrayList<>();
    }

    public void addProductivityPeriod(Period period) {productivityPeriods.add(period);}


    public ArrayList<Period> getProductivityPeriods () {
        return productivityPeriods;
    }

    public ArrayList<Float> variationPercentageAgainstPreviousPeriod() {
        ArrayList<Float> variations = new ArrayList<>();

        for (int numberPeriod = 0; numberPeriod < productivityPeriods.size(); numberPeriod++) {
            if (numberPeriod == 0) {
                variations.add(0f);
            } else {
                float variation = (productivityPeriods.get(numberPeriod).totalProductivityIndex() - productivityPeriods.get(numberPeriod - 1).totalProductivityIndex()) / productivityPeriods.get(numberPeriod - 1).totalProductivityIndex();
                variations.add(variation * 100);
            }
        }

        return variations;
    }
}
