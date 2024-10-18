

public interface IShippingStrategy {
    double calculateShippimg(double ves, int col);
}


class StandardShippingStrategy implements IShippingStrategy{
    public double calculateShippimg(double ves, int col){
        int calculate_per_kg = 700;
        return calculate_per_kg+ves;

    }
}
class ExpressShippingStrategy implements IShippingStrategy{
    public double calculateShippimg(double ves, int col){
        int calculate_per_kg = 1400;
        return calculate_per_kg+ves;
    }
}
class InternationalShippingStrategy implements IShippingStrategy{
    public double calculateShippimg(double ves, int col){
        int calculate_per_kg = 2100;
        return calculate_per_kg+ves;

    }

}
class DeliveryContext {
    private IShippingStrategy shippingStrategy;
    public DeliveryContext(IShippingStrategy shippingStrategy){
        this.shippingStrategy = shippingStrategy;
    }

    public double getShippingStrategy(double ves, int col) {
        return this.shippingStrategy.calculateShippimg(ves, col);
    }

    public void setShippingStrategy(IShippingStrategy shippingStrategy){
        this.shippingStrategy = shippingStrategy;
    }
}