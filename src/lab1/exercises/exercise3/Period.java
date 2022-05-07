package lab1.exercises.exercise3;

public class Period {
    private int numberPeriod;
    private float unitPricePerSale;
    private float productionLevel;
    private float laborCostPerHour;
    private float numberOfHoursUsed;
    private float totalRawMaterialCost;
    private float depreciation;
    private float bills;

    public Period(int numberPeriod, float unitPricePerSale, float productionLevel, float laborCostPerHour, float numberOfHoursUsed, float totalRawMaterialCost, float depreciation, float bills) {
        this.numberPeriod = numberPeriod;
        this.unitPricePerSale = unitPricePerSale;
        this.productionLevel = productionLevel;
        this.laborCostPerHour = laborCostPerHour;
        this.numberOfHoursUsed = numberOfHoursUsed;
        this.totalRawMaterialCost = totalRawMaterialCost;
        this.depreciation = depreciation;
        this.bills = bills;
    }

    public float totalProductivityIndex() {
        return (unitPricePerSale * productionLevel) / (laborCostPerHour + totalRawMaterialCost + depreciation + bills);
    }

    public float rawMaterialProductivityIndex() {
        return (unitPricePerSale * productionLevel) / totalRawMaterialCost;
    }

    public float laborProductivityIndex() {
        return (unitPricePerSale * productionLevel) / (laborCostPerHour * numberOfHoursUsed);
    }

    public int getNumberPeriod() {
        return numberPeriod;
    }
}
