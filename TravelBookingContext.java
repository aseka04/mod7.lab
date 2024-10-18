public class TravelBookingContext {
    private ICostCalculationStrategy costCalculation;

    public TravelBookingContext(ICostCalculationStrategy costCalculation) {

    }

    public void ChangeTravelCost(ICostCalculationStrategy costCalculation) {
        this.costCalculation = costCalculation;
    }

    public int getTravelCost(int passengers, ServiceClass serviceClass, boolean hasDiscount,
                             boolean hasBagagge) {
        return this.costCalculation.CalculateCost(passengers, serviceClass, hasDiscount, hasBagagge);
    }
}
