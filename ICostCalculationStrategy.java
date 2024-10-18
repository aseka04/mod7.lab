public interface ICostCalculationStrategy {
    int CalculateCost(int passengers, ServiceClass serviceClass, boolean hasDiscount,
                       boolean hasBagagge);
}
enum ServiceClass{
    business,
    econom

}
class AirplaneCost implements ICostCalculationStrategy{
    public int CalculateCost(int passengers, ServiceClass serviceClass, boolean hasDiscount,
                       boolean hasBagagge )  {
        int cost = 0;
        switch (serviceClass){
            case ServiceClass.business:
                cost = 1000 + passengers;
                break;
            case ServiceClass.econom:
                cost = 500+passengers;
                break;
            default:
                //throw new Exception("not selected class");
        }
        return cost;
    }
}
