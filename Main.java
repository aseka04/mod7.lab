
public class Main {
    public static void main(String[] args) {
        TravelBookingContext context = new TravelBookingContext(new AirplaneCost());
        int cost = context.getTravelCost(1, ServiceClass.business, false, false);

        //context.ChangeTravelCost();

    }
}
